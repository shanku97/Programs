package com.practicePrograms;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MissingAlphabet {
 
    public static void main(String[] args) {
        // User input for the string to know length
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string to know the length:");
        String userInput = sc.nextLine();
        // We must close input stream
        sc.close();
        System.out.println("You entered: " + userInput);
        String userInputs=userInput.toLowerCase(); 
        // Replacing whitespace to empty as we are concerned about alphabets
        userInput= userInputs.replaceAll(" ", "");
        System.out.println("User input without spaces :"+userInput);
        // Creating a String array containing each character of user input
        String [] inputStringArray = userInput.split("");
        // Creating a String array containing alphabets
        String alphabets[]= "abcdefghijklmnopqrstuvwxyz".split("");
        // Creating HashSet to find intersections
        HashSet<String> s1 = new HashSet<String>(Arrays.asList(inputStringArray));
        HashSet<String> s2 = new HashSet<String>(Arrays.asList(alphabets));
        System.out.println("User Input in set :"+s1);
        System.out.println("Alphabets :"+s2);
        // Intersection of above sets
        s2.removeAll(s1);
        // Missing alphabets
        System.out.println("Missing alphabets :"+ s2);
                 
         
    }
}