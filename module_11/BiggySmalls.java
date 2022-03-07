// scott shannon               Mod 11 Java Assignment               1 March 2022   
// return the two location elements of numbers (largest amd smallest) from 2D arrays

import java.util.Arrays;

public class BiggySmalls {

    public static void main(String[] args) {

        // declare and init myDoubleTestingArray
        double[][] myDoubleTestingArray = { { 0, 1 }, { 2, 3 } };


        // pass params into function for largest
        int[] resultOfLargestDouble = locateLargest(myDoubleTestingArray);
        // print row and col of highest number from double array
        System.out.println(Arrays.toString(resultOfLargestDouble)); //should print [1,1]
        // print row and col of smallest number from double array
        int[] resultOfSmallestDouble = locateSmallest(myDoubleTestingArray);
        System.out.println(Arrays.toString(resultOfSmallestDouble)); //should print [0,0]


        int[][] myIntTestingArray = { { 0, 1 }, { 2, 3 } };


        int[] resultOfLargestInt = locateLargest(myIntTestingArray);
        System.out.println(Arrays.toString(resultOfLargestInt)); //should print [1,0]

        int[] resultOfSmallestInt = locateSmallest(myIntTestingArray);
        System.out.println(Arrays.toString(resultOfSmallestInt)); //should print [0,0]
    }

    /*
     * returns the location of the largest element in the array passed to the method
     * returning a one-dimensional
     * array that contains two location elements.
     */

     
    public static int[] locateLargest(double[][] arrayParam) {
        int row = 0;
        int column = 0;

        double largestNumber = arrayParam[0][0];;
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[0].length; j++) {
                if (arrayParam[i][j] > largestNumber) {
                    largestNumber = arrayParam[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        int[] finalArray = { row, column };

        return finalArray;

    }

    public static int[] locateLargest(int[][] arrayParam) {

        int row = 0;
        int column = 0;

        int largestNumber = arrayParam[0][0];;
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[0].length; j++) {
                if (arrayParam[i][j] > largestNumber) {
                    largestNumber = arrayParam[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        int[] finalArray = { row, column };

        return finalArray;

    }

    /*
     * returns the location of the smallest element in the array passed to the
     * method returning a one-dimensional
     * array that contains two location elements.
     */

    public static int[] locateSmallest(double[][] arrayParam) {
        int row = 0;
        int column = 0;

        double smallestNumber = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[0].length; j++) {
                if (arrayParam[i][j] < smallestNumber) {
                    smallestNumber = arrayParam[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        int[] finalArray = { row, column };

        return finalArray;

    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int row = 0;
        int column = 0;

        int smallestNumber = arrayParam[0][0];;
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[0].length; j++) {
                if (arrayParam[i][j] < smallestNumber) {
                    smallestNumber = arrayParam[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        int[] finalArray = { row, column };

        return finalArray;

    }

}
