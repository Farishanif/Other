import java.io.IOException;
import java.util.Scanner;

class Angka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean keadaan = true;
		while (keadaan) {
		
			int choose;
			
			try {
			Scanner scan = new Scanner(System.in);

			System.out.println("\n proses :");
			System.out.println("1. penentuan genap/ganjil");
			System.out.println("2. penentuan angka prima");
			System.out.println("3. proses hitung bilangan");
			System.out.println("4. Keluar");
			System.out.println("pilih proses :");
			choose = scan.nextInt();
			
			if (choose == 1) {
				ganjilngenap();
			}
			else if (choose == 2) {
				prima();
			}
			else if (choose == 3) {
				operasihitung();
			}
			else if (choose == 4) {
				keadaan = false;
			}
			else {
				System.out.println("inputan salah");
			}
			
			//////////////salah///////////////////
		//throw IOException{choose = scan.nextInt();}// 
				//choose = scan.nextInt();//
				//throw IOException e//
			/////////////////////////////////////
			}
			
			catch(Exception e){
				System.out.println("Terdapat kesalahan input,\n Silahkan coba lagi");
				continue;
			}
			
		}
	}
			
			
	public static void ganjilngenap() {
		Scanner scan = new Scanner(System.in);
		System.out.println("masukkan angka :");
		int ang = scan.nextInt();

		if (ang % 2 == 0) {
			System.out.println("angka " + ang + " adalah angka genap! \n");
		} else {
			System.out.println("angka " + ang + " adalah angka ganjil! \n");
		}

	}

	public static void prima() {
		Scanner scan = new Scanner(System.in);
		System.out.println("masukkan angka :");
		int ang = scan.nextInt();

		boolean prima = true;
		int temp;
		for (int i = 2; i <= ang / 2; i++) {
			temp = ang % i;
			if (temp == 0) {
				prima = false;
			}
		}

		if (prima && ((ang > 0) && (ang != 1))) {
			System.out.println("Bilangan adalah Prima");
		} else {
			System.out.println("Bilangan bukan Prima");
		}
	}
	
		public static void operasihitung() {
		 
                double ang1, ang2; 
                Scanner scanner = new Scanner(System.in); System.out.print("Masukkan Angka Pertama:");
    
                double num1 = scanner.nextDouble(); System.out.print("Masukkan Angka Kedua:"); 
                double num2 = scanner.nextDouble(); System.out.print("Pilih Operasi (+, -, *, /): "); 
                char operator = scanner.next().charAt(0); scanner.close(); 
                double output; 
                switch(operator) 
                { 
                    case '+': 
                    output = num1 + num2;
                    break; 
                    case '-': 
                    output = num1 - num2;
                    break; 
                    case '*': 	
                    output = num1 * num2; 
                    break; 
                    case '/': 	
                    output = num1 / num2; 
                    break; 
     
                    default: 
                    System.out.printf("Input Operator Salah");
                    return; 
                } 
                System.out.println(num1+" "+operator+" "+num2+": "+output); 
                }
}
