package deanery.student;

import deanery.Visit;
import deanery.exception.WrongHour;
import deanery.exception.WrongNumber;

public class Student {
    private String name;
    private String lastName;
    private int studentID;
    private String type;


    public Student(String name, String lastName, int studentID) {
        this.name = name;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


    public String getType() {
        return type;
    }

    public String serve(String room, Integer hour) throws WrongNumber, WrongHour {
        Visit.visitation(this, room, hour);

        return "s";
    }
}
