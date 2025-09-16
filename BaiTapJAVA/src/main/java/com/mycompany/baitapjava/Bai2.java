package com.mycompany.baitapjava;

import java.util.Scanner;

/**
 * Viết chương trình nhập một mảng số nguyên có n phần tử 
 * – Xuất giá trị các phần tử của mảng. 
 * – Tìm phần tử có giá trị lớn nhất, nhỏ nhất. 
 * – Đếm số phần tử là số chẵn 
 * – Tìm các phần tử là số nguyên tố. 
 * – Sắp xếp mảng tăng dần
 * – Tìm phần tử có giá trị x
 */
public class Bai2 {

    public void XuatHam(int arr[], int n) {
        System.out.print("Gia tri cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void TimMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                max = arr[i + 1];
            }
        }
        System.out.println("Phan tu lon nhat: " + max);
    }

    public void DemChan(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("So phan tu chan: " + count);
    }

    public void TimMin(int arr[], int n) {
        int min = arr[0];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                min = arr[i + 1];
            }
        }
        System.out.print("Phan tu nho nhat: " + min);
        System.out.println();
    }

    public boolean isNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void TimNguyenTo(int arr[], int n) {
        System.out.print("Cac so nguyen to: ");
        for (int i = 0; i < n; i++) {
            if (isNguyenTo(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public void SapXepTang(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("Mang sau khi sap xep: ");
        XuatHam(arr, n);
    }

    public void TimX(int arr[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.print(x + " xuat hien tai vi tri: " + i+1 + " ");
            }
        }
        System.out.println();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        XuatHam(arr, n);
        TimMax(arr, n);
        TimMin(arr, n);
        DemChan(arr, n);
        TimNguyenTo(arr, n);
        SapXepTang(arr, n);
        TimX(arr, n);
    }
}
