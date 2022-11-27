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
public class hitungIsiMatriks {
     
        
      public static void main(String args[]) //driver function
    {
        String data1;
        int n;
        
        Scanner scan = new Scanner(System.in);
         //inputting the total of number
        System.out.println("Input Ukuran Matriks dan berapa kali pencarian?");
        data1 = scan.nextLine();
        String split1[] = data1.split(" ");
        
        int el0 = Integer.parseInt(split1[0]); 
        int el1 = Integer.parseInt(split1[1]);
        int el2 = Integer.parseInt(split1[2]);
//        System.out.println(el0);
//        System.out.println(el1);
        
        int[][] matriks = new int[el0][el1];
        String[] isiM = new String[el1];
        System.out.println("Masukan isi matriks setiap "+el1+" angka");
        for(int i=0; i<el0; i++){
            isiM[i]=scan.nextLine();
            String isiMSplit[] = isiM[i].split(" ");
         for(int j=0;j<el1;j++){
             for(String s : isiMSplit){
                 int ang = Integer.parseInt(s);
             matriks[i][j]=ang;
             }
         }
        }
        
        //matriks chooser
        String arrN[] = new String[el2];
        
         //inputting the number
        System.out.println("Masukkan x1,y1,x2,y2");
        for(int i=0;i<el2;i++){
            arrN[i]=scan.nextLine();
        }
         int size = arrN.length;
         for(int j=0;j<size;j++){
         String arrSplit[] = arrN[j].split(" ");
             int x1 = Integer.parseInt(arrSplit[0]) - 1; 
             int y1 = Integer.parseInt(arrSplit[1]) - 1;
             int x2 = Integer.parseInt(arrSplit[2]) - 1;
             int y2 = Integer.parseInt(arrSplit[3]) - 1;
            hitung(x1,y1,x2,y2,matriks);
         }
        
      }
      
       public static void hitung(int x1, int y1, int x2, int y2, int[][] matriks){
           int tx1;
           int tx2;
           int ty1;
           int ty2;
           int sum=0;

       if(x1<x2){tx1=x1; tx2=x2;}
       else{tx1=x1; tx2=x2;}
       if(y1>y2){ty1=y2; ty2=y1;}
       else{ty1=y1; ty2=y2;}
       
       for(int i=tx1;i<=tx2; i++){
           for(int j=ty1;j<=ty2; j++){
               sum = sum + matriks[i][j];
           }
       }
       System.out.println(sum);
           
       }
}
