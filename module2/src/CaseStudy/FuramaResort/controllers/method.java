package CaseStudy.FuramaResort.controllers;

import CaseStudy.FuramaResort.services.CustomerServiceImpl;
import CaseStudy.FuramaResort.services.EmployeeServiceImpl;

import java.util.Scanner;

public class method {
   public static void displayEmployee(){
       Scanner sc = new Scanner(System.in);
       int chooseEmployee = 0;
       do {
           System.out.println("1 Display list employees\n" +
                   "2 Add new employee\n" +
                   "3 Edit employee\n" +
                   "4 Return main menu");
           EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
           System.out.println("Choose Employee !!!");
           chooseEmployee = sc.nextInt();
           switch (chooseEmployee){
               case 1:
                   employeeService.display();
                   break;
               case 2:
                   employeeService.add();
                   break;
               case 3:
                   employeeService.edit();
                   break;
           }
       }while (chooseEmployee != 4);
   }




   public static void displayCustomer(){
       Scanner sc = new Scanner(System.in);
       int chooseCustomer = 0;
       do {
           System.out.println("1. Display list customers\n" +
                   "2. Add new customer\n" +
                   "3. Edit customer\n" +
                   "4. Return main menu");
           CustomerServiceImpl customerService = new CustomerServiceImpl();
           chooseCustomer= sc.nextInt();
           switch (chooseCustomer){
               case 1:
                   customerService.display();
                   break;
               case 2 :
                   customerService.add();
                   break;
               case 3 :
                   customerService.edit();
                   break;
               default:
                   System.out.println("vui long nhap lai");
           }
       }while (chooseCustomer !=4);
   }





    public static void displayFacility(){
        Scanner sc = new Scanner(System.in);
        int chooseFacility = 0;
       do {
           System.out.println("1 Display list facility\n" +
                   "2 Add new facility\n" +
                   "3 Display list facility maintenance\n" +
                   "4 Return main menu");



           chooseFacility = sc.nextInt();
           switch (chooseFacility) {
               case 1 :
               case 2 :
               case 3 :
               case 4 :
           }
       }while (chooseFacility !=4);
    }




    public static void displayContract(){
        Scanner sc = new Scanner(System.in);
        int chooseContract = 0;
        do {
            System.out.println("1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new constracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu");
            chooseContract = sc.nextInt();
            switch (chooseContract) {
                case 1 :
                case 2 :
                case 3 :
                case 4 :
            }
        }while (chooseContract !=4);
    }




    public static void displayService(){
        Scanner sc = new Scanner(System.in);
        int chooseService = 0;
        do {
            System.out.println("1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu");
            chooseService = sc.nextInt();
            switch (chooseService) {
                case 1 :
                case 2 :
                case 3 :
                case 4 :
            }
        }while (chooseService !=4);
    }


}
