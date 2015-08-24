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

  // @Test
  // public void taskIsCreatedTest() {
  // 	goTo("http://localhost:4567/");
  //   click("button", withText("Add Task"));
  // 	fill("#description").with("Mow the lawn");
  // 	submit(".btn");
  // 	assertThat(pageSource()).contains("Your task has been saved.");
  // }

  // @Test
  // public void taskIsDisplayedTest() {
  // 	goTo("http://localhost:4567/");
  //   click("button", withText("Add Task"));
  // 	fill("#description").with("Mow the lawn");
  // 	submit(".btn");
  // 	click("button", withText("Go Back"));
  //   click("button", withText("View Tasks"));
  // 	assertThat(pageSource()).contains("Mow the lawn");
  // }

  // @Test
  // public void multipleTasksAreDisplayedTest() {
  // 	goTo("http://localhost:4567/");
  //   click("button", withText("Add Task"));
  // 	fill("#description").with("Mow the lawn");
  // 	submit(".btn");
  // 	click("button", withText("Go Back"));
  //   click("button", withText("Add Task"));
  // 	fill("#description").with("Buy groceries");
  // 	submit(".btn");
  // 	click("button", withText("Go Back"));
  //   click("button", withText("View Tasks"));
  // 	assertThat(pageSource()).contains("Mow the lawn");
  // 	assertThat(pageSource()).contains("Buy groceries");
  // }

  // @Test
  // public void wasNotFoundMessageShown() {
  //   goTo("http://localhost:4567/tasks/999");
  //   assertThat(pageSource()).contains("Task not found");
  // }

}
