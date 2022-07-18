package deanery;

import deanery.student.FullTimeStudent;
import deanery.student.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Data.createData();
        System.out.println(students);
    }
}