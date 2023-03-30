package practise;

import java.util.Arrays;

public class KthLargestElementSorting {
    //Find the kth largest element
    public static void main(String[] args) {
        int nums[] = {3,2,1,5,6,4};
        findKthLargest(nums, 0);
    }
    public static int findKthLargest(int[] nums, int k){
        Arrays.sort(nums);
        return  nums[nums.length - k];
    }
}
