package practice_5;

public class Main {

    static String fullName;
    static int age;

   public static void main(String[] args) {
        // write your code here
        Person person_1 = new Person();

        person_1.move();


        Person person_2 = new Person(fullName, age);
        person_2.talk();




    }
}
