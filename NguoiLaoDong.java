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
public abstract class NguoiLaoDong {
    protected String hoTen;
    protected String diaChi;
    protected String loaiLaoDong;
    protected abstract double tinhLuong();

    public NguoiLaoDong() {
    }
    
    public NguoiLaoDong(String hoTen, String diaChi, String loaiLaoDong) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiLaoDong = loaiLaoDong;
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
    
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nh?p h? t�n: ");
        hoTen = sc.nextLine();
        System.out.print("Nh?p �?a ch?: ");
        diaChi = sc.nextLine();
        System.out.print("Nh?p lo?i lao �?ng(lao �?ng ph? th�ng, k? s�): ");
        loaiLaoDong = sc.nextLine();
        if(loaiLaoDong != "lao dong pho thong" || loaiLaoDong != "Lao dong pho thong" || loaiLaoDong != "lao �?ng ph? th�ng" || loaiLaoDong != "Lao �?ng ph? th�ng" || loaiLaoDong != "ki su" || loaiLaoDong != "k? s�" || loaiLaoDong != "Ki su" || loaiLaoDong != "K? s�")
        {
            System.out.println("Lo?i lao �?ng kh�ng h?p l?. Nh?p l?i: ");
            System.out.print("Nh?p lo?i lao �?ng(lao �?ng ph? th�ng, k? s�): ");
            loaiLaoDong = sc.nextLine();
        }
        /*do {
            System.out.println("Nh?p lo?i lao �?ng(lao �?ng ph? th�ng, k? s�): ");
            loaiLaoDong = sc.nextLine();
        }while(loaiLaoDong == "lao dong pho thong" || loaiLaoDong == "Lao dong pho thong" || loaiLaoDong == "lao �?ng ph? th�ng" || loaiLaoDong == "Lao �?ng ph? th�ng" || loaiLaoDong == "ki su" || loaiLaoDong == "k? s�" || loaiLaoDong == "Ki su" || loaiLaoDong == "K? s�");
        */
    }
    
    public void Xuat() {
        System.out.printf("%20s %20s %20s", hoTen, diaChi, loaiLaoDong);
    }
    
    
    
}
