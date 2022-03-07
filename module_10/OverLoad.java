// Scott Shannon     Mod 10 Assignment        27 Feb 2022
//Write four overloaded methods that return the average of an array
// import java.util.Arrays;

// public class OverLoad {

//     public static void main(String[] args) {

//         // first create the arrays
//         short [] shortArray = {1, 2, 3}; // the array has 3 elements
//         short averageShort = average(shortArray); // this calls the second method; returned average is stored
//         int [] intArray = {2, 4, 6, 8, 10}; // the array has 5 elements
//         int averageInt = average(intArray);
//         long [] longArray = {1001, 2002, 3003, 4004}; // the array has 4 elements
//         long averageLong = average(longArray);
//         double [] doubleArray = {1.2, 2.2, 3.2, 4.2, 5.2, 6.2, 7.2, 8.2}; // the array has 8 elements
//         double averageDouble = average(doubleArray);
//     }

//     public static short average(short [] array){
//         short total = 0;

//         for (int i = 0; i < array.length; i++) {
//             //total = total + array[i]; // type mismatch from int to short, not compiling
//           	total = (short) (total + array[i]); // type cast
//         }

//         //short average = total / array.length; // type mismatch from int to short, not compiling
//       	short average = (short) (total / array.length); // type cast

//         System.out.println("The array is : " + Arrays.toString(array));
//         System.out.println("The average of the array is : " + average);

//         return average;
//     }

//     public static int average(int [] array){
//         int total = 0;

//         for (int i = 0; i < array.length; i++) {
//             total = total + array[i];
//         }

//         int average = total / array.length;

//         System.out.println("The array is : " + Arrays.toString(array));
//         System.out.println("The average of the array is : " + average);

//         return average;
//     }

//     public static long average(long [] array){
//         long total = 0;

//         for (int i = 0; i < array.length; i++) {
//             total = total + array[i];
//         }

//         long average = total / array.length;

//         System.out.println("The array is : " + Arrays.toString(array));
//         System.out.println("The average of the array is : " + average);

//         return average;

//     }

//     public static double average(double [] array){
//         double total = 0;

//         for (int i = 0; i < array.length; i++) {
//             total = total + array[i];
//         }

//         double average = total / array.length;

//         System.out.println("The array is : " + Arrays.toString(array));
//         System.out.println("The average of the array is : " + average);

//         return average;
//     }

// }