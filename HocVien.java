package Bai10;

import java.util.Scanner;

public abstract class HocVien  {
	public String hoTen;
	public String diaChi;
	public int loaiUT;
	public String loaiCT;
	abstract float hocPhi();
	public HocVien() {
		
	}
	public HocVien(String hoTen, String diaChi, int loaiUT, String loaiCT) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiUT = loaiUT;
		this.loaiCT = loaiCT;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getLoaiUT() {
		return loaiUT;
	}
	public void setLoaiUT(int loaiUT) {
		this.loaiUT = loaiUT;
	}
	public String getLoaiCT() {
		return loaiCT;
	}
	public void setLoaiCT(String loaiCT) {
		this.loaiCT = loaiCT;
	}
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ho ten:");
		hoTen = sc.nextLine();
		System.out.println("Nhap dia chi:");
		diaChi = sc.nextLine();	
		System.out.println("Nhap loai uu tien:");
		loaiUT = sc.nextInt();
		System.out.println("Nhap loai chuong trinh:");
		loaiCT = sc.nextLine();		
	}
	
	public void inThongTin() {
		System.out.printf("%15s %15s %15s %15s", hoTen, diaChi, loaiUT, loaiCT );
	}
	
}
