import java.util.InputMismatchException;
import java.util.Scanner;

public class Utility {
    public static void displayOptions(EmployeeManager manager){
       try {
           Scanner scanner = new Scanner(System.in);
           int userInput;
           do {
               System.out.print("Enter 1 to add an Employee \n" +
                       "Enter 2 to update an Employee's data \n" +
                       "Enter 3 to delete an Employee's data \n" +
                       "Enter 4 to view Data base \n" +
                       "Enter 0 to leave : ");
               userInput = scanner.nextInt();
               switch (userInput){
                   case 1 -> {
                       manager.addEmployee();
                       System.out.println("-".repeat(30));
                   }
                   case 2 -> {
                       System.out.println("-".repeat(30));
                       manager.updateEmployee();
                   }
                   case 3 -> {
                       System.out.println("-".repeat(30));
                       manager.removeEmployee();
                   }
                   case 4 -> {
                       manager.printDataBase();
                   }
                   case 0 -> {
                       System.out.println("...Exiting");
                       System.out.println("-".repeat(30));
                   }
                   default -> {
                       System.out.println("Kindly enter a valid number");
                       System.out.println("-".repeat(30));
                   }
               }

           }while (userInput != 0);
       } catch (InputMismatchException e){
           System.out.println("Kindly enter a number");
       }
    }
}
