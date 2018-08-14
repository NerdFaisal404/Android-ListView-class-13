package bd.edu.nww.listviewdemo.model;

public class Student {
    private String studentName;
    private String studentRollNo;

    public Student(String studentName, String studentRollNo) {
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(String studentRollNo) {
        this.studentRollNo = studentRollNo;
    }
}
