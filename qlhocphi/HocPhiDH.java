
package com.mycompany.qlhocphi;


public class HocPhiDH extends HocPhi{

    public HocPhiDH() {
    }

    public HocPhiDH(String hoTen, String nganh, String doiTuong, int soTCHocLai) {
        super(hoTen, nganh, doiTuong, soTCHocLai);
    }

    @Override
    //Phuong thuc tinh hp hk
    public int HocPhiHK() {
       //Ma nganh : 101 , 102 , 103
       //Doi tuong : 01,02,03,04
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
           return (hp - (hp * 100/100));
       }
       if ( doiTuong.equals("02"))
       {
           return  (hp - (hp * 70/100));
       }
       if ( doiTuong.equals("03"))
       {
            return  (hp - (hp * 50/100));
       }
       if ( doiTuong.equals("04"))
       {
            return  hp;
       }
       else
           return 0;
       
    }

    @Override
    public int HocPhiHL() {
        if ( nganh.equals("101")|| nganh.equals("103"))
        {
            return 200000*soTCHocLai;
        }
        if ( nganh.equals("102"))
        {
            return 225000*soTCHocLai;
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
