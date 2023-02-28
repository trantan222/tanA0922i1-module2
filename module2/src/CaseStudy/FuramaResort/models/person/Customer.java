package CaseStudy.FuramaResort.models.person;

import java.time.LocalDate;
import java.util.Scanner;

public class Customer extends person{

    private String loaiKhachHang;   //Loại Customer bao gồm: (Diamond, Platinium, Gold, Silver, Member).
    private String diaChi;

    public Customer(String ma, String hoTen, LocalDate date, int CMND, int soDt, String email, String loaiKhachHang, String diaChi,String gioiTinh) {
        super(ma, hoTen, date, CMND, soDt, email,gioiTinh);
        this.loaiKhachHang = loaiKhachHang;
        this.diaChi = diaChi;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "loaiKhachHang='" + loaiKhachHang + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
    public String toString1(){
        return "Mã: "+this.getMa()+" Họ và tên : "+this.getHoTen() + "Ngày Sinh" + this.getDate()
                + "CMND "+this.getCMND() +" sdt : "+this.getSoDt() +"Email" +this.getEmail()
                + toString();
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã ");
        String ma = scanner.nextLine();
        System.out.println("Nhập vào tên ");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập vào thời gian ");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        System.out.println("Nhập vào CMND ");
        int CMND = scanner.nextInt();
        System.out.println("Nhập vào số điện thoại ");
        int Sdt = scanner.nextInt();
        System.out.println("Nhập vào email ");
        String email = scanner.nextLine();
        System.out.println("Nhập vào loại khách hàng ");
        String loaiKhachHang = scanner.nextLine();
        System.out.println("Nhập vào địa chỉ ");
        String diaChi = scanner.nextLine();

    }
}
