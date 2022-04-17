package practice_2;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Guess the number (with cycles)\n");

        int comp_number = random();

        System.out.println("You have 3 tries to guess the number\n");


        int k=3;
        boolean match=false;
        do{

                int humNumber = scan();

                if (humNumber == comp_number) {
                    System.out.println("You win");
                    match = true;

                } else if (humNumber < comp_number) {
                    System.out.println("You have lost");
                    match = false;

                } else {
                    System.out.println("Draw");
                    match = false;

                }
                k--;

        }while(!match && k>=1);


    }

    public static int random () {
        Random generated_number = new Random();
        int integer_number = generated_number.nextInt(9) + 1;
        System.out.println("Check for computer-generated number: " + integer_number);
        return integer_number;

    }

    public static int scan () {
        System.out.print("Input number from 1 to 10: ");
        Scanner scan_number = new Scanner(System.in);
        int human_number = scan_number.nextInt();
        return human_number;

    }


}