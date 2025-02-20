package Buoi4;

public class SDDiemMau {

	public static void main(String[] args) {
		DiemMau A = new DiemMau(5,10,"white");
		System.out.print("Diem A la: ");
		A.hienThiDiemMau();
		DiemMau B = new DiemMau();
		B.nhap();
		System.out.print("Diem B la: ");
		B.hienThiDiemMau();
		B.doiDiem(10,8);
		System.out.print("Toa do cua diem B sau khi doi (10,8) la: ");
		B.hienThiDiemMau();
		B.GanMau("yellow");
		System.out.print("Diem B hien tai sau khi dan mau yellow la: ");
		B.hienThiDiemMau();
	}

}
