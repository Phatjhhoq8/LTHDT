package Lab1;

import java.util.Scanner;

public class Bai7 {
	public static String getName(String name) {
		int idx=name.lastIndexOf(" ");
		return name.substring(idx+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Vui long nhap ten cua ban: ");
		String name=sc.nextLine();
		System.out.println("Ten cua ban la: "+getName(name));
		sc.close();
	}
}
