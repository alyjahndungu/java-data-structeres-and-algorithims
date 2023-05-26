package practise;

public class ArrayExample {
    //write a program that displays the SUM, PRODUCT and AVERAGE of an integer array
    // [1, 2, -3,  5, 7]
    public static void main(String[] args) {
        int [] arr = {1, 2, -3,  5, 7};
        int sum = 0;
        int product = 1;
        double average;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            product *= arr[i];
        }

        average = (double) sum / arr.length;
        System.out.println("Sum =" + sum + " Product = " + product + " Average = " + average);
    }
}
