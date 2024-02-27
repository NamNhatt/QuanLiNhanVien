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
public class NhanVienFullTime extends NhanVien{
    private float luongtheothang;

    public NhanVienFullTime(String name, int age, String gioiTinh,float luongtheothang) {
        super(name, age, gioiTinh);
        this.luongtheothang=luongtheothang;
    }

    public float getLuongtheothang() {
        return luongtheothang;
    }

    public void setLuongtheothang(float luongtheothang) {
        this.luongtheothang = luongtheothang;
    }

    @Override
    public String toString() {
        return super.toString() + " "+ "Luong nhan duoc la : "+" "+getLuongtheothang() ;
    }
}
