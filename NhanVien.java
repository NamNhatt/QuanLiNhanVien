/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlinhanviencongty;

/**
 *
 * @author Minh Chau
 */
public class NhanVien {
    public String name;
    public int age;
    public String gioiTinh;
    public double tinhluong;

    public NhanVien(String name, int age, String gioiTinh) {
        this.name = name;
        this.age = age;
        this.gioiTinh = gioiTinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getTinhluong() {
        return 0;
    }

    public void setPhuongthuctinhluong(double tinhluong) {
        this.tinhluong = tinhluong;
    }
    @Override
    public String toString() {
        return "Ten"+" "+this.name+" "+"Tuoi"+" "+this.age+" "+"Gioitinh"+" "+this.gioiTinh;
    }
}
