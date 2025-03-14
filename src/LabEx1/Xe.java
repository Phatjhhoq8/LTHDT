package LabEx1;

import java.util.Scanner;

public class Xe {
	private String so,ten;
	private long gia;
	private char tthai;
	private DCo dongco;
	Xe() {
		so=new String();
		ten=new String();
		gia=0;
		tthai='K';
		dongco = new DCo();
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long bien so xe: ");
		so=sc.nextLine();
		System.out.println("Vui long nhap ten xe: ");
		ten=sc.nextLine();
		System.out.println("Vui long nhap gia xe: ");
		gia=sc.nextLong();
		sc.nextLine();
		System.out.println("Vui long nhap trang thai xe: ");
		tthai=sc.nextLine().charAt(0);
		System.out.println("Vui long nhap dong co xe: ");
		dongco.nhap();
	}
	public float lephitruocba() {
		return 0.1f*gia;
	}
	public char gettthai() {
		return tthai;
	}
	public long getgia() {
		return gia;
	}
	public boolean check(int m,int y) {
		int month = Integer.parseInt(dongco.getNgay().substring(3,5));
		int year = Integer.parseInt(dongco.getNgay().substring(6));
		if (year<y||(y==year&&month<=m)) return true;
		return false;
	}
	public void in() {
		System.out.println("Bien so xe: "+so);
		System.out.println("Ten cua xe: "+ten);
		System.out.println("Gia cua xe: "+gia+" VND");
		System.out.println("Trang thai cua xe: "+tthai);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap so luong doi tuong xe: ");
		int m=sc.nextInt();
		Xe ds[] = new Xe[m];
		for(int i=0;i<m;i++) {
			System.out.println("Nhap xe thu "+(i+1)+": ");
			ds[i]=new Xe();
			ds[i].nhap();
		}
		for(int i=0;i<m;i++) {
			System.out.println("Thong tin xe thu "+(i+1)+": ");
			ds[i].in();
			System.out.println("Le phi truoc ba cua xe: "+ds[i].lephitruocba()+" VND");
		}
		System.out.println("Danh sach xe khong duoc phep luu hanh: ");
		for(int i=0;i<m;i++) {
			if(ds[i].gettthai()=='K'||ds[i].getgia()<10000000) ds[i].in();
		}
		long sum=0;
		for(int i=0;i<m;i++) {
			if(ds[i].check(10,2000)) sum+=ds[i].lephitruocba();
		}
		System.out.println("Tong le phi truoc ba cho tung loai dong co duoc san xuat truoc thang 10 nam 2000 la: "+sum);
	}
}
