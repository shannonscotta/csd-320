// Scott Shannon     Mod 9 Assignment        23 Feb 2022
// The purpose of this code is to read a 20 length int array from user input and then tell the user the highest value, lowest value, sum, and average.
// import java.util.Arrays;
// import java.util.Scanner;

// public class FillAnArray {

//     static int[] myIntArray = new int[20];

//     // declared an array of ints, bracket notation is the length of the empty array
//     public static void main(String[] args) {

//         Scanner myIntScanner = new Scanner(System.in);
//         // start scanner

//         for (int i = 0; i < 20; i++) {
//             System.out.println("Start filling your array, please enter int " + i + "/ 20 ");
//             // tell user what count they are on so they dont go crazy entering 20 ints

//             myIntArray[i] = myIntScanner.nextInt();
//             // store int into my array based off user input per loop iteration
//         }

//         myIntScanner.close();
//         // close scanner

//         System.out.println("The highest value in your array is: " + highestValue());
//         System.out.println("The lowest value in your array is: " + lowestValue());
//         System.out.println("The average value in your array is: " + averageOfNumbers());
//         System.out.println("The sum of your array is: " + sumOfNumbers());
//         // call methods and print all results to user
//     }

//     private static int highestValue() {

//         Arrays.sort(myIntArray);
//         int largestInt = myIntArray[myIntArray.length - 1];

//         return largestInt;
//     }

//     private static int lowestValue() {

//         Arrays.sort(myIntArray);
//         int smallestInt = myIntArray[0];

//         return smallestInt;
//     }

//     private static double averageOfNumbers() {

//         double total = 0;

//         for (int i = 0; i < myIntArray.length; i++) {
//             total = total + myIntArray[i];
//         }

//         double average = total / myIntArray.length;

//         return average;

//     }

//     private static int sumOfNumbers() {

//         int sum = 0;
//         for (int i : myIntArray) // one liner, no "{}" needed
//             sum += i;
//         return sum;
//     }

// }
