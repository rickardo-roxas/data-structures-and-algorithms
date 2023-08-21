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
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

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
        Scanner keyboard = new Scanner(System.in);
        String[] names = readFromFile();
        String[] sortedAscending;
        String[] sortedDescending;
        byte choice = 0;
        boolean validChoice = false;
        boolean result;
        String keyword = "";

        showIntroduction();


        showMenu();
        while (!validChoice) {
            System.out.print("Type your choice: ");
            choice = Byte.parseByte(keyboard.nextLine());

            if (choice > 6) {
                System.out.println("Invalid value. Try again.");
            } else {
                validChoice = true;
            } // end of if-else

            switch (choice) {
                case 1 -> {
                    showElements(names);
                } // end of case 1
                case 2 -> {
                    sortedDescending = sortArrayDescending(names);
                    showElements(sortedDescending);
                } // end of case 2
                case 3 -> {
                    sortedAscending = sortArrayAscending(names);
                    showElements(sortedAscending);
                } // end of case 3
                case 4 ->{
                    System.out.print("Input the name you wish to search: ");
                    keyword = keyboard.nextLine();
                    result = searchElement(keyword, names);
                    if (!result) {
                        System.out.println(keyword + " is not in the array.");
                    } else {
                        System.out.println(keyword + " is in the array.");
                    } // end of if-else
                } // end of case 4
                case 5 -> {
                    System.out.println("Thank you for using my program.");
                    System.exit(0);
                } // end of case 5
            } // end of switch-case
        } // end of while
    } // end of run method

    /**
     * Reads contents from file and populates the String array.
     */
    private String[] readFromFile() {
        String[] names = new String[15];
        try {
            Scanner inputStream = new Scanner(new File("names.txt"));
            int counter = 0;

            while (inputStream.hasNextLine()) {
                names[counter] = inputStream.nextLine();
                counter++;
            } // end of while
            inputStream.close();
        } catch (IOException e1) {
            System.out.println(e1.getMessage());
            e1.printStackTrace();
        } // end of try-catch
        return names;
    } // end of readFromFile method

    /**
     * Sorts an array of String using the Balloon Sort Algorithm in descending lexicographic order.
     * @param array given String array of names.
     */
    private String[] sortArrayDescending(String[] array) {
        String[] sortedArray = copyArray(array);
        for (int x = 0; x < sortedArray.length - 1; x++) {
            for (int y = x + 1; y < sortedArray.length; y++) {
                if (sortedArray[x].compareToIgnoreCase(sortedArray[y]) < 1) {
                    String temp = sortedArray[x];
                    sortedArray[x] = sortedArray[y];
                    sortedArray[y] = temp;
                } // end of if
            } // end of 2nd for
        } // end of for
        return sortedArray;
    } // end of sortArrayDescending method

    /**
     * Sorts an array of String using the Balloon Sort Algorithm in ascending lexicographic order.
     * @param array given String array of names.
     */
    private String[] sortArrayAscending(String[] array) {
        String[] sortedArray = copyArray(array);
        for (int x = 0; x < sortedArray.length - 1; x++) {
            for (int y = x + 1; y < sortedArray.length; y++) {
                if (sortedArray[x].compareToIgnoreCase(sortedArray[y]) > 1) {
                    String temp = sortedArray[x];
                    sortedArray[x] = sortedArray[y];
                    sortedArray[y] = temp;
                } // end of if
            } // end of 2nd for
        } // end of for
        return sortedArray;
    } // end of sortArrayAscending method

    /**
     * Indexes an element from the String array of names using the Linear Search Algorithm.
     * @param keyword given search keyword
     * @param array given String array of names.
     * @return boolean value (true if found, false if not)
     */
    private boolean searchElement(String keyword, String[] array) {
        boolean result = false;
        for (String element : array) {
            result = keyword.equalsIgnoreCase(element);
        } // end of for
        return result;
    } // end of searchElement method

    /**
     * Displays elements of the array.
     * @param array given String array of names
     */
    private void showElements(String[] array) {
        for (String elements: array) {
            System.out.println(elements);
        } // end of for
        System.out.println();
    } // end of showElements method

    /**
     * Manually copies an array
     * @param array given array of String
     * @return duplicate of given array
     */
    private String[] copyArray(String[] array) {
        String[] copiedArray = new String[array.length];
        for (int index = 0; index < array.length; index++) {
            copiedArray[index] = array[index];
        } // end of for
        return copiedArray;
    } // end of copyArray method

    /**
     * Introduces the user to the program
     */
    private void showIntroduction() {
        System.out.println("Welcome to Name Searcher and Sorter.");
        System.out.println("This program sorts an existing array of first names.");
        System.out.println("This program will ask for the following:");
        System.out.println("\tInteger value given from the menu.");
        System.out.println("\tString value of name to be searched.\n");
    } // end of showIntroduction method

    /**
     * Displays possible user inputs for the program to execute.
     */
    private void showMenu() {
        System.out.println("1. Display names in original (unsorted order)");
        System.out.println("2. Display names in descending order");
        System.out.println("3. Display names in ascending order");
        System.out.println("4. Search for name");
        System.out.println("5. Exit the program\n");
    } // end of showMenu method
} // end of class RoxasJohanRickardoProgrammingExercise1
