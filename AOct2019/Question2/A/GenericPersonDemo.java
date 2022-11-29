package PastPapers.AOct2019.Question2.A;

import java.util.ArrayList;

public class GenericPersonDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("STD1111", 6));
        students.add(new Student("STD2222", 7));
        students.add(new Student("STD3333", 12));
        students.add(new Student("STD4444", 11));
        students.add(new Student("STD5555", 10));

        ArrayList<Lecturer> lecturers = new ArrayList<>();
        lecturers.add(new Lecturer("EMP0000", "IT"));
        lecturers.add(new Lecturer("EMP2222", "SE"));
        lecturers.add(new Lecturer("EMP3333", "CSN"));
        lecturers.add(new Lecturer("EMP4444", "EE"));
        lecturers.add(new Lecturer("EMP5555", "IS"));

        GenericPerson genericPerson = new GenericPerson();
        genericPerson.displayElements(students);
        genericPerson.displayElements(lecturers);
    }
}
