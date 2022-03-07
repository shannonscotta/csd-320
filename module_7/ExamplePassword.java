//Scott Shannon                                 MOD 7 Java Assignment                                 13 FEB 2022

// The purpose of this code is to allow a user to input a password and check it against what is described on line 21
// import java.util.Scanner;

// public class ExamplePassword { 
//     public static void main(String[] args) {

//         Scanner passwordScanner = new Scanner(System.in); // create scanner object

//         System.out.println("Please enter a valid password: "); // allow user to input a password

//         String userPassword = passwordScanner.next(); // declare a variable of type string then read the input and save

//         passwordScanner.close(); // close scanner

//         boolean approvedPassword = passwordChecker(userPassword); // type cast

//         if (!approvedPassword) {
//             System.out.println(
//                     "Try again. Please remember that your password must contain a minimum of 8 characters, one uppercase letter, one lowercase letter, and one number.");
//         } else {
//             System.out.println("Good job! This is a valid password.");
//         }

//     }

//     private static boolean passwordChecker(String userPassword) {
//         boolean containsNumber = false;
//         boolean containsLowerCase = false;
//         boolean containsUpperCase = false;

//         if (userPassword.length() < 8) {
//             System.out.println("Your password must have at least eight characters.");
//             return false;
//         }

//         for (int i = 0; i < userPassword.length(); i++) {
//             char c = userPassword.charAt(i);
//             if (c >= '0' && c <= '9') { // checking char value
//                 containsNumber = true;
//             } else if (c >= 'a' && c <= 'z') { // chars are awesome
//                 containsLowerCase = true;
//             } else if (c >= 'A' && c <= 'Z') {
//                 containsUpperCase = true;
//             }
//         }

//         if (containsNumber && containsLowerCase && containsUpperCase) {
//             return true;
//         } else {
//             return false;
//         }
//     }

// }