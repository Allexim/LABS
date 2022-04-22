package practice_6;

class Student {

    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    //test for correct invokation
    void Student(){
        System.out.println("This is student method inside of Student class");
        //all the required methods could be transmitted through...

    }

    //stipend
     int  getScholarship(double averageMark) {
        int stipend;
        this.averageMark = averageMark;
        if (averageMark == 5) stipend = 100;
        else stipend = 80;
        return stipend;
    }


    double getAverageMark() {
        return averageMark;
    }

    void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }


}
