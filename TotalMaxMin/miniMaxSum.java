import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        
        //sort list
        Collections.sort(arr);
        int arrLength = arr.size();
        
        //ony sum 4 lowest or biggest number
        int sumLength = 4;
        
        //max and min length
        int maxLength = arrLength - sumLength;
        int minLength = sumLength;
        
        //long used for integer with 64 bit
        long max = 0;
        long min = 0;
        
        //min logic
        for(int n = 0; n < minLength; n++){
            min = min+arr.get(n);
        }
        
        //max logic
        for(int n = maxLength; n < arrLength; n++){
            max = max+arr.get(n);
        }
        
        //print/show
        System.out.println(min + " " + max);
    }


public static void main(String[] args) throws IOException {
	//used for java 8 or older, input example: 	[12,17,200,34,15]
	/*
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
    .map(Integer::parseInt)
    .collect(toList());

	miniMaxSum(arr);

	bufferedReader.close();
    */
    List<Integer> arr = Arrays.asList(2,-3, 5, 100, 200, 300);
    miniMaxSum(arr);
    }
}
