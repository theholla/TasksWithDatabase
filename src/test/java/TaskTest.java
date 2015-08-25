import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.sql2o.*;

public class TaskTest{

	@Rule
	public DatabaseRule database = new DatabaseRule();
	// 
	// @Test
	// 	public void task_instantiatesCorrectly_true() {
	// 		Task myTask = new Task("Eat a slice of pie.", 1);
	// 		assertEquals(true, myTask instanceof Task);
	// 	}

	// @Test
	// public void task_returnsTask_givesDescription() {
	// 	Task myTask = new Task("Watch a foreign film.", 1);
	// 	assertEquals("Watch a foreign film.", myTask.getDescription());
	// }
	//
	// @Test
	// public void all_savesIntoDatabase_true() {
	// 	Task myTask = new Task("Mow the lawn", 1);
	// 	assertEquals(Task.all().get(0).getDescription(), "Mow the lawn");
	// }
	//
	// @Test
	// public void find_findsTaskInDatabase_true() {
	// 	Task myTask = new Task("Mow the lawn", 1);
	// 	Task savedTask = Task.find(myTask.getId());
	// 	assertEquals(savedTask.getDescription(), "Mow the lawn");
	// }
	//
	// @Test
	// public void save_savesCategoryIdIntoDB_true() {
	// 	Category myCategory = new Category("Household chores");
	// 	myCategory.save();
	// 	Task myTask = new Task("Mow the lawn", myCategory.getId());
	// 	myTask.save();
	// 	Task savedTask = Task.find(myTask.getId());
	// 	assertEquals(savedTask.getCategoryId(), myCategory.getId());
	// }

}
