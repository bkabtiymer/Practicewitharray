package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //Intitialize array
        Scanner input = new Scanner(System.in);
        int[] scores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;





////  1.Create an array to hold the numbers 1-10.
//      Sum numbers 1-10 and print total
//        for (Integer score : scores) {
//            System.out.println(score);
//        }
//    2.Loop through that array and sum the numbers 1-10, then print that total to the screen.
//        System.out.println("Please enter any 10 numbers: ");
//        for (int i = 0; i < 10; i++) {
////            Sum the numbers already stated 1-10
//          total =total +  scores[i];
////        total += scores[i]; is a shortcut i can use to keep from having to repeat total in the formula
//    }
//        System.out.println("The total of all scores is "+ total);
//


////  3.Create an array to hold 10 number inputs from the user and print that total to the screen.
//        System.out.println("Please enter any 10 numbers: ");
//        for (int i = 0; i < 10; i++) {
//            total += input.nextInt();
//            System.out.println("The total of all scores is " + total);
//
////
////        }
////  4.Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.
//        System.out.println("Please enter any 10 numbers: ");
//        for (int i = 0; i < 10; i++) {
//            total += input.nextInt();
//        }
//        System.out.println("The average of all scores is " + total / 10.0);
//
//
////  5.Create an array to store 3 names, loop through that array to print out the names.
//        String [] names= {"Johnny", "Casy", "Bob"};
//        for (String lab:names) {
//            System.out.println(lab);
//        }

////  6.Create an array with the following values: [2,5,9,0,2,1,8,5,4] Loop through the array and print out the index each time the value equals 5.
//
//            int[] values= {2,5,9,0,2,1,8,5,4 };
//            for (int i=0; i<values.length; i++)
//            {
//                if(values[i]==5)
//              System.out.println(i);
//            }
////  7.Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.
//        for (int i=10; i>=0; i--)
//        {
//            System.out.println(i);
//        }
//    8. Given the following array: ['w','t','y','h','k']
//        Loop through the array and replace the the letter 't' with the word "hello" once it's found.
        String[] replace= {"w","t","y","h","k"};
        for(int j=0;j<replace.length; j++)
        {
            if (replace[j]=="t")
                replace[j]="Hello";

        }
        for (String bal:replace) {
            System.out.println(bal);
        }



    }
}

