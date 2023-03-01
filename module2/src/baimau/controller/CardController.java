package baimau.controller;

import baimau.chucnang.chucNangCreditCard;
import baimau.chucnang.chucnangATM;

import java.util.Scanner;

public class CardController {
    private static void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        int choose;
        do{
            System.out.println("1.Dang ki the");
            System.out.println("2.Xuất các thẻ ra file ");
            System.out.println("3.đọc file");
            System.out.println("4.Thanh Toán bằng thẻ");
            System.out.println("5.Nộp Tiền Vào Thẻ");
            System.out.println("6.Tìm Card");
            System.out.println("7.Xóa thẻ");
            System.out.println("8.Chuyển Khoản");
            System.out.println("9.Thoát");
            choose = scanner.nextInt();
            switch (choose){
                case 1 :
                    CardController.DangKi();
                    break;
                case 2: {
                   chucnangATM.WriteATM();
                   chucNangCreditCard.WriteCreditCard();
                   break;
                }
                case 3:{
                    chucnangATM.ReadAtm();
                    break;
                }
                case 4 :{
                    CardController.Pay();
                    break;
                }
                case 5 :{
                    CardController.Load();
                    break;
                }
                case 6 :{
                    CardController.Find();
                    break;
                }
                case 7 :{
                    CardController.Delete();
                    break;
                }
                case 8 :{
                   chucnangATM.transfer();
                    break;
                }
                case 9 :{
                   return;
                }
                default:
                    System.out.println("Vui lòng nhap lai");
            }
        }while (choose !=9);
    }
    private static void DangKi(){
        Scanner sc = new Scanner(System.in);
        int choose;
        do{
            System.out.println("1.ATM");
            System.out.println("2.CreditCard");
            System.out.println("3.MainMenu");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1 :{
                    chucnangATM atm  = new chucnangATM();
                    atm.addCard();
                    break;
                }
                case 2 : {
                    chucNangCreditCard nangCreditCard = new chucNangCreditCard();
                    nangCreditCard.addCard();
                    break;
                }
                case 3:{
                    return;
                }
            }
        }while (choose !=3);
    }

    public static void Pay(){
        Scanner sc = new Scanner(System.in);
        int choose;
        do{
            System.out.println("1.ATM");
            System.out.println("2.CreditCard");
            System.out.println("3.MainMenu");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1 :{
                    chucnangATM.payATM();
                    break;
                }
                case 2 : {
                    chucNangCreditCard.payCreditCard();
                    break;
                }
                case 3:{
                    return;
                }
            }
        }while (choose !=3);
    }

    private static void Load(){
        Scanner sc = new Scanner(System.in);
        int choose;
        do{
            System.out.println("1.ATM");
            System.out.println("2.CreditCard");
            System.out.println("3.MainMenu");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1 :{
                    chucnangATM.LoadATM();
                    break;
                }
                case 2 : {
                    chucNangCreditCard.LoadCreditCard();
                    break;
                }
                case 3:{
                    return;
                }
            }
        }while (choose !=3);
    }
    private static void Find(){
        Scanner sc = new Scanner(System.in);
        int choose;
        do{
            System.out.println("1.ATM");
            System.out.println("2.CreditCard");
            System.out.println("3.MainMenu");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1 :{
                    chucnangATM.FindATM();
                    break;
                }
                case 2 : {
                    chucNangCreditCard.FindCreditCard();
                    break;
                }
                case 3:{
                    return;
                }
            }
        }while (choose !=3);
    }
    private static void Delete(){
        Scanner sc = new Scanner(System.in);
        int choose;
        do{
            System.out.println("1.ATM");
            System.out.println("2.CreditCard");
            System.out.println("3.MainMenu");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1 :{
                    chucnangATM.DeleteCardATM();
                    break;
                }
                case 2 : {
                    chucNangCreditCard.DeleteCreditCard();
                    break;
                }
                case 3:{
                    return;
                }
            }
        }while (choose !=3);
    }
    public static void main(String[] args) {
    displayMainMenu();
    }

}
