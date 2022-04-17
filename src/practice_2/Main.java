package practice_2;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
 //       String output_string = Input_from_keyboard.keyboard_input(); //output of the buffered element as STRING
//        System.out.println("I am the buffered string from keyboard as chars " + output_string);

//       String_to_Integer string_to_integer = new String_to_Integer();
        // String output_string = Input_from_keyboard.keyboard_input();

        int comp_number = random();

        int buffered_int = String_to_Integer.conversion_to_integer(); //returns integer from the keyboard input
        // !!!without exception to non-numeric chars
        // System.out.println("\nYou have entered " + buffered_int);





        if (buffered_int == comp_number) {
            System.out.println("You win");
        }
        else if (buffered_int < comp_number) {
            System.out.println("You have lost");
        }
        else {
            System.out.println("Draw");
        }









//        System.out.println("I am integer from keyboard " + string_to_integer.conversion_to_integer());

        // int converted_to_int = String_to_Integer.conversion_to_integer();

    }

    public static int random() {
        Random generated_number = new Random();
        int integer_number = generated_number.nextInt(9) + 1;
        System.out.println("Computer-generated # is " + integer_number);
        return integer_number;

    }


}
