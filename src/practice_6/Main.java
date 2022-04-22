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

        System.out.println();


        //BEGIN of task #5
       ArrayList<Student> university = new ArrayList<>();

        university.add(new Student());
        university.add(new Aspirant());


        for (Student  stud_count : university) {
            stud_count.getScholarship(x);
        }
        //END of task #5


    }


}
