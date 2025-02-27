package Buoi4;

import java.util.Scanner;

public abstract class ConVat {
	private String giong,maulong;
	private float cannang;
	public ConVat() {
		this.giong="";
		this.maulong="";
		this.cannang=0;
	}
	public ConVat(String giong,String maulong,float cannang) {
		this.giong=giong;
		this.maulong=maulong;
		this.cannang=cannang;
	}
	public abstract void keu();
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap giong: ");
		this.giong=sc.nextLine();
		System.out.println("Nhap mau long: ");
		this.maulong=sc.nextLine();
		System.out.println("Nhap can nang: ");
		cannang=sc.nextFloat();
	}
}