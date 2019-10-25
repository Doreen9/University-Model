package universitymodel;

public class Student {
    private String studentName;
    private int studentId;
    private Year year;

    @Override
    public String toString() {
        return "Student Name: " + studentName + " " +
                 "Student ID: " + studentId + " " +
                "Student Year: " + year + "\n";
    }

    public Student(String studentName, int studentId, Year year) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.year = year;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public Year getYear() {
        return year;
    }
}
