package Buoi4;

import java.util.Scanner;

public class DiemMau extends Diem {
	private String color;
	public DiemMau() {
		super();
		color="";
	}
	public DiemMau(int x,int y,String color) {
		super(x,y);
		System.out.println("Nhap mau: ");
		this.color=color;
	}
	public void GanMau(String color) {
		this.color=color;
	}
	public void nhap() {
		super.nhapDiem();
		Scanner sc = new Scanner(System.in);
		this.color=sc.nextLine();
	}
	public void hienThiDiemMau() {
		System.out.println(super.toString()+": "+this.color);
	}
}
