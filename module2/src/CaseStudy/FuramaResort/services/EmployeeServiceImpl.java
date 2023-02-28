package CaseStudy.FuramaResort.services;

import CaseStudy.FuramaResort.models.person.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    ArrayList<Employee> employees ;

    public EmployeeServiceImpl() {
        employees = new ArrayList<>();
    }
    public EmployeeServiceImpl(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void display(){
        for(Employee employee : employees){
           employee.output();
        }
    }
    @Override
    public void add() {
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
        scanner.nextLine();
        System.out.println("Nhập vào email ");
        String email = scanner.nextLine();
        System.out.println("Nhập vào trình độ ");
        String trinhDo = scanner.nextLine();
        System.out.println("Nhập vào vị trí ");
        String viTri = scanner.nextLine();
        System.out.println("Nhập vào lương ");
        double luong = scanner.nextDouble();
        System.out.println("Nhap gioi tinh");
        String gioiTinh = scanner.nextLine();
        Employee employee = new Employee(ma,hoTen,date,CMND,Sdt,email,trinhDo,viTri,luong,gioiTinh);
        employees.add(employee);
        System.out.println("Thêm nhân viên thành công !!");
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên ");
        String hoTen = scanner.nextLine();
        for (Employee employee : employees) {
            if (employee.getHoTen().equals(hoTen)) {
                System.out.println("Nhập vào mã ");
                String ma = scanner.nextLine();
                employee.setMa(ma);

                System.out.println("Nhập vào thời gian ");
                LocalDate date = LocalDate.parse(scanner.nextLine());
                employee.setDate(date);

                System.out.println("Nhập vào CMND ");
                int CMND = scanner.nextInt();
                employee.setCMND(CMND);

                System.out.println("Nhập vào số điện thoại ");
                int Sdt = scanner.nextInt();
                employee.setSoDt(Sdt);

                System.out.println("Nhập vào email ");
                String email = scanner.nextLine();
                employee.setEmail(email);

                System.out.println("Nhập vào trình độ ");
                String trinhDo = scanner.nextLine();
                employee.setTrinhDo(trinhDo);

                System.out.println("Nhập vào vị trí ");
                String viTri = scanner.nextLine();
                employee.setViTri(viTri);

                System.out.println("Nhập vào lương ");
                double luong = scanner.nextDouble();
                employee.setLuong(luong);
            }else {
                System.out.println("Không tìm thấy tên nhân viên !!!");
            }
        }
    }

}
