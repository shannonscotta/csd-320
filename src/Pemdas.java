// scott shannon                        5 Jan 2022 (woot woot 2022, happy new years!)                                   Module 1 programming Assignment

// The purpose of this code is to write a program in java that solves two problems and explains why the results are different

public class Pemdas{
    public static void main(String[] args) { 
        System.out.println();
        System.out.println(4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 ));
        System.out.println("And");
        System.out.println(4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 ));

    }
}

// What is the difference between the two outputs and the cause. Which is best? Why?

// one is being evaluated as a float meanwhile the other is being evaluated as in integer
// math in java is a little different depending on the type (floats and integers in this example), 
//if it does not evaluate as a whole number then it could turn into a zero or decimal, example below

// example 1: 
//         4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
//         4 * (1 -  0  +  0  -  0  +  0  -  0   +  0)
// the result of each division gets truncated


// example 2: 
//         4 * (1 -  1/3 + 1/5 - 1/7 +  1/9 - 1/11 + 1/13)
//         4 * (1 - .333 + .2 - .143 + .111 - .091 + .077)


// one is not better than the other because they are used for different situations