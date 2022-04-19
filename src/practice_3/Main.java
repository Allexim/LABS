package practice_3;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.println("The Multiplying of the elements of array \n");

        // declares an Array of integers.
        int[][] matrix2d;
        System.out.println();
        System.out.print("Enter number of rows: ");
        int row_number=String_to_Integer.conversion_to_integer();                //rows
        System.out.println();
        System.out.print("Enter number of columns: ");
        int col_number=String_to_Integer.conversion_to_integer();                //columns


// allocating memory for the elements of array.
        matrix2d = new int[row_number][col_number];


//    Assigning a random numbers
        System.out.println();
        System.out.println("Array inline:");
        for (int i = 0; i < row_number; i++) {
            for (int j = 0; j < col_number; j++) {
                matrix2d[i][j] = random();
                System.out.print(matrix2d[i][j] +" ");
            }
            System.out.println("");
        }





        //also we have to create the single-array matrix for the multiplication' result
        long product[];
        product = new long[row_number];

        // let's set "1"-value matrix
        int k=0;
        while (k<row_number) {
            product[k] =1;
            k++;
        }

        System.out.println();
        for (int i = 0; i < row_number; i++) {
            for (int j = 0; j < col_number; j++) {
                product[i] *= matrix2d[i][j];
            }
            System.out.print("Result per row = " + product[i] +" ");
            System.out.println("");
        }

        // recursive multiplying
        int n=0;
        long multi=1;
        while (n<row_number) {
            multi *= product[n];
            n++;
        }
        System.out.print("Final multiplication = " + multi + "\n");



    }

    public static int random () {
        Random generated_number = new Random();
        int integer_number = generated_number.nextInt(9) + 1;
       // System.out.println("Check for computer-generated number: " + integer_number);
        return integer_number;

    }



}
