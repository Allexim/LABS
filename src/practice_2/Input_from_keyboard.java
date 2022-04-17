package practice_2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Input_from_keyboard {

   private String str_a;

    public Input_from_keyboard(String str_a) {
        this.str_a=str_a;
    }

    public static String keyboard_input() throws Exception {
        InputStream catch_input = System.in;   // input from keyboard
        Reader read_input = new InputStreamReader(catch_input);  // reads parameters as a char-operand
        //Example of getting an error:
        // int type_int;
        //int var_read = read_input.read(type_int);
        // !!! causes the error
        //java: no suitable method found for read(byte[])
        //    method java.io.Reader.read(java.nio.CharBuffer) is not applicable
        //      (argument mismatch; byte[] cannot be converted to java.nio.CharBuffer)
        //    method java.io.Reader.read(char[]) is not applicable
        //      (argument mismatch; byte[] cannot be converted to char[])

        // !!! BufferedReader procedure converts an operators to the char

        BufferedReader read_from_buffer = new BufferedReader(read_input);


        System.out.print("\nInput number from 1 to 10: ");
        String str_a = read_from_buffer.readLine();
        System.out.println(str_a);  ///Test for correct buffering
        return str_a;
    }


}
