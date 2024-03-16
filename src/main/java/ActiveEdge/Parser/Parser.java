package ActiveEdge.Parser;

import java.util.Scanner;
import ActiveEdge.Command.ActiveEdgeException;
import ActiveEdge.Command.HelpCommand;
import ActiveEdge.Command.LogWaterCommand;
import ActiveEdge.Command.ViewWaterIntakeCommand;
import ActiveEdge.Task.Task;
import ActiveEdge.Task.TaskList;
import ActiveEdge.Command.*;


public class Parser {

    public void handleInput(String input) throws ActiveEdgeException {
        String inputTrimmed;
        if (input.contains("help")) {
            new HelpCommand();
        } else if (input.startsWith("log")) {
            String[] parts = input.substring(2).split(" ");
            inputTrimmed = parts[1].trim();
            if (inputTrimmed.startsWith("w")) {
                if (parts.length < 3) {
                    System.out.println("Invalid log water command format. Example: log w/500");
                    return;
                }
                String quantityString = parts[2];
                try {
                    int quantity = Integer.parseInt(quantityString);
                    if (quantity <= 0) {
                        System.out.println("Water quantity must be a positive integer.");
                        return;
                    }
                    LogWaterCommand logWaterCommand = new LogWaterCommand(quantity);
                    logWaterCommand.execute(new TaskList(), null, null);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid water quantity. Please provide a valid integer.");
                }
            }else if(inputTrimmed.startsWith("m")) {
                new LogMealCommand(input);
            }else if (input.startsWith("list")) {
                if (input.trim().length() > 4) { //list meals
                    new ListMealsCommand();
                }
            }
        } else if (input.startsWith("show")) { //show calories, water, and goals
            String[] parts = input.split(" ");
            inputTrimmed = input.trim();
            if (inputTrimmed.startsWith("c")) { //shows calorie
                new ShowCaloriesCommand();
            } else if (inputTrimmed.startsWith("w")) { //shows water
                ViewWaterIntakeCommand viewWaterIntakeCommand = new ViewWaterIntakeCommand();
                viewWaterIntakeCommand.execute(new TaskList(), null, null);


            } else if (inputTrimmed.startsWith("g")) {  //shows goals

            } else {
                System.out.println("Hello!\n");
            }
        }
    }

}
