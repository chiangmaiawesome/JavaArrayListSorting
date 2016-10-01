package module.students;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.google.gson.Gson;
import java.util.Comparator;

/**
 *
 * @author acer
 */
public class StudentMP {

    private final String studentname;
    private final int rollno;
    private final int studentage;

    public String getStudentname() {
        return studentname;
    }

    public int getRollno() {
        return rollno;
    }

    public int getStudentage() {
        return studentage;
    }

    public StudentMP(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }

    public static Comparator<StudentMP> StuNameComparator = (StudentMP s1, StudentMP s2) -> {
        String StudentName1 = s1.getStudentname().toUpperCase();
        String StudentName2 = s2.getStudentname().toUpperCase();
        
        //ascending order
        return StudentName1.compareTo(StudentName2);
        
        //descending order
        //return StudentName2.compareTo(StudentName1);
    };

    /*Comparator for sorting the list by roll no*/
    public static Comparator<StudentMP> StuRollno = (StudentMP s1, StudentMP s2) -> {
        int rollno1 = s1.getRollno();
        int rollno2 = s2.getRollno();
        
        /*For ascending order*/
        return rollno1 - rollno2;
        
        /*For descending order*/
        //rollno2-rollno1;
    };

    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
