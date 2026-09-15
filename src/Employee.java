public class Employee {

    private String employeeName;
    private int employeeId ;
    private String department ;

    public Employee(int employeeId ,String employeeName ,  String department){
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.department = department;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



    @Override
    public String toString() {
        return "{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
