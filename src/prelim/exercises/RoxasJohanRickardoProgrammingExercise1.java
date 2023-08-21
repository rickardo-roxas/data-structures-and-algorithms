/**
 *  Name: ROXAS, Johan Rickardo
 *  Date: 22 August 2023
 * Notes:
 * The one-dimensional array is a static linear data structure.  The one-dimensional array is an implementation of the
 * List ADT. The one-dimensional array may be used to hold values/objects that are logically arranged in a linear fashion.
 * Populating the array(i.e. Putting elements in the array), sorting the elements of the array, searching an element
 * from the array based on a key,  and displaying the elements of the array are some of the operations that
 * may be performed on the list.
 * ----------------------------------------------------------------------------------------------------
 * Objective.
 * Create a simple application that uses the one-dimensional array as a data Structure.   In order to have an exercise
 * on creating implementations of operations,  a code/program for the method that implements each  operation  should be
 * written rather than using predefined methods of the array (i.e. Do not use pre-defined methods for sorting and
 * displaying elements that are predefined in Java).
 * ----------------------------------------------------------------------------------------------------
 * Activity:
 * Create an executable class that applies a Sort Algorithm and a Search algorithm on an array of Strings (i.e. names)
 * - In the code( e.g. in the main method), declare a one-dimensional array of String such that the array will be
 * populated out of data that are read from a datafile(i.e. textfile).
 * - The class should have a method that populates an array of String out of data that are read from a data file.
 * The formal parameters of the method is an array of String and a String that represents a filename.
 * - The class should have a method that implements a sort Algorithm(e.g. Selection Sort Algorithm).
 * The method for sorting should have a one-dimensional array of String as formal parameter.
 * - The class should have a method that implements a search algorithm(e.g. Linear Search algorithm).
 * The method for searching should have a one-dimensional array of String and a search key of type String as
 * formal parameters.
 * - The class should have a method that displays the elements of a one-dimensional array.
 *  - Let the program show the elements of the array before the sorting happens
 *  - Let the program show the elements of the array after sorting
 * - Let the computer accept a string to be searched from the array then let the computer specify whether the string is
 * found in the array or not.
 *  - Show that sample output/run of the program through multiple line comments in the source file
 * ( i.e. After running the programming, copy and paste the output within a comment section of the source code).
 * ----------------------------------------------------------------------------------------------------
 *  Main Algorithm:
 * (Sample only)
 *  1. Declare an array of String.
 *  2.  Populate the array of String using the method for populating the array with data that are read from a datafile.
 *  3. Display the elements of the array using the method for showing the elements of an array
 *  4. Sort the elements of the array using the method for sorting the elements of the array.
 *  5. Display the elements of the sorted array using the method for showing the elements of an array
 *  6. Display a prompt message for the user to enter a search key ( depending on your program design)
 *  7. Let the computer check if the item being searched is in the array and display an informative message
 *  regarding the result of the search.
 * ----------------------------------------------------------------------------------------------------
 * Additional Notes:
 * Using the Java programming language, the norm for creating a program that is illustrative of dealing with
 * Data Structures are as follows***:
 * 1. Create a java interface as a way to specify an Abstract Data Type(ADT) or Create an Abstract Class as a
 * way to an abstract data type
 * 2. Create a concrete class that implements the interface as a way to have a code for the Data Structure
 * (Recall: A Data Structure is based on an ADT).
 * 3. Create an application ( an executable program, hence, a class with the main method) that uses the concrete class.
 */

package prelim.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RoxasJohanRickardoProgrammingExercise1 {
    /**
     * Main entry point of the program
     * @param args command line arguments
     */
    public static void main(String[] args) {
        RoxasJohanRickardoProgrammingExercise1 myProgram;
        try {
            myProgram = new RoxasJohanRickardoProgrammingExercise1();
            myProgram.run();
        } catch (Exception e) {
            e.printStackTrace();
        } // end of try-catch
    } // end of main method

    /**
     * Controls the execution of the program.
     */
    private void run() {
        String[] names = readFromFile();
    } // end of main method

    /**
     * Reads contents from file and populates the String array.
     */
    private String[] readFromFile() {
        String[] names = new String[10];
        try {
            BufferedReader outputStream = new BufferedReader(new FileReader("names.txt"));
            String line = "";

            while ((line = outputStream.readLine()) != null) {

            } // end of while
            outputStream.close();
        } catch (IOException e1) {
            System.out.println(e1.getMessage());
            e1.printStackTrace();
        } // end of try-catch
        return names;
    } // end of readFromFile method

    /**
     * Sorts an array of String using the Balloon Sort Algorithm.
     * @param array given String array of names.
     */
    private void sortArray(String[] array) {

    } // end of sortArray method

    /**
     * Indexes an element from the String array of names using the Linear Search Algorithm.
     * @param keyword given search keyword
     * @param array given String array of names.
     * @return boolean value (true if found, false if not)
     */
    private boolean searchElement(String keyword, String[] array) {
        boolean result = false;
        for (int index = 0; index < array.length; index++) {
            result = keyword.equalsIgnoreCase(array[index]);
        } // end of for
        return result;
    } // end of searchElement method

    /**
     * Displays elements of the array.
     * @param array given String array of names
     */
    private void showElements(String[] array) {
        for (String elements: array) {
            System.out.println(elements + "\n");
        } // end of for
    } // end of showElements method
} // end of class RoxasJohanRickardoProgrammingExercise1
