/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlinhanviencongty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Minh Chau
 */
public class QuanLiNhanVienCongTy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NhanVien> arr1 = new ArrayList();
        List<NhanVien> arr2 = new ArrayList();
        int check;
        while (true) {
            System.out.print(" 1.Nhap thong tin nhan vien parttime \n 2.Nhap thong tin nhanvien fulltime \n Xin moi nhap lua chon : ");
            int luachon = sc.nextInt();
            if (luachon == 1) {
                sc.nextLine();
                System.out.print("Nhan vien parttime: \n");
                System.out.print("Xin moi nhap ten nhan vien : ");
                String name = sc.nextLine();
                System.out.print("Xin moi nhap tuoi nhan vien : ");
                int age = sc.nextInt();
                System.out.print("Xin moi nhap gioi tinh : ");
                sc.nextLine();
                String gioitinh = sc.nextLine();
                System.out.print("Xin moi nhap so gio : ");
                float sogio = sc.nextFloat();
                System.out.print("Xin moi nhap luong theo gio : ");
                float luongtheogio = sc.nextFloat();
                NhanVienPartTime nvpt = new NhanVienPartTime(name, age, gioitinh, sogio, luongtheogio);
                arr1.add(nvpt);
            } else if (luachon == 2) {
                sc.nextLine();
                System.out.print("Nhan vien fulltime: \n");
                System.out.print(" Xin moi nhap ten nhan vien : ");
                String name = sc.nextLine();
                System.out.print("Xin moi nhap tuoi nhan vien : ");
                int age = sc.nextInt();
                System.out.print("Xin moi nhap gioi tinh : ");
                sc.nextLine();
                String gioitinh = sc.nextLine();
                System.out.print("Xin moi nhap luong theo thang : ");
                float luongtheothang = sc.nextFloat();
                NhanVienFullTime nvft = new NhanVienFullTime(name, age, gioitinh, luongtheothang);
                arr2.add(nvft);
            }
            System.out.println("Co muon nhap them nhan vien khong : \n1.Co \n2.Khong");
            check = sc.nextInt();
            if (check == 1) {
                continue;
            } else if (check == 2) {
                System.out.println("Ket thuc");
                break;
            }
        }
        System.out.println("Danh sach cac nhan vien Parttime la : ");
        for (NhanVien item : arr1) {
                System.out.println(item.toString());
        }
        System.out.println("Danh sach cac nhan vien Fulltime la : ");
        for (NhanVien items : arr2) {
            System.out.println(items.toString());
        }
    }
}
