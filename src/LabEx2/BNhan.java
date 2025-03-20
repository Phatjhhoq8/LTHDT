package LabEx2;

import java.util.Scanner;

public class BNhan {
	private String hten,gtinh;
	private int nsinh;
	private float cnang;
	BNhan() {
		hten=new String();
		gtinh=new String();
		nsinh=0;
		cnang=0;
	}
	BNhan(BNhan a) {
		hten=new String(a.hten);
		gtinh=new String(a.gtinh);
		nsinh=a.nsinh;
		cnang=a.cnang;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap ho ten cua benh nhan:");
		hten=sc.nextLine();
		System.out.println("Vui long nhap gioi tinh cua benh nhan:");
		gtinh=sc.nextLine();
		System.out.println("Vui long nhap nam sinh cua benh nhan:");
		nsinh=sc.nextInt();
		System.out.println("Vui long nhap can nang cua benh nhan:");
		cnang=sc.nextFloat();
	}
	public void in() {
		System.out.println("Ho ten cua benh nhan: "+hten);
		System.out.println("Gioi tinh cua benh nhan: "+gtinh);
		System.out.println("Nam sinh cua benh nhan: "+nsinh);
		System.out.println("Can nang cua benh nhan: "+cnang);
	}
	public static void main(String[] args) {
		BNhan bn1 = new BNhan();
		System.out.println("Nhap thong tin cua benh nhan: ");
		bn1.nhap();
		System.out.println("Thong tin cua benh nhan: ");
		bn1.in();
		BNhan bn2 = new BNhan(bn1);
		System.out.println("Thong tin cua benh nhan 2: ");
		bn2.in();
	}
}
