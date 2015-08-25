import org.fluentlenium.adapter.FluentTest;
import java.util.ArrayList;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.fluentlenium.core.filter.FilterConstructor.*;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
  	goTo("http://localhost:4567/");
  	assertThat(pageSource()).contains("Manage Your Tasks");
  }

  @Test
  public void categoryIsCreatedAndDisplayedTest() {
  	goTo("http://localhost:4567/");
    click("a", withText("Add a New Category"));
  	fill("#name").with("fun");
  	submit(".btn");
  	assertThat(pageSource()).contains("Categories");
  }

  // @Test
  // public void taskIScreatedTest(){
  // goTo("http://localhost:4567/");
  // click("a", withText("Add a New Category"));
  // fill("#name").with("fun");
  // submit(".btn");
  // click("a", withText("fun"));
  // click("a", withText("Add another task to fun"));
  // fill("#description").with("cool stuff");
  // submit(".btn");
  // assertThat(pageSource()).contains("cool stuff");
  // }
}
