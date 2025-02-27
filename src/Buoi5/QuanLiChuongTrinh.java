package Buoi5;

import java.util.Scanner;

public class QuanLiChuongTrinh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap so luong the bus: ");
		int m=sc.nextInt();
		TheBus ds1[] = new TheBus[m];
		for(int i=0;i<m;i++) {
			ds1[i]=new TheBus();
			ds1[i].nhap();
		}
		for(int i=0;i<m;i++) {
			System.out.println("The bus thu: "+(i+1));
			ds1[i].in();
		}
		System.out.println("Cac loai the bus co han su dung 1 nam: ");
		for(int i=0;i<m;i++) {
			if(ds1[i].getLoai()=='Y'||ds1[i].getLoai()=='y') ds1[i].in();
		}
	}

}
