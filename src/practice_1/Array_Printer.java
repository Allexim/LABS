package practice_1;

public class Array_Printer {
    public void printArray(int[] intArray){
        System.out.println("Array contents printed through method:");
        //print individual elements of array using enhanced for loop
        for(int val: intArray)
            System.out.print(val + " ");
    }

}
