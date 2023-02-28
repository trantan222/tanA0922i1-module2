package CaseStudy.FuramaResort.controllers;

import CaseStudy.FuramaResort.services.CustomerServiceImpl;
import CaseStudy.FuramaResort.services.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose =0;
        do {
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");
            System.out.println("Choose!!!");
            choose = sc.nextInt();
            if (choose == 1) {
                method.displayEmployee();
            } else if (choose == 2) {
                method.displayCustomer();
            } else if (choose == 3) {
                method.displayFacility();
            } else if (choose == 4) {
              method.displayContract();
            } else if (choose == 5) {
             method.displayService();
            }
        }while (choose !=6);



    }
}
