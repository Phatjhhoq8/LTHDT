package Buoi5;

import java.util.Scanner;

public class TheBus {
	private String maThe,nph;
	private char loai;
	public TheBus() {
		this.maThe="";
		this.nph="";
		this.loai='@';
	}
	public TheBus(String maThe,String nph,char loai) {
		this.maThe=maThe;
		this.nph=nph;
		this.loai=loai;
	}
	public TheBus(TheBus thebus) {
		this.maThe=thebus.maThe;
		this.nph=thebus.nph;
		this.loai=thebus.loai;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma the: ");
		maThe=sc.nextLine();
		System.out.println("Nhap ngay phat hanh(dd/mm/yy): ");
		nph=sc.nextLine();
		System.out.println("Nhap loai: ");
		loai=sc.nextLine().charAt(0);
	}
	public void in() {
		System.out.println("Ma the: "+maThe);
		System.out.println("Ngay phat hanh(dd/mm/yy): "+nph);
		System.out.println("Loai: "+loai);
	}
	char getLoai() {
		return loai;
	}
}
