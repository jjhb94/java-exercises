package org.launchcode.java.studios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); // this is for input where the word input is the input object
        HashMap<Character, Integer> letterIndex = new HashMap<>(); //this is a hash map where a character links: to a number or character count


        System.out.println("Please enter some text: ");

        String sometext = input.nextLine();  //store the user input into a string object 'sometext'


        char[] charactersInString = sometext.toCharArray();  // then, we convert the string into an array of characters = ['a','p','p','l','e']

        //for (char i=0; i < charactersInString.length; i++){
        //System.out.println("h");
        for (char i : charactersInString) {  // for each character in the input string ( now character array )
            if (!letterIndex.containsKey(i)) { // AND if the character is not in in the character array again,
                letterIndex.put(i, 1);        // then, set the value to 1
            }else{
                letterIndex.put(i, letterIndex.get(i)+1); // if the letter is in the character array, then place the character into the map, and it's index +1 )
            }    //             character,  integer
        }
        for ( Map.Entry<Character, Integer> i : letterIndex.entrySet() ) {  // for each key value pair in the HashMap letterIndex(entrySet),
            System.out.println(i.getKey() + ": " + i.getValue());           // print the key value pair on a new line
        }

        //
        //letterIndex.entrySet().forEach(n -> System.out.println(String.format("%s:\t%s", n.getKey(), n.getValue()))); // THIS IS A LOOP
        //entry set will allow you to use the 'get' key and 'get value' methods
        //forEach is a lambda function where 'n' the current item in the hashmap or array list
        //%s is a placeholder where \t is a tab for  formatting
        //  ---  THIS IS MATHEWS METHOD  -----



    }
}


