package practice_1;

public class Compute {

    int[] int_Array = new int[3];

    public int summation(int[] array_new){
        this.int_Array=array_new;

        int sum = 0; // initialize sum
        int k;
        for (k = 0; k < array_new.length; k++)
            sum += array_new[k];

        return sum;
    }

    public int sumArray(int[] intArray){
        int sum = 0; // initialize sum
        int k;
        for (k = 0; k < intArray.length; k++)
            sum += intArray[k];
        return sum;


    }

}
