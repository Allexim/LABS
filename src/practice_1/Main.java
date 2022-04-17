package practice_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("The programme of computing of the sum of 3 integer numbers\n");

        // declares an Array of integers.
        int[] array_new;
        int num = 3;                //size of array

// allocating memory for 3 integers.
        array_new = new int[num];

        int sum_of_int;


        // accessing the elements of the specified array
        for (int i = 0; i < array_new.length; i++) {
            System.out.print("Input #" + (i+1) + ": ");

            array_new[i] = number_output();


        }



        System.out.println("");
        printArray(array_new);
        System.out.println("");

        Array_Printer data_array = new Array_Printer();
        data_array.printArray(array_new);
        System.out.println("");



        System.out.println("");

        Compute compute = new Compute();
        System.out.println("Summary = " + compute.sumArray(array_new));




    }

    // Input a number from the keyboard and return its' value as integer
    public static int number_output() {
        Scanner scanner = new Scanner(System.in);
        int user_number = scanner.nextInt();
        return user_number;
    }

    //method to print an array, taking array as an argument
    private static void printArray(int[] intArray){
        System.out.println("Array contents printed through method:");
        //print individual elements of array using enhanced for loop
        for(int val: intArray)
            System.out.println(val + " ");
    }


}
