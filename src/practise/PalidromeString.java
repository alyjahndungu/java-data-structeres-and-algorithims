package practise;

import java.util.Scanner;

public class PalidromeString {
    public static void main(String[] args) {
        String a = "";
        StringBuilder b = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        int n = a.length();

        for (int i = n - 1; i >= 0; i--) {
            b.append(a.charAt(i));
        }

        if(a.equalsIgnoreCase(b.toString())){
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not palindrome.");
        }
    }
}
