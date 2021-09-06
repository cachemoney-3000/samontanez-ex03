/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise03;

import java.util.Scanner;

public class Solution03 {
    /*
    Create a program
    print "What is the quote?"
    scanner that reads user input,
    'quote' = stores the quote.
    print "Who said it?"
    scanner reads a new input from user,
    'author' = stores the name.
    print "<author> says, "<quote>.""
     */

    public static void main(String[] args) {
        System.out.print("What is the quote? ");
        Scanner input1 = new Scanner(System.in);
        String quote = input1.nextLine();

        System.out.print("Who said it? ");
        Scanner input2 = new Scanner(System.in);
        String author = input2.nextLine();

        System.out.println(author + " says, " + "\""+ quote +"\"");

    }
}