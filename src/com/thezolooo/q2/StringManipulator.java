package com.thezolooo.q2;
import java.lang.*;
import java.util.*;

public class StringManipulator {
    public static String removeVowels(String input)
    {

        if(input == null){
            return null;
        }
//write the logic to remove all the vowels from the supplied input string
        String s = "";
        s = input.replaceAll("[aeiou]","");
        return s;
//and return that string
//if somebody calls this method with a null value then return the null

    }
    public static void main(String[] args) {
//Create a scanner class object to take input from the user
        Scanner sc = new Scanner(System.in);
//prompt the user to enter a valid String.
        System.out.println("Enter a valid String");
        String s1 = sc.nextLine();
        System.out.println(removeVowels(s1));
//call the removeVowels method by creating an object of StringManipulator class.
//print the result
    }

}
