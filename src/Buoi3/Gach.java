package Buoi3;

import java.util.Scanner;

public class Gach {
	private String ID,color;
	private int sl,cd,cr;
	private long price;
	public Gach(){
		this.ID="";
		this.color="";
		this.sl=0;
		this.cd=0;
		this.cr=0;
		this.price=0;
	}
	public Gach(String ID,String color,int sl,int cd,int cr,long price) {
		this.ID=ID;
		this.color=color;
		this.sl=sl;
		this.cd=cd;
		this.cr=cr;
		this.price=price;
	}
	public Gach(Gach c) {
		this.ID=c.ID;
		this.color=c.color;
		this.sl=c.sl;
		this.cd=c.cd;
		this.cr=c.cr;
		this.price=c.price;
	}
	public Gach copy(Gach c) {
		Gach temp = new Gach(c);
		return temp;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so cua gach: ");
		ID=sc.nextLine();
		System.out.println("Nhap mau cua gach: ");
		color=sc.nextLine();
		System.out.println("Nhap so luong vien trong mot hop cua gach: ");
		sl=sc.nextInt();
		System.out.println("Nhap chieu dai cua vien gach: ");
		cd=sc.nextInt();
		System.out.println("Nhap chieu rong cua vien gach: ");
		cr=sc.nextInt();
		System.out.println("Nhap gia cua hop gach: ");
		price=sc.nextLong();
	}
	public void hienThi() {
		System.out.println("=====Thong tin cua gach=====");
		System.out.printf("Ma so: %s\n",ID);
		System.out.printf("Mau: %s\n",color);
		System.out.printf("So luong trong mot hop: %d\n",sl);
		System.out.printf("Chieu dai: %d\n",cd);
		System.out.printf("Chieu rong: %d\n",cr);
		System.out.printf("Gia mot hop: %d\n",price);
	}
	float giaBanLe() {
		return (1.0f*price/sl)*1.2f;
	}
	int dienTichToiDa() {
		return cd*cr*sl;
	}
	int soLuongHop(int CD,int CR) {
		int d=(int) Math.ceil((1.0*CD/(cd*sl)));
		int r= (int) Math.ceil((1.0*CR/(cr*sl)));
		return d*r;
	}
	float chiPhiLot() {
		return 1.0f*price/dienTichToiDa();
	}
	public String getId() {
		return ID;
	}
	public long getPrice() {
		return price;
	}
}
