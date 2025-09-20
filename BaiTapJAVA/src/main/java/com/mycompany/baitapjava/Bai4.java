package com.mycompany.baitapjava;

import java.util.Scanner;

/**
 * - Nhập vào ngày tháng năm
 * - In ra ngày kế tiếp
 * -> Test 3 case : Ngày bình thường, Ngày cuối năm, Ngày cuối tháng
 */
public class Bai4 {

    public boolean isNamNhuan(int year) {
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }

    public void run() {
        // Lấy ngày hiện tại
        System.out.println("Nhap vao ngay/thang/nam:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ngay: ");
        int Ngay = sc.nextInt();
        System.out.print("Thang: ");
        int Thang = sc.nextInt();
        System.out.print("Nam: ");
        int Nam = sc.nextInt();

        int ngayTrongNam = 0;
        switch (Thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                ngayTrongNam = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                ngayTrongNam = 30;
                break;
            case 2:
                if (isNamNhuan(Nam)) {
                    ngayTrongNam = 29;
                    break;
                } else {
                    ngayTrongNam = 28;
                    break;
                }
            default:
                System.out.println("Nam khong hop le!");
        }

        // Check ngày
        if (Ngay < 1 || Ngay > ngayTrongNam) {
            System.out.println("Ngay khong hop le!");
            return; // Kết thúc chương trình
        }

        // Tính ngày tiếp theo
        int ngayTiepTheo = 0;
        int thangTiepTheo = 0;
        int namTiepTheo = 0;
        if (Ngay == ngayTrongNam) { // Cuối tháng
            ngayTiepTheo = 1;
            if (Thang == 12) { // Cuối năm
                thangTiepTheo = 1;
                namTiepTheo = Nam + 1;
            } else {
                thangTiepTheo = Thang + 1;
                namTiepTheo = Nam;
            }
        } else { // Ngày bình thường
            ngayTiepTheo = Ngay + 1;
            thangTiepTheo = Thang;
            namTiepTheo = Nam;
        }

        System.out.println("Ngay hien tai: " + Ngay + "/" + Thang + "/" + Nam);
        System.out.println("Ngay ke tiep: " + ngayTiepTheo + "/" + thangTiepTheo + "/" + namTiepTheo);
    }
}
