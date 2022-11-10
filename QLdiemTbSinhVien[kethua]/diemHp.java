
package com.mycompany.baithuchanh5;

public abstract class diemHp {
    protected  String tenHp;
    protected  int soTc;

    public diemHp(String tenHp, int soTc) {
        this.tenHp = tenHp;
        this.soTc = soTc;
    }

    public String getTenHp() {
        return tenHp;
    }

    public int getSoTc() {
        return soTc;
    }
    public abstract  double tinhDiem();
    
        
  
}
