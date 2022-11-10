
package com.mycompany.baithuchanh5;

public class BaiThucHanh5 {

    public static void main(String[] args) {
       sinhVien a = new sinhVien("A", new hpLyThuyet(10, 10, 10, "Toan", 2), new hpThucHanh(10, 9, 8, "Toan", 2));
       DSSV list = new DSSV(2);
       list.them(a);
       sinhVien b = new sinhVien("B", new hpLyThuyet(10, 9, 8, "Toan", 2), new hpThucHanh(5, 5, 5, "Toan", 2));
       list.them(b);
       list.lietKe();
       list.timKiem("B");
    }
}
