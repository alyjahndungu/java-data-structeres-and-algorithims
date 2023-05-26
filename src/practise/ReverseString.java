package practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String str = br.readLine();

        StringBuilder sb = usingStringBuilder(str);

        char[] arr = usingCharArray(str);

        byte[] result = byConvertingStringToBytes(str);

        System.out.println("Reverse = " + new String(arr));
        System.out.println("StringBuilder Reverse= " + sb);
        System.out.println("Byte Solution Reverse = " + new String(result));

        br.close();
    }

    /**
     * Solution 1: Using toCharArray() method with a loop
     *
     * @param str
     * @return arr of chars
     */
    private static char[] usingCharArray(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    /**
     * Solution 2: Using StringBuilder class and the inbuilt reverse() method
     *
     * @param str
     * @return reversed string
     */
    private static StringBuilder usingStringBuilder(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb;
    }

    private static String usingCharStringBuilder(String str) {
        if (str == null)  throw new IllegalArgumentException("Null is not valid input");
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--)
            sb.append(chars[i]);

        return sb.toString();
    }
    /**
     * Solution 3: Converting strings to bytes and using the getBytes() function
     *
     * @param str
     * @return reversed byte
     */
    private static byte[] byConvertingStringToBytes(String str) {
        byte[] byteString = str.getBytes();
        byte[] result = new byte[byteString.length];

        for (int i = 0; i < byteString.length; i++) {
            result[i] = byteString[byteString.length - i - 1];
        }
        return result;
    }

}
