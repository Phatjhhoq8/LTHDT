package Lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai4 {
	public static int nhapsonguyen(Scanner sc) {
		int a;
		while(true) {
			try {
				System.out.println("Vui long nhap so nguyen: ");
				a=sc.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("Nhap khong hop le!");
				sc.nextLine();
			}
		}
		return a;			
	}
	public static void main(String agrs[]) {
		Scanner sc=new Scanner(System.in);
		int a=nhapsonguyen(sc),b=nhapsonguyen(sc);
		System.out.println("Gia tri cua "+a+"+"+b+"= "+(a+b));
		sc.close();
	}
}
