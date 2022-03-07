// Scott Shannon                            25 JAN 2022                            Rock-paper-scissors        

// import java.util.*;

// // The purpose of this code is to allow the user to play rock paper scissors against a computer that randomly generates an choice.

// public class RockPaperScissors {
//     public static void main(String[] args) {
//         double user_num;
//         // init user_choice

//         System.out.println("Welcome to Rock, Paper, Scissors!");
//         // welcome user

//         System.out.println();

//         Scanner input = new Scanner(System.in);
//         // init the scanner

//         System.out.print("Please make a choice, you must enter 1 for rock, 2 for paper, or 3 for scissors: ");
//         // ask for choice for user

//         user_num = input.nextDouble();
//         // save user input to variable

//         input.close();
//         // close the scanner

//         int computer_choice = (int) Math.floor(Math.random() * 3) + 1;
//         // generate random int value from 0 to 3

//         // compare user and computer choice
//         if (user_num == computer_choice) {
//             System.out.println("Looks like a tie this time!");
//         } else if (user_num == 1) {
//             System.out.println("You chose 1.");
//             if (computer_choice == 2) {
//                 System.out.println("The computer chose " + computer_choice + ". Better luck next time...");
//             } else {
//                 System.out.println("The computer chose " + computer_choice + ", You're the lucky winner!");
//             }
//         } else if (user_num == 2) {
//             System.out.println("You chose 2.");
//             if (computer_choice == 3) {
//                 System.out.println("The computer chose " + computer_choice + ". Better luck next time...");
//             } else {
//                 System.out.println("The computer chose " + computer_choice + ", You're the lucky winner!");
//             }
//         } else if (user_num == 3) {
//             System.out.println("You chose 3.");
//             if (computer_choice == 2) {
//                 System.out.println("The computer chose " + computer_choice + ". Better luck next time...");
//             } else {
//                 System.out.println("The computer chose " + computer_choice + ", You're the lucky winner!");
//             }
//         } else {
//             System.out.println("Try again.");
//         }
//     }
// }