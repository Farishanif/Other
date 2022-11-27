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
public class probDadu {
    public static void main(String args[]) //driver function
    {
        //dadu 6 sisi dengan mata dadu berbeda nilai
        int total=0;
        int tDadu1=0;
        int tDadu2=0;
        int poss = 36;
        
    Scanner scan = new Scanner(System.in);
     String d1 = scan.nextLine();
     String d2 = scan.nextLine();
     
    String arrSplit1[] = d1.split(" ");
    String arrSplit2[] = d2.split(" ");
    
    int[] dadu1 = new int[arrSplit1.length];
    int[] dadu2 = new int[arrSplit2.length];
    
    for(int i=0; i<arrSplit1.length; i++){
    dadu1[i] = Integer.parseInt(arrSplit1[i]);
    dadu2[i] = Integer.parseInt(arrSplit2[i]);}
     
    for(int j = 0;j<arrSplit1.length; j++){
        for(int k = 0;k<arrSplit2.length; k++){
            if(dadu1[j]>dadu2[k]){
                tDadu1++;
            }else if(dadu1[j]<dadu2[k]){
                tDadu2++;
            }
            
        }
    }

    if(tDadu1>tDadu2){
    //Andi Menang(atas)
    total=tDadu1;
    System.out.println("Andi Menang dengan peluang "+total/gcdBF(total,poss)+"/"+poss/gcdBF(total,poss));
    }else if(tDadu1<tDadu2){
    //Vijay Menang(bawah)
    total=tDadu2;
    System.out.println("Vijay Menang dengan peluang "+total/gcdBF(total,poss)+"/"+poss/gcdBF(total,poss));
    }else{
    System.out.println("Imbang");
    }
    
    }
    
    public static int gcdBF(int n1, int n2) {
    int gcd = 1;
    for (int i = 1; i <= n1 && i <= n2; i++) {
        if (n1 % i == 0 && n2 % i == 0) {
            gcd = i;
        }
    }
    return gcd;
}
    
}
