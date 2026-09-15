import java.util.*;

public class EmployeeManager {
    Scanner scanner = new Scanner(System.in);
    private Map<Integer , Employee> employeeDB = new HashMap<>();


    public void addEmployee(){
        System.out.println("-".repeat(30));
        System.out.print("Enter employee name : ");
        String name = scanner.nextLine();

        System.out.print("Enter employee department : ");
        String department = scanner.nextLine();

        Employee employee = new Employee( employeeDB.size() + 1 , name , department);
        employeeDB.put(employeeDB.size() + 1 , employee);

        System.out.println("...Employee added");
    }



    public void updateEmployee(){
        System.out.print("Enter the ID of the interested Employee : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("-".repeat(30));

        if (employeeDB.containsKey(id)){
            int userInput;
            Employee interestedEmployee = employeeDB.get(id);
            do {
                System.out.print("Enter 1 to change employee name \n" +
                        "Enter 2 to change employee department \n" +
                        "Enter 0 to leave : ");
                userInput =  scanner.nextInt();
                scanner.nextLine();
                System.out.println("-".repeat(30));

                switch (userInput) {
                    case 1 -> {
                        System.out.print("Enter employee updated name : ");
                        String updatedName = scanner.nextLine();
                        interestedEmployee.setEmployeeName(updatedName);
                        System.out.println("...Updated");
                    }
                    case 2 -> {
                        System.out.print("Enter employee updated department : ");
                        String updatedDepartment = scanner.nextLine();
                        interestedEmployee.setDepartment(updatedDepartment);
                        System.out.println("...Updated");
                    }
                    case 0 -> {
                        System.out.println("...Exiting");
                        System.out.println("-".repeat(30));
                    }
                    default -> {
                        System.out.println("Kindly enter a valid number");
                    }
                }

            }while (userInput != 0);

        } else {
            System.out.println("Employee with this ID does not exist");
            System.out.println("-".repeat(30));
        }

    }


    public void removeEmployee() {
        System.out.print("Enter the ID of the employee to be removed : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (employeeDB.containsKey(id)) {
            employeeDB.remove(id);
            System.out.println("...Removed");
            System.out.println("-".repeat(30));
        } else {
            System.out.println("Employee with this ID does not exist");
        }
    }

    public void printDataBase(){
        System.out.println("-".repeat(30));
        System.out.println(employeeDB);
        System.out.println("-".repeat(30));
    }


}
