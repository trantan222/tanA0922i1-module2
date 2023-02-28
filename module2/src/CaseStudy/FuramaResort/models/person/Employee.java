package CaseStudy.FuramaResort.models.person;

import java.time.LocalDate;
import java.util.Scanner;

public class Employee extends person {
    private String trinhDo;
    private String viTri;
    private double luong;

    public Employee(String ma, String hoTen, LocalDate date, int CMND, int soDt, String email, String trinhDo, String viTri, double luong, String gioiTinh) {
        super(ma, hoTen, date, CMND, soDt, email, gioiTinh);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }


    // Trình độ sẽ lưu trữ các thông tin: Trung cấp, Cao đẳng, Đại học và sau đại học
    // Vị trí sẽ lưu trữ các thông tin: Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám
    //đốc.
    public void input() {
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
        System.out.println("Nhập vào trình độ ");
        String trinhDo = scanner.nextLine();
        System.out.println("Nhập vào vị trí ");
        String viTri = scanner.nextLine();
        System.out.println("Nhập vào lương ");
        double luong = scanner.nextDouble();

    }

    public void output() {
        System.out.println("MS: " + this.getMa()
                + "\n" + "Ten: "
                + this.getHoTen()
                + "\n" + "Ngày sinh: "
                + this.getDate()
                + "\n" + "Giới tính: "
                + this.getGender()
                + "\n" + "numberId: "
                + this.getMa()
                + "\n" + "numberPhone"
                + this.getSoDt()
                + "\n" + "Email: "
                + this.getEmail()
                + "\n" + "Salary: "
                + this.getLuong()
                + "\n" + "Vị trí: "
                + this.getViTri()
                + "\n" + "Trình độ: "
                + this.getTrinhDo()
                + "\n"
        );
    }
}

