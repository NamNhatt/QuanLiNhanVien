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
public class NhanVienPartTime extends NhanVien{
    private float sogio;
    private float luongtheogio;

    public NhanVienPartTime( String name, int age, String gioiTinh,float sogio, float luongtheogio) {
        super(name, age, gioiTinh);
        this.sogio = sogio;
        this.luongtheogio = luongtheogio;
    }

    public float getSogio() {
        return sogio;
    }

    public void setSogio(float sogio) {
        this.sogio = sogio;
    }

    public float getLuongtheogio() {
        return luongtheogio;
    }

    public void setLuongtheogio(float luongtheogio) {
        this.luongtheogio = luongtheogio;
    }
     public float getLuongPartTime(){
         return this.luongtheogio*this.sogio;
     }

    @Override
    public String toString() {
        return super.toString() +" "+"Luong nhan duoc la : "+" "+getLuongPartTime();
    }
    
}
