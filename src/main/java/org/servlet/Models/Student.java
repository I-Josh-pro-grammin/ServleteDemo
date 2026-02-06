package org.servlet.Models;

public class Student {
    private int studentId;
    private String studentFirstname;
    private String StudentLastname;

    public Student() {

    }

    public Student(int studentId, String studentFirstname, String studentLastname) {
        this.studentId = studentId;
        this.studentFirstname = studentFirstname;
        StudentLastname = studentLastname;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentFirstname() {
        return studentFirstname;
    }

    public String getStudentLastname() {
        return StudentLastname;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentFirstname(String studentFirstname) {
        this.studentFirstname = studentFirstname;
    }

    public void setStudentLastname(String studentLastname) {
        StudentLastname = studentLastname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentFirstname='" + studentFirstname + '\'' +
                ", StudentLastname='" + StudentLastname + '\'' +
                '}';
    }
}
