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
public class giveaway {
    public static void main(String args[]) //driver function
    {
        int size=0;
        int sum=0;
        int jmlhB=0;
        int sisaB=0;
     
        System.out.println("Masukkan jmlh barang!");
    Scanner scan = new Scanner(System.in);
    String barang = scan.nextLine();
    System.out.println("Masukkan penerima dan jumlah barang diterima!");
    String orang = scan.nextLine();
    
    jmlhB = Integer.parseInt(barang); 
    String arrSplit[] = orang.split(" ");
    
    size =arrSplit.length;
    for(int i=0; i<size; i++){
    sum = sum + Integer.parseInt(arrSplit[i]);}
    sisaB = jmlhB-sum;
    kombP(sisaB,size);
    
    }
    
     static int fact(int n){    
     int f=1;
  for(int i=1;i<=n;i++){    
     f=f*i;    
  }     
  return f;
 }  
     
    public static void kombP(int n, int r){
    int hasil = fact(n+r-1)/fact(n)/fact(r-1);
    System.out.println(hasil);
    }
}
