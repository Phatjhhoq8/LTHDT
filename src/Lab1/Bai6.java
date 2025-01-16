package Lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai6 {
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
	public static boolean check(int a) {
		if(a<2) return false;
		for(int i=2;i<=Math.sqrt(a);i++) if(a%i==0) return false;
		return true;
	}
	public static String bin(int a) {
		StringBuilder res=new StringBuilder();
		while(a>0) {
			if((a&1)==1) res.append("1");
			else res.append("0");
			a>>=1;
		}

		return res.reverse().toString();
	}
	public static void main(String agrs[]) {
		Scanner sc=new Scanner(System.in);
		int a=nhapsonguyen(sc);
		if(check(a)) {
//			System.out.println(a+" la so nguyen to va co dang nhi phan la: "+Integer.toBinaryString(a));
			System.out.println(a+" la so nguyen to va co dang nhi phan la: "+bin(a));
		}else System.out.println(a+" khong la so nguyen to!");
		sc.close();
	}
}
