package universitymodel;

public class Lecturer {

    private String lecturerName;
    private Subject subject;


    @Override
    public String toString() {
        return "Lecturer name: " + lecturerName +
                "\nTeaching Subject: " + subject;
    }

    public Lecturer(String lecturerName, Subject subject) {
        this.lecturerName = lecturerName;
        this.subject = subject;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public Subject getSubject() {
        return subject;
    }
}
