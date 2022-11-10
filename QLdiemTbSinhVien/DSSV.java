
package com.mycompany.baithuchanh5;


public class DSSV {
    private sinhVien[] ds;
    private int soSv;
  
    public DSSV (int n)
    {
        ds = new sinhVien[n];
        soSv = 0;
    }
    public void them(sinhVien a)
    {
        if(soSv < ds.length)
        {
            ds[soSv] = a;
            soSv ++;
        }
    }
    //pt tim kiem 1 sinh vien
    public void timKiem(String hoTenTim)
    {
        
        for(int i = 0 ; i < soSv ; i ++)
        {
            if( hoTenTim == ds[i].getHoTen())
            {
               ds[i].hienThi();
            }
        }
    }
    public void lietKe()
    {
        for(int i = 0 ;i< soSv ; i++)
        {
            ds[i].hienThi();
            System.out.println("diem tb : " +ds[i].diemTb());
        }
        
    }
}
