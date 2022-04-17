package practice_1;

public class Compute {

    int[] int_Array = new int[3];

    public int summation(int[] array_new){
        this.int_Array=array_new;

        int sum_1 = 0; // initialize sum
        int k;
        for (k = 0; k < array_new.length; k++)
            sum_1 += array_new[k];

        return sum_1;
    }

    public int sumArray(int[] intArray){
        int sum_2 = 0; // initialize sum
        int k;
        for (k = 0; k < intArray.length; k++)
            sum_2 += intArray[k];
        return sum_2;


    }

}
