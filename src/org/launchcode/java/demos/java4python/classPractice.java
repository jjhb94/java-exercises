package org.launchcode.java.demos.java4python;

public class classPractice {

    public static int firstAndLastSum(int[] array){

        int first = array[0];
        int last = array.length;
        return first + last;

    }

    public static void main(String[] args) {
        int[] a1 = {1,2,5};
        int[] a2 = new int[2]; // this is where you can create an empty list of zeros in an array
        a2[0] = 42;
        a2[1] = 25;

        int result = firstAndLastSum(a1);


        System.out.println(result);
        System.out.println(firstAndLastSum(a2));
    }

}
