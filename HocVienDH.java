package Bai10;

import java.util.Scanner;

public class HocVienDH extends HocVien {
	public int soBuoi;
	public float dongiaDH;	
	
	public HocVienDH() {
		
	}
	/*
	public HocVienDH(int soBuoi, float dongiaDH) {		
		this.soBuoi = soBuoi;
		this.dongiaDH = dongiaDH;
	}*/
	
	public HocVienDH(int soBuoi, float dongiaDH, String hoTen, String diaChi, int loaiUT, String loaiCT ) {
		super(hoTen, diaChi, loaiUT,loaiCT);
		this.soBuoi = soBuoi;
		this.dongiaDH = dongiaDH;
	}
	
	

	public int getSoBuoi() {
		return soBuoi;
	}

	public void setSoBuoi(int soBuoi) {
		this.soBuoi = soBuoi;
	}

	public float getDongiaDH() {
		return dongiaDH;
	}

	public void setDongiaDH(float dongiaDH) {
		this.dongiaDH = dongiaDH;
	}
	
	public void nhap() {	
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);	
		sc.nextLine();
		System.out.println("Nhap so buoi:");	
		soBuoi = sc.nextInt();
		System.out.println("Nhap don gia:");
		dongiaDH = sc.nextFloat();		
	}	
	@Override
	public float hocPhi() {
		float hocphi =0;
		if(loaiUT == 1) {
			hocphi = soBuoi*dongiaDH - 1000000;
		}else if(loaiUT == 2) {
			hocphi = soBuoi*dongiaDH - 500000;
		}else {
			return 0;
		}	
		return hocphi;
	}
	public void inThongTin() {
		super.inThongTin();
		
		System.out.printf("%15s %15s %15s\n", soBuoi, dongiaDH, hocPhi() );
	}
	
}
