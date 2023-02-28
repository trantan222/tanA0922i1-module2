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
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.");
            System.out.println("8.");
            System.out.println("9.");
            choose = scanner.nextInt();
            switch (choose){
                case 1 :
                    CardController.Choose();
                    break;
                case 2: {
                   chucnangATM.WriteATM();
                }
                case 3:{
                    chucnangATM.ReadAtm();
                }
            }
        }while (choose !=9);
    }
    private static void Choose(){
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
    public static void main(String[] args) {
    displayMainMenu();
    }

}
