package Buoi3;

public class SDDoanThang {

	public static void main(String[] args) {
		Diem A = new Diem(2,5);
		Diem B = new Diem(20,35);
		DoanThang AB = new DoanThang(A,B);
		AB.hienThi();
		DoanThang CD = new DoanThang();
		CD.nhap();
		CD.hienThi();
		System.out.printf("Do dai cua CD la: %f\n",CD.doDaiDoanThang());
	}

}
