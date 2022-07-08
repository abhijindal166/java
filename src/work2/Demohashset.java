package work2;


import java.io.*;
import java.util.*;

//Main class
//AddingElementsToHashSet
public class Demohashset {

 // Method 1
 // Main driver method
 public static void main(String[] args)
 {
     // Creating an empty HashSet of string entities
     HashSet<String> hs = new HashSet<String>();

     // Adding elements using add() method
     hs.add("this");
     hs.add("is");
     hs.add("hashset");

     // Printing all string el=ntries inside the Set
     System.out.println("HashSet elements : " + hs);
 }
}
