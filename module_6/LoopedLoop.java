// Scott Shannon                            12 FEB 2022                            Nested-Loops(Mod-6) 

// The purpose of this code is to programmatically try to match a format in mod 6 
// public class LoopedLoop {
//     public static void main(String[] args) {

//         int amountOfRows = 7;

//         for (int i=0; i < amountOfRows; i++)
//         {
//             // padding left
//             for (int j= 0; j < 20 - 3 * i; j++) {
//                 System.out.print(" ");
//             }

//             // ascending
//             int start = 1;
//             for (int j = 0; j < i + 1; j++) {
//                 if(start < 10) {
//                     System.out.print("  " + start);	// 1, 2, 4, 8 padded with "  "
//                 } else {
//                     System.out.print(" " + start);	// 16+ padded with " "
//                 }
//                 start = start * 2;	// start is multiplied after printing
//             }

//             // descending
//             start = start / 4;	// because start was * by 2 after last ascend print
//             for (int j = 0; j < i; j++) {
//                 if(start < 10) {
//                     System.out.print("  " + start);	// 1, 2, 4, 8 padded with "  "
//                 } else {
//                     System.out.print(" " + start);	// 16+ padded with " "
//                 }
//                 start = start / 2;
//             }

//             // padding right
//             for (int j= 0; j < 20 - 3 * i; j++) {
//                 System.out.print(" ");
//             }

//             System.out.println("@");
//             System.out.println();
//             System.out.println();
            
//         }
//     }
// }