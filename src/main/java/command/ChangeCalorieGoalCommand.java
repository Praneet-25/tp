

package command;

import activeedge.userdetails.UserDetailsList;
import activeedge.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static activeedge.Storage.saveLogsToFile;
import static activeedge.userdetails.UserDetailsList.detailsList;

/**
 * This class represents a command to change the user's calorie goal.
 * It allows the user to input a new calorie goal within a specified range
 * and updates the user details accordingly.
 */
public class ChangeCalorieGoalCommand {

    /**
     * Executes the command to change the user's calorie goal.
     * Prompts the user to input a new calorie goal, validates the input,
     * and updates the user details accordingly. Logs the change and saves
     * it to a file.
     *
     * @throws ActiveEdgeException if there is an error executing the command.
     */
    public static void execute() throws ActiveEdgeException {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String date = currentDateTime.format(dateFormatter);
        String time = currentDateTime.format(timeFormatter);

        for (int i = 0; i < detailsList.size(); i++) {
            UserDetails userDetails = UserDetailsList.detailsList.get(i);
            if (userDetails.toString().startsWith("Calorie Goal")) {
                UserDetailsList.delete(i);
            }
        }

        Scanner scanner = new Scanner(System.in);

        int newCalorieGoal = 0;
        int i = 0;
        while (i < 1) {
            System.out.println("Please input your new calorie goal: ");
            try {
                newCalorieGoal = Integer.parseInt(scanner.nextLine());
                if (newCalorieGoal >= 1 && newCalorieGoal <= 10000) {
                    AddCalorieGoalCommand addCalorieGoalCommand = new AddCalorieGoalCommand(newCalorieGoal, date, time);
                    addCalorieGoalCommand.execute();
                    System.out.println("You have successfully changed your calorie goal!");
                    saveLogsToFile("data/data.txt");
                    i++;
                } else {
                    System.out.println("Please input a whole number between 1 and 10000!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input a whole number between 1 and 10000!");
            }
        }
    }
}



