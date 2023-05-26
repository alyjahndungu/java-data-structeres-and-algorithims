package practise;

public class NumberOccurence {
    //write a program that returns the number of occurences in an array of integers
    public static void main(String[] args) {
        int [] numbers = {3, 3,  5, 9, 5, 2, 1,0, 1};
         int searchNumber = 3;
        System.out.println(getNumberOccurence(numbers, searchNumber));

    }

    public  static  int getNumberOccurence (int [] numbers, int searchNumber){
        int occ = 0;
        for (int i =0 ;  i <  numbers.length; i++)
              if(searchNumber == numbers[i])
                  occ++;

        return occ;
    }
}
