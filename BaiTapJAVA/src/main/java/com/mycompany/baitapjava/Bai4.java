package com.mycompany.baitapjava;

import java.util.Scanner;

/**
 * - Nhập vào ngày tháng năm
 * - In ra ngày kế tiếp
 * -> Test 3 trường hợp : Ngày bình thường, ngày cuối tháng, ngày cuối năm
 */
public class Bai4 {

    public boolean isNamNhuan(int n) {
        return ((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0));
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ngay: ");
        int ngay = sc.nextInt();
        System.out.print("Thang: ");
        int thang = sc.nextInt();
        System.out.print("Nam: ");
        int nam = sc.nextInt();

        int ngayTrongNam;
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                ngayTrongNam = 31;
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                ngayTrongNam = 30;
                break;
            case 2:
                if (isNamNhuan(nam)) {
                    ngayTrongNam = 29;
                } else {
                    ngayTrongNam = 28;
                }
            default:
                System.out.println("Thang khong hop le! ");
        }
    }
}
