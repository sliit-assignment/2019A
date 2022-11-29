package PastPapers.AOct2019.Question2.A;

public class Student implements IPerson{
    private String studentID;
    private int grade;

    public Student(String studentID, int grade){
        this.studentID = studentID;
        this.grade = grade;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student = " + studentID + ", Grade = " + grade);
    }
}
