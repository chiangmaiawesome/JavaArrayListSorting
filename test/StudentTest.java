/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import org.junit.Test;

/**
 *
 * @author acer
 */
public class StudentTest {

    public StudentTest() {
    }

    @Test
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

}
