/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;
import static java.util.stream.IntStream.range;



/**
 *
 * @author Hp
 */
public class angkaMandiri {
    public static void main(String args[]) //driver function
    { 
        int n;
        int size;
        int ang;
        int max  = 0;
        int count = 0;
        int[] number = null;
        boolean found = false;
        
    Scanner scan = new Scanner(System.in);
     
    System.out.println("Berapa Kali Inputan?");
    String s = scan.nextLine();
    n = Integer.parseInt(s);
    String arrN[] = new String[n];
    
    ArrayList<Integer> numList = new ArrayList<Integer>();    
    
         //inputting the number
        System.out.println("Masukkan angka kelipatan dan max angka");
        for(int m=0;m<n;m++){
            arrN[m]=scan.nextLine();
        }
        
        size = arrN.length;
         for(int i=0;i<size;i++){
         String arrSplit[] = arrN[i].split(" ");
         ang = Integer.parseInt(arrSplit[0]);
         max = Integer.parseInt(arrSplit[1]);
         //System.out.println("error");
            for(int j = 2; j<=ang; j++){
                number = range(j,max+1).toArray();
                for(int k : number){
                if(k%j == 0){
                 numList.add(k); 
                }
                }
            }
             
         }
         
    for(int l=2; l<=max; l++){
        
        for(int a : numList){
        if( l == a){
            found = true;
        }
        }
        if(found == false){
        count ++;
        }found = false;}
    //System.out.println(numList);   
    System.out.println(count);
}
    
}
