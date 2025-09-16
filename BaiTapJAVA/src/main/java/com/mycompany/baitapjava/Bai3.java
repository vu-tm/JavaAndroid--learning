package com.mycompany.baitapjava;

import java.util.Scanner;

/**
 *  Cho ma trận số nguyên cấp n x m. 
 * Cài đặt các hàm thực hiện các chức năng sau:
 * – Nhập ma trận.– In ma trận.
 * – Tìm phần tử nhỏ nhất.
 * – Tìm phần tử lẻ lớn nhất.
 * – Tìm dòng có tổng lớn nhất.
 * – Tính tổng các số không phải là số nguyên tố.
 */
public class Bai3 {

    public void In(int arr[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void TimMin(int arr[][], int n, int m) {
        int min = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Phan tu nho nhat: " + min);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("m = ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        In(arr, n, m);
    }
}
