
package BaithuchanhQLNV;


public class MainQLNV {
    public static void main(String[] agrs)
    {
    QLNV ds[] = new QLNV[5];
    DATE date = new DATE();
        //MENU quy ước
        System.out.println("GIAM DOC = 1");
        System.out.println("PHO GIAM DOC = 2");
        System.out.println("TRUONG PHONG = 3");
        System.out.println("PHO PHONG  = 4");
        System.out.println("NHAN VIEN = 5");
        System.out.println("---------------------------------");
        //Nhap thong tin Nhan vien
ds[0] = new QLNV("NGUYEN VAN A", new DATE(23, 6, 1999), 1, 2, 100000);
ds[1] = new QLNV("NGUYEN VAN B",new DATE(20, 7, 1998), 2, 2, 10000);
ds[2] = new QLNV("NGUYEN VAN C",new DATE(21, 8, 1997), 3, 2, 1000);  
ds[3] = new QLNV("NGUYEN VAN D",new DATE(24, 8, 1996), 4, 2, 100);  
ds[4] = new QLNV("NGUYEN VAN E", new DATE(23, 8, 1995),5, 2, 10);  
long temp1 = ds[0].tinhLuong();//THONG TIN NV D[1]
 System.out.println(ds[0].layHoten());
        System.out.println("-Luong :"+temp1);
           double temp01 = ds[0].baohiemXH();
           System.out.println("-Tien bao hiem :"+temp01);
              double temp001 = ds[0].thatNghiep();
              System.out.println("-Tien that nghiep :"+temp001);
 double temp0001 = ds[0].tienNhan();
 System.out.println("SO TIEN NHAN DUOC : "+temp0001);
      
              
long temp2 = ds[1].tinhLuong();//THONG TIN NV D[2]
System.out.println(ds[1].layHoten());
        System.out.println("-Luong :"+temp2);
           double temp02 = ds[1].baohiemXH();
           System.out.println("-Tien bao hiem :"+temp02);
              double temp002 = ds[1].thatNghiep();
              System.out.println("-Tien that nghiep :"+temp002);
 double temp0002 = ds[1].tienNhan();
 System.out.println("SO TIEN NHAN DUOC : "+temp0002);            
             
 
long temp3 = ds[2].tinhLuong();//THONG TIN NV D[3]
System.out.println(ds[2].layHoten());
        System.out.println("-Luong :"+temp3);
          double temp03 = ds[2].baohiemXH();
           System.out.println("-Tien bao hiem :"+temp03);
           double temp003 = ds[2].thatNghiep();
              System.out.println("-Tien that nghiep :"+temp003);
  double temp0003 = ds[2].tienNhan();
 System.out.println("SO TIEN NHAN DUOC : "+temp0003);             
              
long temp4 = ds[3].tinhLuong();//THONG TIN NV D[4]
System.out.println(ds[3].layHoten());
        System.out.println("-Luong :"+temp4);
           double temp04 = ds[3].baohiemXH();
           System.out.println("-Tien bao hiem :"+temp04);
           double temp004 = ds[3].thatNghiep();
              System.out.println("-Tien that nghiep :"+temp004);
   double temp0004 = ds[3].tienNhan();
 System.out.println("SO TIEN NHAN DUOC : "+temp0004);            
              
long temp5 = ds[4].tinhLuong();//THONG TIN NV D[5]
System.out.println(ds[4].layHoten());
        System.out.println("-Luong :"+temp5);
           double temp05 = ds[4].baohiemXH();
           System.out.println("-Tien bao hiem :"+temp05);
           double temp005 = ds[4].thatNghiep();
              System.out.println("-Tien that nghiep :"+temp005);
  double temp0005 = ds[4].tienNhan();
 System.out.println("SO TIEN NHAN DUOC : "+temp0005); 
 //IN TONG LUONG CUA 5 NHAN VIEN
 long ABC = 0;

       for(int i = 0 ; i <= 4 ; i++)      
       {
           ABC = ABC + ds[i].tinhLuong();
       }
        System.out.println("TONG SO TIEN LUONG CUA 5 NHAN VIEN = "+ABC);
  //IN luong trung binh cua ds
  long luongTB;
  luongTB = ABC / 5;
  System.out.println(" TIEN LUONG TRUNG BINH CUA 5 NHAN VIEN = "+luongTB);
  //IN SO TUOI LON NHAT CUA NHAN VIEN
  long min = ds[0].layNgaythangnamsinh().layNam();
  for(int i = 0 ; i <= 4 ; i++)
  {
      if(ds[i].layNgaythangnamsinh().layNam() <= min)
      {
          min = ds[i].layNgaythangnamsinh().layNam();
       }
   }
   
       
     for ( int i = 0 ; i <= 4 ; i++)
     {
         if(ds[i].layNgaythangnamsinh().layNam() == min )
         {
             System.out.println("SO TUOI CAO NHAT");
             System.out.println(ds[i].layHoten());
             System.out.println(min);
         }
     }
   }
}
