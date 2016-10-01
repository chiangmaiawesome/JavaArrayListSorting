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
        ArrayList<String> arraylist1=new ArrayList<>();
        arraylist1.add("AL1: E1");
        arraylist1.add("AL1: E2");
        arraylist1.add("AL1: E3");

        //Second ArrayList
        ArrayList<String> arraylist2=new ArrayList<>();
        arraylist2.add("AL2: E1");
        arraylist2.add("AL2: E2");
        arraylist2.add("AL2: E3");

        //New ArrayList
        ArrayList<String> al= new ArrayList<>();
        al.addAll(arraylist1);
        al.addAll(arraylist2);

        //Displaying elements of the joined ArrayList
        al.stream().forEach((temp) -> {
            System.out.println(temp);
        });        
    }
    
}
