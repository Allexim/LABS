package practice_2;

public class String_to_Integer extends Input_from_keyboard {

    private  int output_int;

    public String_to_Integer(String str_a) {

        super(str_a);
    }
    public static int conversion_to_integer() throws Exception {
        String output_string = Input_from_keyboard.keyboard_input();
        int number = Integer.parseInt(output_string);
        try{
       //     int number = Integer.parseInt(output_string);  - old
            System.out.println("I am the string-to-integer variable " +number);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        return number;

    }


 //   private static boolean isNumeric(String str){
//        return str != null && str.matches("[0-9.]+");
//   }




}
