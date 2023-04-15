/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX1_Test1;

import java.util.Scanner;

/**
 *
 * @author Dell Pc
 */
public class KySu extends NguoiLaoDong {
    protected int soNgayCong;
    protected float luongCoBan;
    protected int heSoLuong;

    public KySu() {
        super();
    }
    
    public KySu(int soNgayCong, float luongCoBan, int heSoLuong) {
        this.soNgayCong = soNgayCong;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public KySu(String hoTen, String diaChi, String loaiLaoDong, int soNgayCong, float luongCoBan, int heSoLuong) {
        super(hoTen, diaChi, loaiLaoDong);
        this.soNgayCong = soNgayCong;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
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

    public String getLoaiLaoDong() {
        return loaiLaoDong;
    }

    public void setLoaiLaoDong(String loaiLaoDong) {
        this.loaiLaoDong = loaiLaoDong;
    }
    
    
    @Override
    protected double tinhLuong() {
         if(soNgayCong >= 25) {
             return (luongCoBan*heSoLuong+2000000);
         }
         else if(soNgayCong<25 && soNgayCong>15) {
             return (luongCoBan*heSoLuong+1000000);
         }
         else {
             return (luongCoBan*heSoLuong+500000);
         }
    }
    
    
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nh?p s? ngày công: ");
        soNgayCong = sc.nextInt();
        System.out.print("Nh?p lýõng cõ b?n: ");
        luongCoBan = sc.nextFloat();
        System.out.print("Nh?p h? s? lýõng): ");
        heSoLuong = sc.nextInt();
    }
    
    public void Xuat() {
        super.Xuat();
        //System.out.printf("%20s %20s %20s %20s %20s %20s %20s", "H? tên", "Ð?a ch?", "Lo?i lao ð?ng", "S? ngày công", "Lýõng cõ b?n", "H? s? lýõng", "Lýõng tháng" );
        System.out.printf("%20s %20s %20s %20s",  soNgayCong, luongCoBan, heSoLuong, tinhLuong());
    }
}
