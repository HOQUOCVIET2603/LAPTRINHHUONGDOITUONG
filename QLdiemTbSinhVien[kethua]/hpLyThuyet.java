
package com.mycompany.baithuchanh5;

public class hpLyThuyet extends diemHp{
    private float chuyenCan;
    private float giuaKy;
    private float cuoiKy;

    public hpLyThuyet(float chuyenCan, float giuaKy, float cuoiKy, String tenHp, int soTc) {
        super(tenHp, soTc);
        this.chuyenCan = chuyenCan;
        this.giuaKy = giuaKy;
        this.cuoiKy = cuoiKy;
    }
    @Override
    public double tinhDiem()
    {
        double lyThuet = 0;
        lyThuet = (chuyenCan * 0.1 + giuaKy * 0.2 + cuoiKy*0.7);
        return lyThuet;
        
    }
    //pt hien thi
    public void hienThiLyThuyet()
    {
        System.out.println("Diem ly thuyet : "+tinhDiem());
    }
}
