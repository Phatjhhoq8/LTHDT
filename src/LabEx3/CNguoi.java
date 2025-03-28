package LabEx3;

import java.util.Scanner;

public class CNguoi {
	private String id,hten,ngay;
	private char phai;
	public CNguoi() {
		id=new String();
		hten=new String();
		ngay=new String();
		phai='@';
	}
	public CNguoi(CNguoi a) {
		id=new String(a.id);
		hten=new String(a.hten);
		ngay=new String(a.ngay);
		phai=a.phai;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap id: ");
		id=sc.nextLine();
		System.out.println("Vui long nhap hten: ");
		hten=sc.nextLine();
		System.out.println("Vui long nhap ngay (ngay-thang-nam): ");
		ngay=sc.nextLine();
		System.out.println("Vui long nhap gioi tinh (M-Nam,F-Nu): ");
		phai=sc.nextLine().toUpperCase().charAt(0);
	}
	public String getName() {
		return new String(hten);
	}
	public int getAge() {
		return 2025-Integer.parseInt(ngay.substring(6));
	}
	public void in() {
		System.out.println("Id: "+id);
		System.out.println("Ho ten: "+hten);
		System.out.println("Ngay sinh (ngay-thang-nam): "+ngay);
		System.out.println("Gioi tinh (M-Nam,F-Nu): "+phai);
	}
	public static void main(String[] args) {
		CNguoi c1 = new CNguoi();
		System.out.println("Nhap thong tin nguoi c1: ");
		c1.nhap();
		System.out.println("Thong tin cua nguoi c1: ");
		c1.in();
		CNguoi c2 = new CNguoi(c1);
		System.out.println("Thong tin cua nguoi c2: ");
		c2.in();
	}
}
