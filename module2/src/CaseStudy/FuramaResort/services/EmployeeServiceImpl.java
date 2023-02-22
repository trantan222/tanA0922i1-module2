package CaseStudy.FuramaResort.services;

import CaseStudy.FuramaResort.models.Employee;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeeServiceImpl {
    ArrayList<Employee> employees ;

    public EmployeeServiceImpl() {
        employees = new ArrayList<>();
    }
    public EmployeeServiceImpl(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void display(){
        employees.forEach(System.out::println);
    }
    public void add(Employee employee){
        employees.add(employee);
    }
    public void edit(String Editemployee,String ma, LocalDate date, int CMND, int soDt,
                     String email, String trinhDo, String viTri, double luong) {
        for (Employee employee : employees) {
            if (employee.getHoTen().equals(Editemployee)) {
                employee.setMa(ma);
                employee.setDate(date);
                employee.setCMND(CMND);
                employee.setSoDt(soDt);
                employee.setEmail(email);
                employee.setTrinhDo(trinhDo);
                employee.setViTri(viTri);
                employee.setLuong(luong);
            }
        }
    }
}
