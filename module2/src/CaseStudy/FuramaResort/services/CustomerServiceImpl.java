package CaseStudy.FuramaResort.services;

import ArrayList_List_LinkedList.TrienKhaiArrayList.LinkedList;
import CaseStudy.FuramaResort.models.Customer;
import CaseStudy.FuramaResort.models.Employee;

import java.time.LocalDate;

public class CustomerServiceImpl {
    LinkedList<Customer> customerLinkedList ;
    public CustomerServiceImpl(){
        customerLinkedList = new LinkedList<>();
    }

    public CustomerServiceImpl(LinkedList<Customer> customerLinkedList) {
        this.customerLinkedList = customerLinkedList;
    }
    public void display(){
        for (int i = 0; i <customerLinkedList.Size() ; i++) {
            System.out.println(customerLinkedList.get(i));
        }
    }
    public void add(Customer customer){
        customerLinkedList.add(customer);
    }
    public void edit(String EditCustomer, String ma, LocalDate date, int CMND, int soDt,
                     String email, String trinhDo, String viTri, double luong) {
//        for(Customer customer : customerLinkedList){
//
//        }
    }
    }
