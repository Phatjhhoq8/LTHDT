package Buoi2;

import java.util.Scanner;

public class Diem {
	private int x;
	private int y;
	Diem(){
		x=y=0;
	}
	Diem(int _x,int _y) {
		x=_x;
		y=_y;
	}
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap toa do x: ");
		x=sc.nextInt();
		System.out.println("Vui long nhap toa do y: ");
		y=sc.nextInt();
		sc.close();
	}
	public void hienThi() {
		System.out.println("(" +x+ "," +y+ ")");
	}
	public void doiDiem(int dx,int dy) {
		x+=dx;
		y+=dy;
	}
	public int giaTriX() {
		return x;
	}
	public int giaTriY() {
		return y;
	}
	public float khoangCach() {
		return (float) Math.sqrt(x*x+y*y);
	}
	public float khoangCach(Diem a) {
		return (float) Math.sqrt((x-a.giaTriX())*(x-a.giaTriX())+(y-a.giaTriY())*(y-a.giaTriY()));
	}
}
