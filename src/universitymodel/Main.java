package universitymodel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Student> students = Arrays.asList(
          new Student("Samuel Osei", 101381, Year.YEAR_FOUR)
          , new Student("Martha Owusu", 104481, Year.YEAR_THREE)
          , new Student("Faustina Prah", 111381, Year.YEAR_FOUR)
          , new Student("Abigail Asare", 121381, Year.YEAR_FOUR)
          , new Student("Ebenezer Gyan", 101481, Year.YEAR_TWO)
          , new Student("Emmanuel Obeng", 101389, Year.YEAR_FOUR)
          , new Student("Christiana Asare", 171382, Year.YEAR_ONE)
          , new Student("Maame Ankomah", 151388, Year.YEAR_TWO)
          , new Student("Alex Ntim ", 104461, Year.YEAR_THREE)
          , new Student("Joyce Addy", 155181, Year.YEAR_ONE)
          , new Student("Inactus Brown", 111981, Year.YEAR_FOUR)
          , new Student("Constance Lomotey", 171781, Year.YEAR_ONE)
          , new Student("Hans Koomson", 108381, Year.YEAR_FOUR)
          , new Student("Alberta Tandoh", 100381, Year.YEAR_TWO)
        );

        Lecturer lecturer_one = new Lecturer("Benjamin Wiredu", Subject.ENGLISH_LANGUAGE);
        Lecturer lecturer_two = new Lecturer("Prince Boakye", Subject.PROGRAMMING);

        List<Student> first_year = new ArrayList<>();
        List<Student> thirdfourth_year = new ArrayList<>();
        List<Student> fourth_year = new ArrayList<>();



        for(Student student: students){

            if(student.getYear() == Year.YEAR_ONE){
                first_year.add(student);
            }
        }

        for(Student student: students){

            if(student.getYear() == Year.YEAR_THREE || student.getYear() == Year.YEAR_FOUR){
                thirdfourth_year.add(student);
            }
        }

        String lit = "";

        for(Student student: students){

            if(student.getYear() == Year.YEAR_FOUR){
                lit = student.getStudentName();
                if(lit.startsWith("A") || lit.startsWith("E") || lit.startsWith("I") || lit.startsWith("O") || lit.startsWith("U") ||
                        lit.startsWith("a") || lit.startsWith("e") || lit.startsWith("i") || lit.startsWith("o") || lit.startsWith("u")) {
                    fourth_year.add(student);
                }
            }
        }




        Course Intro_to_Programming = new Course(lecturer_one, first_year, CourseType.FIRST_YEAR, "Intro to Programming");
        Course Advanced_Gardening = new Course(lecturer_two, thirdfourth_year, CourseType.FOURTH_YEAR, "Advanced_Gardening");
        Course Physics = new Course(lecturer_one, fourth_year, CourseType.FOURTH_YEAR, "Physics");
        System.out.println(Physics.getStudents());
    }
}
