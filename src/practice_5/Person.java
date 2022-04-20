package practice_5;

public class Person {
    String fullName;
    int age;

    public void move(){
        System.out.println("Такой-то  Person говорит");
//        System.out.printf("Name: %s \tAge: %d\n", fullName, age);

    }
    public void talk(){
        System.out.println("Такой-то  Person говорит");
    }

    // constructor_1
    public Person() {
    }

    // constructor_2
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }


    //getter + setter options -> to declare Object Person(fullName, age)

//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}
