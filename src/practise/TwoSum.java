//package practise;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class TwoSum {
//    public static void main(String[] args) {
//
//    }
//
//    public int[] twoSum(int[] numbers, int target){
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (map.containsKey(numbers[i])){
//                int index = map.get(numbers[i]);
//                result[0] = index+1;
//                result[1] = i + 1;
//                break;
//            }else {
//                map.put(target - numbers[i], i);
//            }
//
//        }
//
//        return result;
//    }
//}
