package CaseStudy.FuramaResort.services;
import CaseStudy.FuramaResort.models.person.Customer;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements  CustomerService{
    LinkedList<Customer> customerLinkedList ;
    public CustomerServiceImpl(){
        customerLinkedList = new LinkedList<>();
    }

    public CustomerServiceImpl(LinkedList<Customer> customerLinkedList) {
        this.customerLinkedList = customerLinkedList;
    }
    public void display(){
        for (int i = 0; i <customerLinkedList.size() ; i++) {
            System.out.println(customerLinkedList.get(i));
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
        System.out.println("Nhập vào loại khách hàng ");
        String loaiKhachHang = scanner.nextLine();
        System.out.println("Nhập vào địa chỉ ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập vào gioi tinh ");
        String gioiTinh = scanner.nextLine();
        Customer customer = new Customer(ma,hoTen,date,CMND,Sdt,email,loaiKhachHang,diaChi,gioiTinh);
        customerLinkedList.add(customer);
        System.out.println("Thêm khách hàng thành công !!");
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tên ");
        String hoTen = scanner.nextLine();
        for (int i = 0; i <customerLinkedList.size() ; i++) {
            if(customerLinkedList.get(i).getHoTen().equals(hoTen)){

                System.out.println("Nhập vào mã cần sửa");
                String ma = scanner.nextLine();
                customerLinkedList.get(i).setMa(ma);

                System.out.println("Nhập vào thời gian cần sửa ");
                LocalDate date = LocalDate.parse(scanner.nextLine());
                customerLinkedList.get(i).setDate(date);

                System.out.println("Nhập vào CMND cần sửa");
                int CMND = scanner.nextInt();
                customerLinkedList.get(i).setCMND(CMND);

                System.out.println("Nhập vào số điện thoại cần sửa");
                int Sdt = scanner.nextInt();
                customerLinkedList.get(i).setSoDt(Sdt);

                System.out.println("Nhập vào email cần sửa");
                String email = scanner.nextLine();
                customerLinkedList.get(i).setEmail(email);

                System.out.println("Nhập vào loại khách hàng cần sửa");
                String loaiKhachHang = scanner.nextLine();
                customerLinkedList.get(i).setLoaiKhachHang(loaiKhachHang);

                System.out.println("Nhập vào địa chỉ cần sửa");
                String diaChi = scanner.nextLine();
                customerLinkedList.get(i).setDiaChi(diaChi);

            }

    }
    }

    }
