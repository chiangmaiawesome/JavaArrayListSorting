/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general.collections.test;

import java.util.*;
import org.junit.*;

/**
 *
 * @author acer
 */
public class GeneralCollectionsTests {

    public GeneralCollectionsTests() {
    }

    @Test
    public void combineArrayLists() {
        //First ArrayList
        ArrayList<String> arraylist1 = new ArrayList<>();
        arraylist1.add("AL1: E1");
        arraylist1.add("AL1: E2");
        arraylist1.add("AL1: E3");

        //Second ArrayList
        ArrayList<String> arraylist2 = new ArrayList<>();
        arraylist2.add("AL2: E1");
        arraylist2.add("AL2: E2");
        arraylist2.add("AL2: E3");

        //New ArrayList
        ArrayList<String> al = new ArrayList<>();
        al.addAll(arraylist1);
        al.addAll(arraylist2);

        //Displaying elements of the joined ArrayList
        al.stream().forEach((temp) -> {
            System.out.println(temp);
        });
    }

    @Test
    public void compareArrayList() {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("hi");
        al1.add("How are you");
        al1.add("Good Morning");
        al1.add("bye");
        al1.add("Good night");

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Howdy");
        al2.add("Good Evening");
        al2.add("bye");
        al2.add("Good night");

        //Storing the comparison output in ArrayList<String>
        ArrayList<String> al3 = new ArrayList<>();
        al1.stream().forEach((temp)-> {
            al3.add(al2.contains(temp) ? "Yes" : "No");
        });
        System.out.println(al3);

        //Storing the comparison output in ArrayList<Integer>
        ArrayList<Integer> al4 = new ArrayList<>();
        al1.stream().forEach((temp2) -> {
            al4.add(al2.contains(temp2) ? 1 : 0);
        });
        System.out.println(al4);
    }

}
