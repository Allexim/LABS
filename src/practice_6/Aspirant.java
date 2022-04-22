package practice_6;

class Aspirant extends Student {


  void Aspirant() {
       super.Student();
       scientific_work();
    }

    void scientific_work() {
       //do smth.
        System.out.println("Scientific Work of the Postgraduate Student");
    }

    @Override
    int getScholarship(double averageMark) {
        int stipend;
        if (averageMark == 5) stipend = 200;
        else stipend = 180;
        return stipend;
    }
}
