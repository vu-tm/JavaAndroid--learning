package com.mycompany.baitapoop;

import java.util.Scanner;

public class BaiTapOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---- MENU ----");
            System.out.println("1. Quan ly Nhan Vien");
            System.out.println("2. Hinh hoc (nhap mang hinh, tim dien tich lon nhat)");
            System.out.println("3. Nong trai (bo, cuu, de) - thong ke");
            System.out.println("0. Thoat");
            System.out.print("Lua chon: ");
            int chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    QuanLyNhanVien qlnv = new QuanLyNhanVien();
                    qlnv.run();
                    break;
                case 2:
                    QuanLyShape shape = new QuanLyShape();
                    shape.run();
                    break;
                case 3:
                    NongTrai nt = new NongTrai();
                    nt.run();
                    break;
                case 0:
                    System.out.println("Thoat. Tam biet!");
                    sc.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
            System.out.println();
        }
    }
}
