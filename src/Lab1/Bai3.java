package Lab1;

import java.util.Scanner;

public class Bai3 {
	public static void nhapkitu() {
		char c;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Nhap ki tu bat ki(nhap q de dung): ");
			c=sc.nextLine().charAt(0);
			if(c=='q') {
				sc.close();
				return;
			}
			System.out.println("Ki tu vua nhap: "+c);
		}
	}
	public static void main(String agrs[]) {
		nhapkitu();
	}
}
