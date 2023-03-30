package practise;


public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 4, 5, 5, 7, 8};
        int result = removeDuplicates(arr);
        System.out.println("Result: " + result) ;
    }

    private static int removeDuplicates(int[] arr) {
        if (arr.length <= 2) {
            return arr.length;
        }
        int prev = 1;
        int curr = 2;

        while (curr < arr.length) {
            if (arr[curr] != arr[prev] || arr[curr] != arr[prev - 1]) {
                prev++;
                arr[prev] = arr[curr];
            }
            curr++;
        }
        return prev + 1;


    }
}
