package practice_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        // declare dependancy of a Superclass and a Subdued class
       Student student_heir = new Aspirant();


        Scanner scan=new Scanner(System.in);

        System.out.println();
        System.out.print("Input an average mark: ");
        double x =  scan.nextDouble();

        System.out.print("\n The stipend rate for the postgraduate student: " + student_heir.getScholarship(x));

        Student student = new Student();
        System.out.print("\n The stipend rate for the student: " + student.getScholarship(x));


//        ArrayList<Student> university = new ArrayList<>();
//
//        university.add(new Student());
//        university.add(new Aspirant());


//        for (Student  : university) {
//            university.
//        }

//        Aspirant postgraduate=new Aspirant();
//       postgraduate.Aspirant();



    }


}
