package practise;

public class SecondLargest {
    public static void main(String[] args) {
        int[] score =  {23, 55, 68, 32, 66, 22, 76, 45, 55, 88, 27};
        int firstLargest = score[0];
        int secondLargest = score[0];

        for (int j : score) {
            if (j > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = j;
            } else if (j > secondLargest) {
                secondLargest = j;
            }

        }

        System.out.println("Second Largest Score" + " " + secondLargest);
    }

}
