/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststamps;

//import java.util.Scanner;

import java.util.Arrays;

/**
 *
 * @author Hp
 */
public class apaBole {
    public static void main(String args[]){
        //Scanner scan = new Scanner(System.in);
        //int num = scan.nextLine();
        int num = 100;
        String[] hasil = new String[num];
        
        for(int a = 1; a <= num; a++){
            if(a % 3 == 0 && a % 5 == 0){
                hasil[a-1] = "ApaBole";
            } 
            else if(a % 3 == 0){
                hasil[a-1] = "Apa";
            }
            else if(a % 5 == 0){
                hasil[a-1] = "Bole";
            }
            else{
                hasil[a-1] = Integer.toString(a);
            }
        }
        System.out.println(Arrays.toString(hasil));
        
    }
}
