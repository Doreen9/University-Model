package universitymodel;


import java.util.List;

public class Course {

    private Lecturer lecturer;
    private List<Student> students;
    private CourseType type;
    private String CourseName;

    @Override
    public String toString(){

        return "Lecturer Details: ( " + lecturer + " ) " +
                "Students List { " + students + " } " +
                "Course Type: " + type +
                "Course Name: " + CourseName;
    }

    public Course(Lecturer lecturer, List<Student> students, CourseType type, String CourseName) {
        this.lecturer = lecturer;
        this.students = students;
        this.type = type;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public List<Student> getStudents() {
        return students;
    }

    public CourseType getType() {
        return type;
    }

    public String getCourseName() {
        return CourseName;
    }
}
