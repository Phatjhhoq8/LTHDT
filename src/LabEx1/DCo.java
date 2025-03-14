package LabEx1;

import java.util.Scanner;

public class DCo {
	private String ten,dtich,ngay;
	public DCo() {
		ten= new String();
		dtich= new String();
		ngay= new String();
	}
	public DCo(DCo a) {
		ten=a.ten;
		dtich=a.dtich;
		ngay=a.ngay;
	}
	public String getNgay() {
		return ngay;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap ten dong co: ");
		ten=sc.nextLine();
		System.out.println("Vui long nhap dung tich dong co: ");
		dtich=sc.nextLine();
		System.out.println("Vui long nhap ngay san xuat (dd/m/yyyy) dong co: ");
		ngay=sc.nextLine();
	}
	public void in() {
		System.out.println("Ten dong co: "+ten);
		System.out.println("Dung tich dong co: "+dtich);
		System.out.println("Ngay san xuat (dd/m/yyyy) dong co: "+ngay);
	}
	public static void main(String[] args) {
		DCo d1 = new DCo();
		d1.nhap();
		System.out.println("Thong tin dong co: ");
		d1.in();
		DCo d2 = new DCo(d1);
		System.out.println("Thong tin dong co: ");
		d2.in();
	}
}
