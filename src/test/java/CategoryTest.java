import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class CategoryTest {

	@Test
	public void getName_returnsName_true() {
		Category testCategory = new Category("Home");
		assertEquals("Home", testCategory.getName());
	}

	@Test
	public void getId_returnsCategoryId() {
		Category testCategory = new Category("Home");
		assertTrue(Category.all().size() == testCategory.getId());
	}
}