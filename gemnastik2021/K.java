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
public class giveaway2 {
     public static void main(String args[]) //driver function
    {
        int size=0;
        int sum=0;
     
        System.out.println("Masukkan jmlh koin!");
    Scanner scan = new Scanner(System.in);
    String koin = scan.nextLine();
     
    String arrSplit[] = koin.split(" ");
    
    size =arrSplit.length;
    for(int i=0; i<size; i++){
    sum = sum + Integer.parseInt(arrSplit[i]);}
    perm(sum,arrSplit);
    }
     
      static int fact(int n){    
     int f=1;
  for(int i=1;i<=n;i++){    
     f=f*i;    
  }     
  return f;
 }  
     
    public static void perm(int n, String[] r){
    int hasil=fact(n);
    for(String num : r){
    hasil = hasil/fact(Integer.parseInt(num));
    }
    //int hasil = fact(n+r-1)/fact(n)/fact(r-1);
    System.out.println(hasil);
    }
     
}
