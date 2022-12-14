
package com.mycompany.qlhocphi;


public abstract class HocPhi {
    //Tao doi tuong
    protected String hoTen;
    protected String nganh;
    protected String doiTuong;
    protected int soTCHocLai;
    //Phuong thuc khoi tao
    public HocPhi()
    {
        hoTen = "";
        nganh = "";
        doiTuong = "";
        soTCHocLai = 0;
    }

    public HocPhi(String hoTen, String nganh, String doiTuong, int soTCHocLai) {
        this.hoTen = hoTen;
        this.nganh = nganh;
        this.doiTuong = doiTuong;
        this.soTCHocLai = soTCHocLai;
    }
    abstract  public int HocPhiHK();
    abstract  public int HocPhiHL();
    abstract  public int HocPhiTong();
    abstract  public String HienThi();
}
