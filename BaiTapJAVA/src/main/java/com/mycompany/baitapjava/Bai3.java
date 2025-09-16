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
        System.out.println("Mang 2 chieu: ");
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

    public void TongDongLargest(int arr[][], int n, int m) {
        // Tính dòng đầu tiên
        int maxDong = 0;
        for (int k = 0; k < m; k++) {
            maxDong += arr[0][k];
        }

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
            if (sum > maxDong) {
                maxDong = sum;
                maxIndex = i;
            }
        }
        System.out.println("Dong " + maxIndex + 1 + " co tong lon nhat: " + maxDong);
    }

    public void TimLeLargest(int arr[][], int n, int m) {
        int maxLe = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] % 2 != 0) {
                    if (arr[i][j] > maxLe) {
                        maxLe = arr[i][j];
                    }
                }
            }
        }
        if (maxLe == 0) {
            System.out.println("Khong co phan tu le");
        } else {
            System.out.println("Phan tu le lon nhat: " + maxLe);
        }
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
        TimMin(arr, n, m);
        TimLeLargest(arr, n, m);
        TongDongLargest(arr, n, m);
    }
}
