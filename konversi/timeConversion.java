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

class TimeConversion {

    public static String timeConversion(String s) {
    // AM/PM convert to 24h model
    // index
    int index1 = 0;
    int index2 = 2;
    int index3 = 8;
    
    String converted1, converted2; 
    
    // check am/pm
    char t = s.charAt(index3);
    int hour = Integer.parseInt(s.substring(index1,index2));
    
    if(t == 'P'){
        if(hour == 24){
            converted1 = "00";
        }else if(hour < 12){
            converted1 = Integer.toString(hour+12);
        }else{
            converted1 = Integer.toString(hour);
        };
    }else{
        if(hour == 12){
            converted1 = "00";
        }else if(hour > 12){
            converted1 = "0" + Integer.toString(hour-12);
        }else{
            converted1 = "0" + Integer.toString(hour);
        };
    };
    
    converted2 = s.substring(index2,index3);
    
    System.out.println(converted1+converted2);
    return converted1+converted2;
    
    }

    public static void main(String[] args) throws IOException {
         //used for java 8 or older, input example: 12:00:87PM
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String conversion = timeConversion(s);

        bufferedWriter.write(conversion);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
        */
        
        //manual input
        String time = "19:12:12AM";
        timeConversion(time);
    }
}
