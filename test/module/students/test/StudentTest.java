package module.students.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import module.students.Student;
import module.students.StudentMP;
import java.util.*;
import org.junit.*;

/**
 *
 * @author acer
 */
public class StudentTest {

    public StudentTest() {
    }

    @Ignore
    public void testCollectionsSort() {
        List<Student> arraylist = new ArrayList<>();
        arraylist.add(new Student(223, "Chaitanya", 26));
        arraylist.add(new Student(245, "Rahul", 24));
        arraylist.add(new Student(209, "Ajeet", 32));

        Collections.sort(arraylist);

        arraylist.stream().forEach((str) -> {
            System.out.println(str.toJson());
        });
    }

    @Test
    public void testMultipleProperties() {
        List<StudentMP> arraylist = new ArrayList<>();
        arraylist.add(new StudentMP(101, "Zues", 26));
        arraylist.add(new StudentMP(505, "Abey", 24));
        arraylist.add(new StudentMP(809, "Vignesh", 32));

        /*Sorting based on Student Name*/
        System.out.println("Student Name Sorting:");
        Collections.sort(arraylist, StudentMP.StuNameComparator);

        arraylist.stream().forEach((str) -> {
            System.out.println(str.toJson());
        });

        /* Sorting on Rollno property*/
        System.out.println("RollNum Sorting:");
        Collections.sort(arraylist, StudentMP.StuRollno);
        arraylist.stream().forEach((str) -> {
            System.out.println(str.toJson());
        });
    }

}
