package com.mycompany.baitapoop;

import java.util.Scanner;

/**
 *  Giả sử Công ty có hai loại nhân viên: 
 *   • Nhân viên văn phòng và Nhân viên sản xuất.
 * Viết chương trình quản lý và tính lương cho từng nhân viên của công ty:
 *
 * – Mỗi nhân viên cần quản lý các thông tin sau: 
 *   • Họ tên, ngày sinh, lương
 * – Công ty cần tính lương cho nhân viên như sau:
 * • Đối với nhân viên sản xuất: 
 *    + Lương= lương căn bản + số sản phẩm * 5.000
 * • Đối với nhân viên văn phòng: 
 *    + Lương = số ngày làm việc * 100.000
 **/
abstract class NhanVien {

    protected String HoTen;
    protected String NgaySinh;

    public void Nhap(Scanner sc) {
        sc.nextLine(); // clear buffer
        System.out.print("Ho va ten: ");
        HoTen = sc.nextLine();
        System.out.print("Ngay sinh: ");
        NgaySinh = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ho va ten: " + HoTen);
        System.out.println("Ngay sinh: " + NgaySinh);
        System.out.println("Luong: " + TinhLuong());
    }

    public abstract double TinhLuong();
}

// Nhân viên văn phòng
class NhanVienVanPhong extends NhanVien {

    private double LuongCanBan;
    private int SoSP;

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.print("Luong can ban: ");
        LuongCanBan = sc.nextDouble();
        System.out.print("So san pham: ");
        SoSP = sc.nextInt();
    }

    @Override
    public void Xuat() {
        System.out.println("====== Nhan vien van phong ======");
        super.Xuat();
    }

    @Override
    public double TinhLuong() {
        return LuongCanBan + SoSP * 5000;
    }
}

// Nhân viên sản xuất
class NhanVienSanXuat extends NhanVien {

    private int SoNgayLam;

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.print("So ngay lam: ");
        SoNgayLam = sc.nextInt();
    }

    @Override
    public void Xuat() {
        System.out.println("====== Nhan vien san xuat ======");
        super.Xuat();
    }

    @Override
    public double TinhLuong() {
        return SoNgayLam * 100000;
    }
}

public class QuanLyNhanVien {

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("So luong nhan vien: ");
        int n = sc.nextInt();
        NhanVien[] ds = new NhanVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n====== Nhap nhan vien thu " + (i + 1) + " ======");
            System.out.println("1. Nhan vien van phong\n2. Nhan vien san xuat");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ds[i] = new NhanVienVanPhong();
                    break;
                case 2:
                    ds[i] = new NhanVienSanXuat();
                    break;
                default:
                    System.out.println("Lua chon khong hop le, mac dinh la Nhan vien van phong.");
                    ds[i] = new NhanVienVanPhong();
                    break;
            }
            ds[i].Nhap(sc);
        }

        // Xuất thông tin tất cả nhân viên
        System.out.println("\n====== Danh sach nhan vien ======");
        for (NhanVien nv : ds) {
            nv.Xuat();
            System.out.println("-----------------------------");
        }
    }
}
