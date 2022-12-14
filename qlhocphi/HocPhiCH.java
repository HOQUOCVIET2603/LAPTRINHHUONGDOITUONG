
package com.mycompany.qlhocphi;

public class HocPhiCH extends HocPhi{

    public HocPhiCH() {
    }

    public HocPhiCH(String hoTen, String nganh, String doiTuong, int soTCHocLai) {
        super(hoTen, nganh, doiTuong, soTCHocLai);
    }

    @Override
    //Phuong thuc tinh hp hk
    public int HocPhiHK() {
        int hp = 0;
       if ( nganh.equals("101"))
       {
           hp = 0;
       }
       if ( nganh.equals("102"))
       {
           hp = 3000000;
       }
       if ( nganh.equals("103"))
       {
            hp = 2750000;
       }
       //
       if ( doiTuong.equals("01"))
       {
           return (int) ((hp - (hp * 100/100))*1.5);
       }
       if ( doiTuong.equals("02"))
       {
           return  (int) ((hp - (hp * 70/100))*1.5);
       }
       if ( doiTuong.equals("03"))
       {
            return  (int) ((hp - (hp * 50/100)*1.5));
       }
       if ( doiTuong.equals("04"))
       {
            return  (int) (hp*1.5);
       }
       else
           return 0;
       
    }

    @Override
    public int HocPhiHL() {
        
         if ( nganh.equals("101")|| nganh.equals("103"))
        {
            return (int) (200000*soTCHocLai*1.5);
        }
        if ( nganh.equals("102"))
        {
            return (int) (225000*soTCHocLai*1.5);
        }
        else
            return 0;
        
    }

    @Override
    public int HocPhiTong() {
        return HocPhiHK() + HocPhiHL();
    }

    @Override
    public String HienThi() {
         return "Ten : " + hoTen + "Nganh :" + nganh  + " Doi tuong " +doiTuong + " SO TC HOCLAI : " + soTCHocLai + " HPHK " +HocPhiHK() + " HPHL " +HocPhiHL() + " TONG " +HocPhiTong();
    }
        
    }

 
