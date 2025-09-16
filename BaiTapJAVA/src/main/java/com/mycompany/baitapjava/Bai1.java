package com.mycompany.baitapjava;

import java.util.Scanner;

/**
 * Viết chương trình nhập vào 2 số nguyên, tính tổng hiệu tích thương của hai số
 * đó
 */
public class Bai1 {

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen thu nhat: ");
        int s1 = sc.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int s2 = sc.nextInt();

        System.out.println("Tong: " + (s1 + s2));
        System.out.println("Hieu: " + (s1 - s2));
        System.out.println("Thuong: " + (s1 * s2));
        System.out.println("Tich: " + (s1 / s2));
    }
}
