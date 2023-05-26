package practise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharOccurence {
    public static void main(String[] args) {
        //Todo check how many times a character occurs in the given string
        String input =  "ilovejavaprogramming";
        //convert to array
        String [] inputArr  =  input.split("");
        //convert the input array to a stream
        Map<String, List<String>> collectChars = Arrays.stream(inputArr).collect(Collectors.groupingBy(s -> s));
        System.out.println(collectChars);

        //to get the actual counts of characters
        Map<String, Long> collectCounts = Arrays.stream(inputArr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collectCounts);

    }
}
