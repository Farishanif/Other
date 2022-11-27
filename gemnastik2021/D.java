/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class angkaSpecial {
    public static void main(String args[]) //driver function
    { 
    Scanner scan = new Scanner(System.in);
     String s1 = scan.nextLine();
     String s2 = scan.nextLine();
     
     spesial(s1,s2);  
}

    
    public static void spesial(String S1, String S2){
    String arrSplit1[] = S1.split(" ");
    String arrSplit2[] = S2.split(" ");

int min = Integer.parseInt(arrSplit1[0]);
int max = Integer.parseInt(arrSplit1[1]);

int a = Integer.parseInt(arrSplit2[0]);
int b = Integer.parseInt(arrSplit2[1]);
int c = Integer.parseInt(arrSplit2[2]);
int count = 0;


for(int m = min; m<=max;m++){
    if (m % a == 0 && m % b == 0 || m % a == 0 && m % c == 0 || m % b == 0 && m % c == 0){
        count += 0;}
    else{
        if(m % a == 0 || m % b == 0 || m % c == 0){
            count += 1;
        }else{
            count += 0;}
        }
}
    System.out.println(count);
    }
}




