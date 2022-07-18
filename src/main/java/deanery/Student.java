package deanery;

public class Student {
    private String name;
    private String lastName;
    private int studentID;

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


}
