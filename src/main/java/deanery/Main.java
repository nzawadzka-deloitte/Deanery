package deanery;

import deanery.exception.WrongHour;
import deanery.exception.WrongNumber;
import deanery.student.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) throws WrongNumber, WrongHour {
        List<Student> students = StudentData.createData();
       /* for (int i=0; i<students.size(); i++){
            System.out.println(students.get(i));
        }



        System.out.println(students.get(2).getType());

        */
        students.get(3).serve("A123", 7);

    }
}