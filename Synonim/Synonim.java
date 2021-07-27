import java.util.*;

public class HelloWorld{
    String[][] Syno; 
    
    public static void add(String word, Array synonyms){
        int range = synonyms.length;
        int row = Syno.length;
	int col;
        //int col = Syno[].length;
        int x = 0;
        int n = 0;
        if (Syno.length == null){
             Syno[0][0] = word;
             for(String nam : synonyms){
               for(n = 0, n <= range ,n++){
                   Syno[0][n-1] = nam;
               }  
             }
         }
        else if (Syno.length != null){
         for(x = 0, x <= row, x++ ){
             if(Syno[x][0] == word){
	       for(String nam : synonyms){
               for(n = 0, n <= range ,n++){
		   col = Syno[].length;
                   Syno[x][n - 1 + col] = nam;
	     		}
	    	 }
	     }
	     else if(Syno[x][0] != word && Syno[x].length == null){
                Syno[x][0] = word; 
             
             for(String nam : synonyms){
               for(n = 0, n <= range ,n++){
                   Syno[x][n] = nam;
		}
               }  
             }
         }
         
    } 
    
    public static getSynonim(String huruf){
        
        return array;
    } 
     
    public static void main(String []args){
        kelas();
    }
}
