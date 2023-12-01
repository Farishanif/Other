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

class MinPlusZero {

    public static void minusPlusZeros(List<Integer> arr) {

        //sort list
        Collections.sort(arr);
        
        //default value
        int n = arr.size();
        int i1 = 0, i2 = 0, i3 = 0;
        
        //find i1 (proportion of zeros)
        for(int i : arr){
            if(i == 0){
                i1++;
            } 
        }
 
        if(i1 == 0){
            //find i2 (proportion of negative values)
            for(int i : arr){
                if(i < 0){
                    i2++;
                }
            }
            //find i3 (proportion of positive values)
            i3 = n - i2;
            //print/show each proportion
            System.out.println(new Double(i3) / n);
            System.out.println(new Double(i2) / n);
            System.out.println(new Double(i1) / n);
        }else{
            //find i2 (proportion of negative values)
            i2 = arr.indexOf(0);
            //find i3 (proportion of positive values)
            i3 = n - (i2 + i1);
            //print/show each proportion
            System.out.println(new Double(i3) / n);
            System.out.println(new Double(i2) / n);
            System.out.println(new Double(i1) / n);
        }
        
    }

  public static void main(String[] args) throws IOException {
  	  //used for java 8 or older, input example: 8	,	[-3,-2,-1,0,0,0,1,2] 
      /*
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(bufferedReader.readLine().trim());

      List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
      .map(Integer::parseInt)
      .collect(toList());
      
      minusPlusZeros(arr);

      bufferedReader.close();
      */
      
      //manual input
      //int n = 10;
      List<Integer> arr = Arrays.asList(2,-3, 5, -1,0,0,0,1,-2,2);

      minusPlusZeros(arr);

  }
}

