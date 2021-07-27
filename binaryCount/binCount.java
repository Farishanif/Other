import java.util.*;

class BitCount{
	
   public static void main(String[] args) {
     int angka, angBin;
      Scanner scanner = new Scanner(System.in); 
     System.out.print("Ketikkan angka yang ingin dihitung binarynya:");
     angka = scanner.nextInt();
     System.out.print("Ketikkan angka binary(0/1) yang ingin dihitung totalnya:");
     angBin = scanner.nextInt();
     if(angBin == 1 || angBin == 0){
     scanInput(angka,angBin);
     }
     else{ System.out.print("HARAP PILIH 1 ATAU 0!");}
    }
  
	public static void scanInput(int number, int number2) {
	    String binary = Integer.toBinaryString(number);
	    int binarys = Integer.parseInt(binary);
	  	String temp = Integer.toString(binarys);
		int[] newGuess = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++){
	    newGuess[i] = temp.charAt(i) - '0';
		}
	    int maxSoFar = number2;
	    int total = 0;

        for (int num : newGuess){
            if (num == maxSoFar){
              total++;
            }
        }
        System.out.println(total);
	}
   
}
