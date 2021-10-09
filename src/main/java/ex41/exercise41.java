package ex41;

/*
 *  UCF COP3330 Fall 2021 Assignment 41 Solution
 *  Copyright 2021 Jenna Busch
 */

//pseudocode
//I need to begin this program with reading in the input text
//put input text into an array of the names
//then create a method to sort the names and count the number of inputs
//the method should compare the letters and reprint them in the correct order

import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;

public class exercise41 {


    public static void main(String[] args) throws IOException {

        //this will hold the number of names from the input file
        int numNames = 0;

        // pass the path to the file as a parameter
        File file = new File("src/main/java/ex41/exercise41_input.txt");

        //fill array list with names
        ArrayList<String> names = new ArrayList<>();
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            names.add(scan.nextLine().trim());
        }

        //sort the name list
        Collections.sort(names);

        //get num of names
        for (int i = 0; i < names.size(); i++) {

            numNames++;
        }

        //next we have to create the output file and print to it
        FileWriter outputSolution = new FileWriter("src/main/java/ex41/exercise41_output.txt");
        outputSolution.write("Total of " + numNames + " names\n");
        outputSolution.write("-----------------\n");

        //print the actual names
        for (int i = 0; i < names.size(); i++) {
            outputSolution.write(names.get(i)+"\n");
        }
        //close the file
        outputSolution.close();
    }
}
