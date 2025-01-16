package Lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai5 {
	public static float nhapsonguyen(Scanner sc) {
		float a;
		while(true) {
			try {
				System.out.println("Vui long nhap so nguyen: ");
				a=sc.nextFloat();
				break;
			}catch(InputMismatchException e) {
				System.out.println("Nhap khong hop le!");
				sc.nextLine();
			}
		}
		return a;			
	}
	public static void solve(float a,float b,float c) {
		if(a==0) {
			if(b==0) {
				if(c==0) System.out.println("Phuong trinh co vo so nghiem!");
				else System.out.println("Phuong trinh vo nghiem!");
			}else {
				System.out.println("Nghiem cua phuong trinh la: "+(-c/b));
			}
		}else {
			float denta=b*b-4*a*c;
			if(denta<0) System.out.println("Phuong trinh vo nghiem!");
			else if(denta==0) System.out.println("Phuong trinh co nghiem kep la: "+(-b/(2*a)));
			else {
				System.out.println("Phuong trinh co hai nghiem phan biet la x1 = "+((-b+Math.sqrt(denta))/(2*a))+" va x2 = "+((-b-Math.sqrt(denta))/(2*a)));
			}
		}
	}
	public static void main(String agrs[]) {
		Scanner sc=new Scanner(System.in);
		float a=nhapsonguyen(sc),b=nhapsonguyen(sc),c=nhapsonguyen(sc);
		solve(a,b,c);
		sc.close();
	}
}
