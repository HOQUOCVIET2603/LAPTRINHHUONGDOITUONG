
package BaithuchanhQLNV;

public class QLNV {
     private String hoten;
    private DATE date;
    private int chucvu;
    private float hesoluong;
    private long luongcoban;
    public  QLNV(){}

    public QLNV(String hoten, DATE date, int chucvu, float hesoluong, long luongcoban) {
        this.hoten = hoten;
        this.date = date;
        this.chucvu = chucvu;
        this.hesoluong = hesoluong;
        this.luongcoban = luongcoban;
    }
    public DATE layNgaythangnamsinh()
    {
        return date;
    }
  public String layHoten()
  {
      return hoten;
  }
  //a.	Tính lương theo công thức: lương = (hệ số lương + hệ số phụ cấp)*lương cơ bản. 

  //Giám đốc: 1.0, Phó giám đốc: 0.8, Trưởng phòng: 0.5, phó phòng: 0.4.
  //HAM TINH LUONG
    public long tinhLuong()
    {
        long luong;
        if (chucvu == 1)
        {
         luong = (long) (hesoluong + 1.0)*luongcoban;
         return luong;
        }
        if(chucvu == 2)
        {
            luong = (long) (hesoluong + 0.8)*luongcoban;
         return luong;
        }
        if(chucvu == 3)
        {
            luong = (long) (hesoluong + 0.5)*luongcoban;
         return luong;
        }
        if(chucvu == 4)
        {
            luong = (long) (hesoluong + 0.4)*luongcoban;
         return luong;
        }
        if(chucvu == 5)
        {
            luong = (long) (hesoluong + 0)*luongcoban;
         return luong;
        }
        return 0;
    }
   //HAM TINH BAO HIEM XA HOI
    //b Tính tiền bảo hiểm xã hội: bằng 6% lương.
    public double baohiemXH()
    {
        double xh;
        if (chucvu == 1)
        {
            xh = (double)(hesoluong + 1.0)*luongcoban*0.06;
            return xh;
        }
         if (chucvu == 2)
        {
            xh = (double)(hesoluong + 0.8)*luongcoban*0.06;
            return xh;
        }
          if (chucvu == 3)
        {
            xh = (double)(hesoluong + 0.5)*luongcoban*0.06;
            return xh;
        }
           if (chucvu == 4)
        {
            xh = (double)(hesoluong + 0.4)*luongcoban*0.06;
            return xh;
        }
            if (chucvu == 5)
        {
            xh = (double)(hesoluong + 0)*luongcoban*0.06;
            return xh;
        }
        return 0;
    }
    //HAM TINH TIEN THAT NGHIEP
    //c.Tính tiền bảo hiểm thất nghiệp: bằng 1% lương.
    public double thatNghiep()
    {
        double tn;
        if(chucvu == 1)
        {
            tn = (hesoluong + 1.0)*luongcoban*0.01;
            return tn;
        }
        if(chucvu == 2)
        {
            tn = (hesoluong + 0.8)*luongcoban*0.01;
            return tn;
        }
        if(chucvu == 3)
        {
            tn = (hesoluong + 0.5)*luongcoban*0.01;
            return tn;
        }
        if(chucvu == 4)
        {
            tn = (hesoluong + 0.4)*luongcoban*0.01;
            return tn;
        }
        if(chucvu == 5)
        {
            tn = (hesoluong + 0)*luongcoban*0.01;
            return tn;
        }
        return 0;
    }
    //HAM TINH TIEN NHAN DUOC
    //d Tính số tiền còn nhận: bằng lương trừ bảo hiểm xã hội và bảo hiểm thất nghiệp.
    public double tienNhan()
    {
        double  tien;
        if (chucvu == 1)
        {
            tien = ((hesoluong + 1.0)*luongcoban) - 
    (((hesoluong + 1.0)*luongcoban*0.06) + ((hesoluong + 1.0)*luongcoban*0.01));
            return tien;
        }
        if (chucvu == 2)
        {
            tien = ((hesoluong + 0.8)*luongcoban) - 
    (((hesoluong + 0.8)*luongcoban*0.06) + ((hesoluong + 0.8)*luongcoban*0.01));
            return tien;
        }
        if (chucvu == 3)
        {
            tien = ((hesoluong + 0.5)*luongcoban) - 
    (((hesoluong + 0.5)*luongcoban*0.06) + ((hesoluong + 0.5)*luongcoban*0.01));
            return tien;
        }
        if (chucvu == 4)
        {
            tien = ((hesoluong + 0.4)*luongcoban) - 
    (((hesoluong + 0.4)*luongcoban*0.06) + ((hesoluong + 0.4)*luongcoban*0.01));
            return tien;
        }
        if (chucvu == 5)
        {
            tien = ((hesoluong + 0)*luongcoban) - 
    (((hesoluong + 0)*luongcoban*0.06) + ((hesoluong + 0)*luongcoban*0.01));
            return tien;
        }
        return 0;
    }
    
}
