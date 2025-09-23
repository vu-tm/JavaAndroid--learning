package com.mycompany.baitapoop;

import java.util.Scanner;

/**
 * Xây dựng cây kế thừa như sau:
 * Hình học
 * ├── Hình tròn
 * ├── Hình vuông
 * └── Hình chữ nhật
 *
 * • Viết các phương thức Nhập, xuất,
 *     tính chu vi, tính diện tích của các hình trên.
 * • Nhập mảng gồm nhiều hình, tính diện tích của từng hình,
 *     in ra hình có diện tích lớn nhất.
 */
abstract class HinhHoc {

    public abstract void Nhap(Scanner sc);

    public abstract void Xuat();

    public abstract double ChuVi();

    public abstract double DienTich();
}

/*
Chu vi hình tròn: C = 2πr hoặc C = πd.
└── r là bán kính & d là đường kính(d = 2r).

Diện tích hình tròn: A = πr². 
Nếu tính theo đường kính: A = πd²/4.
 */
class HinhTron extends HinhHoc {

    private double r;

    @Override
    public void Nhap(Scanner sc) {
        System.out.print("Nhap vao ban kinh hinh tron: ");
        r = sc.nextDouble();
    }

    @Override
    public void Xuat() {
        System.out.printf("Hinh tron: r = %.2f, Chu vi = %.2f, Dien tich = %.2f\n", r, ChuVi(), DienTich());
    }

    @Override
    public double ChuVi() {
        return 2 * Math.PI * r;
    }

    @Override
    public double DienTich() {
        return Math.PI * r * r;
    }
}

/*
Chu vi : 4 x a, Diện tích : A = a² 
 */
class HinhVuong extends HinhHoc {

    private double a;

    @Override
    public void Nhap(Scanner sc) {
        System.out.print("Nhap vao canh hinh vuong: ");
        a = sc.nextDouble();
    }

    @Override
    public void Xuat() {
        System.out.printf("Hinh vuong: a = %.2f, Chu vi = %.2f, Dien tich = %.2f\n", a, ChuVi(), DienTich());
    }

    @Override
    public double ChuVi() {
        return 4 * a;
    }

    @Override
    public double DienTich() {
        return a * a;
    }
}

/*
Chu vi : C = 2 x (a+b), Diện tích : A = a x b
 */
class HinhChuNhat extends HinhHoc {

    private double a;
    private double b;

    @Override
    public void Nhap(Scanner sc) {
        System.out.print("Nhap vao chieu dai hinh chu nhat: ");
        a = sc.nextDouble();
        System.out.print("Nhap vao chieu rong hinh chu nhat: ");
        b = sc.nextDouble();
    }

    @Override
    public void Xuat() {
        System.out.printf("Hinh chu nhat: Chieu dai = %.2f, Chieu rong = %.2f,"
                + " Chu vi = %.2f, Dien tich = %.2f\n", a, b, ChuVi(), DienTich());
    }

    @Override
    public double ChuVi() {
        return 2 * (a + b);
    }

    @Override
    public double DienTich() {
        return a * b;
    }
}

public class QuanLyShape {

    public void run() {
        Scanner sc = new Scanner(System.in);

        // Nhập danh sách các hình
        System.out.print("Nhap so luong hinh: ");
        int n = sc.nextInt();
        HinhHoc[] ds = new HinhHoc[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap lua chon:\n1. Hinh tron\n2. Hinh vuong\n3. Hinh chu nhat");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ds[i] = new HinhTron(); // HinhHoc ds[i] = new HinhTron();
                    ds[i].Nhap(sc);
                    break;
                case 2:
                    ds[i] = new HinhVuong();
                    ds[i].Nhap(sc);
                    break;
                case 3:
                    ds[i] = new HinhChuNhat();
                    ds[i].Nhap(sc);
                    break;
                default:
                    System.out.println("Khong hop le, mac dinh hinh tron!");
                    ds[i] = new HinhTron();
            }
        }

        // Danh sách các hình
        System.out.println("====== Danh sach cac hinh ======");
        for (int i = 0; i < n; i++) {
            ds[i].Xuat();
        }

        // Tìm hình có diện tích lớn nhất
        HinhHoc maxDienTich = ds[0];
        for (int i = 1; i < n; i++) {
            if (ds[i].DienTich() > maxDienTich.DienTich()) {
                maxDienTich = ds[i];
            }
        }

        System.out.println("====== Hinh co dien tich lon nhat ======");
        maxDienTich.Xuat();
    }
}
