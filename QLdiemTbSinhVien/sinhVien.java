
package com.mycompany.baithuchanh5;


public class sinhVien {
    private String hoTen;
    private diemHp hp1,hp2;

    public sinhVien(String hoTen, diemHp hp1, diemHp hp2) {
        this.hoTen = hoTen;
        this.hp1 = hp1;
        this.hp2 = hp2;
    }

    public String getHoTen() {
        return hoTen;
    }
    //pt tinh diem tb
    public double diemTb()
    {
        double diem = 0;
        diem = (hp1.tinhDiem() * hp1.soTc + hp2.tinhDiem() * hp2.soTc) / (hp1.soTc + hp2.soTc);
        return diem;
    }
    //pt hien thi
    public void hienThi()
    {
        System.out.println("Ho ten : "+this.getHoTen());
        System.out.println("Diem ly thuyet : "+this.hp1.tinhDiem());
        System.out.println("Diem Thuc hanh : "+this.hp2.tinhDiem());
    }
}
