
package com.mycompany.baithuchanh5;


public class hpThucHanh extends diemHp{
    private float db1;
    private float db2;
    private float db3;

    public hpThucHanh(float db1, float db2, float db3, String tenHp, int soTc) {
        super(tenHp, soTc);
        this.db1 = db1;
        this.db2 = db2;
        this.db3 = db3;
    }
    @Override
    public double tinhDiem()
    {
        double thucHanh = 0;
        thucHanh = (db1 + db2 + db3)/3;
        return thucHanh;
    }
    public void hienThiThucHanh()
    {
        System.out.println("Diem thuc hanh : "+tinhDiem());
    }

}
