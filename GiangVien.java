/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
PhucDinhPhucDinh;

import java.util.Scanner;

/**
 *
 * @author Name
 */
public abstract class GiangVien {
    private String hoTen;
    private String diaChi;
    private String loaiGV;
    public abstract double tinhLuong();

    public GiangVien() {
    }

    public GiangVien(String hoTen, String diaChi, String loaiGV) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiGV = loaiGV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        hoTen=sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi=sc.nextLine();
         System.out.println("Nhập loại giảng viên: ");
        loaiGV=sc.nextLine();
    }
    public void xuat(){
        System.out.printf("%20s %20s %20s ",hoTen,diaChi,loaiGV);
    }
}
