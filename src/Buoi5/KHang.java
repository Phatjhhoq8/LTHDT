package Buoi5;

import java.util.Scanner;

public class KHang {
	private String ten;
	private boolean gioitinh;
	private int nsinh;
	private TheBus thebus;
	public KHang() {
		this.ten="";
		this.gioitinh=false;
		this.nsinh=9999;
		this.thebus=new TheBus();
	}
	public KHang(String ten,boolean gioitinh,int nsinh) {
		this.ten=ten;
		this.gioitinh=gioitinh;
		this.nsinh=nsinh;
		this.thebus=new TheBus();
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten khach hang: ");
		ten=sc.nextLine();
		System.out.println("Nhap gioi tinh khach hang: ");
		gioitinh=sc.nextBoolean();
		System.out.println("Nhap nam sinh khach hang: ");
		nsinh=sc.nextInt();
	}
	public void in() {
		System.out.println("Ten khach hang: "+ten);
		System.out.println("Gioi tinh khach hang: "+(gioitinh?"Nam":"Nu"));
		System.out.println("Nam sinh khach hang: "+nsinh);
	}
	public void addTheBus(TheBus thebus) {
		this.thebus= new TheBus(thebus);
	}
}
