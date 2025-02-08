package Buoi2;

public class SDDate {
	public static void main(String agrs[]) {
		Date ngay1 = new Date();
		ngay1.nhapNgay();
		ngay1.hienThi();
		System.out.print("Ngay hom sau cua ngay nay la: ");
		ngay1.ngayHomSau().hienThi();
		System.out.print("Ngay thu nam sau ngay nay la: ");
		ngay1.congNgay(5).hienThi();
	}
}
