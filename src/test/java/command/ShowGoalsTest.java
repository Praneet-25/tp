package command;

import activeedge.task.GoalTask;
import activeedge.task.TaskList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShowGoalsTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testExecute_noGoalsSet() {
        // Clear the task list before the test
        TaskList.clearTasks();

        // Create an instance of ShowGoalsCommand
        ShowGoalsCommand showGoalsCommand = new ShowGoalsCommand();

        // Execute the command
        showGoalsCommand.execute();

        // Assert that the output matches the expected message when no goals are set
        assertEquals("Current goals: \n Daily calories: 0 cal\n Daily water: 0 ml",
                outputStreamCaptor.toString().trim());
    }

    @Test
    public void testExecute_withGoalsSet() {
        // Clear the task list before setting goals
        TaskList.clearTasks();

        // Create mock goal tasks
        GoalTask calorieGoalTask = new GoalTask("Calorie Goal", 2000,
                "2024-04-12", "08:00");
        GoalTask waterGoalTask = new GoalTask("Water Goal", 2000,
                "2024-04-12", "08:00");

        // Add goal tasks to the task list
        TaskList.add(calorieGoalTask);
        TaskList.add(waterGoalTask);

        // Create an instance of ShowGoalsCommand
        ShowGoalsCommand showGoalsCommand = new ShowGoalsCommand();

        // Execute the command
        showGoalsCommand.execute();

        // Assert that the output matches the expected message with the set goals
        assertEquals("Current goals: \n Daily calories: 2000 cal\n Daily water: 2000 ml",
                outputStreamCaptor.toString().trim());
    }
}
