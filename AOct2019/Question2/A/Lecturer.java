package PastPapers.AOct2019.Question2.A;

public class Lecturer implements IPerson{
    private String employeeID;
    private String department;

    public Lecturer(String employeeID, String department){
        this.employeeID = employeeID;
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("EmployeeID = " + employeeID + ", Department = " + department);
    }
}
