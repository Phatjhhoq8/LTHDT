package Buoi3;

import java.util.Scanner;

public class SDGach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong hop gach: ");
		n=sc.nextInt();
		Gach []ds=new Gach[n];
		for(int i=0;i<n;i++) ds[i]=new Gach();
		for(int i=0;i<n;i++) ds[i].nhap();
		for(int i=0;i<n;i++) ds[i].hienThi();
		Gach temp = new Gach(ds[0]);
		for(int i=1;i<n;i++) if(temp.chiPhiLot()>ds[i].chiPhiLot()) temp=temp.copy(ds[i]);
		temp.hienThi();
		for(int i=0;i<n;i++) {
			System.out.printf("Chi phi cua loai %s de lot 1500x500 la: %d\n",ds[i].getId(),ds[i].getPrice()*ds[i].soLuongHop(1500,500));
		}
		sc.close();
	}

}
