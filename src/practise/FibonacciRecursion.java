package practise;

import java.util.Scanner;

public class FibonacciRecursion {
    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 0;

    static void printFibonacciSeries(int count){
        if (count > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(" "  + n3);
            printFibonacciSeries(count - 1);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count;
        System.out.println("Enter the limit:");
        count = sc.nextInt(); // getting the max limit of count
        System.out.print(n1 + " " + n2); // printing 0 and 1
        printFibonacciSeries(count - 2); // count-2 because 2 numbers are already printed
        sc.close();

    }
}
