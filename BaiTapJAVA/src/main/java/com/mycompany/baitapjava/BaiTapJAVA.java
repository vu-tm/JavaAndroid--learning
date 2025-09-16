/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.baitapjava;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class BaiTapJAVA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chon cau (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Bai1 bai1 = new Bai1();
                bai1.run();
                break;
            case 2:
                Bai2 bai2 = new Bai2();
                bai2.run();
                break;
            case 3:
                Bai3 bai3 = new Bai3();
                bai3.run();
                break;
            case 4:
                Bai4 bai4 = new Bai4();
                bai4.run();
                break;
            default:
                System.out.println("Vui long nhap lai!");
        }
        sc.close();
    }
}
