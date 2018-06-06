package com.company;

import java.util.Random;
import java.util.Scanner;

public class eliza2 {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        boolean quit = false;
        String output = ""; //reformat
        System.out.print("good day. any problem? ");

        do {
            int index = random.nextInt(2);
            System.out.print("enter response. q-quit: "); //cause outside right?
            String answer = keyboard.nextLine();

            if (answer.equals("q")) {
                quit = true;
                break; //!
            }

            String[] answerarray = answer.split(" "); //String how are you feeling today? i am sad
            for (int i = 0; i < answerarray.length; i++) {
                if (answerarray[i].equalsIgnoreCase("me")) { //equals
                    answerarray[i] = "you";
                }
                if (answerarray[i].equalsIgnoreCase("my")) {
                    answerarray[i] = "your";
                }
                if (answerarray[i].equalsIgnoreCase("i")) {
                    answerarray[i] = "you";
                }
                if (answerarray[i].equalsIgnoreCase("am")) {
                    answerarray[i] = "are";
                }
            }
            for (int i = 0; i < answerarray.length; i++) {
                output += answerarray[i] + " ";
            }

            String[] hedges = {"Please tell me more", "Many of my patients tell me the same thing", "It is getting late, maybe we had better quit."};
            String[] qualifier = {"Why do you say that ", "You seem to think that ", "So, you are concerned that "};

            //System.out.print(qualifier[index] + " " + output + " "); //with help*/
            // //clear tryin to be simple?

            int selection = random.nextInt(2);
            switch (selection) {
                case 0: {
                    System.out.println(qualifier[index] + output);
                    break;
                }
                case 1: {
                    System.out.println(hedges[index] + output);
                    break;
                }
            }
            //System.out.print(qualifier[index] + " " + output + " ");
            //System.out.print(output);
            //System.out.print(selection);
            output = "";
        } while (quit == false);
    }
}
