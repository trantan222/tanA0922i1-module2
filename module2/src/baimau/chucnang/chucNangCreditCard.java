package baimau.chucnang;

import baimau.model.ATm;
import baimau.model.CreditCard;

import java.util.ArrayList;
import java.util.Scanner;

public class chucNangCreditCard {
    private static ArrayList<CreditCard> creditCards;

    public chucNangCreditCard(ArrayList<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
    public chucNangCreditCard() {
        creditCards = new ArrayList<>();
    }
    public void addCard(){
        CreditCard creditCard = new CreditCard();
        creditCard.inputCreditCard();
        creditCards.add(creditCard);
    }
    public static void WriteCreditCard(){
       WriteFileATMCreditCard creditCard = new WriteFileATMCreditCard();
       creditCard.WriteFileCreditCard("D:\\A0922i1-tan\\module2\\src\\baimau\\card.txt",creditCards);
    }
    public static void ReadCreditCard(){
        ReadFileATMCreditCard readFileCreditCard = new ReadFileATMCreditCard();
        readFileCreditCard.readFile("D:\\A0922i1-tan\\module2\\src\\baimau\\card.txt").forEach(System.out::println);
    }
    public static void payCreditCard(){
        Scanner scanner = new Scanner(System.in);
        int numCard = scanner.nextInt();
        for(CreditCard creditCard : creditCards){
            if(creditCard.getNumCard() == numCard){
                    System.out.println("Nhập số tiền cần thanh toán : ");
                    int payy = scanner.nextInt();
                    if((creditCard.getDuNo() + payy) <= creditCard.getHanMuc()){
                        creditCard.setDuNo(creditCard.getDuNo() + payy);
                    }else {
                        System.out.println(" hạn mức quý khách không đủ !!");
                    }
            }else {
                System.out.println("Không tìm thấy thẻ credit");
            }
        }
    }
    public static void LoadCreditCard(){
        Scanner scanner = new Scanner(System.in);
        int numCard = scanner.nextInt();
        for(CreditCard creditCard : creditCards){
            if(creditCard.getNumCard() == numCard){
                System.out.println("Nhập số muốn nạp : ");
                int payy = scanner.nextInt();
                creditCard.setDuNo((creditCard.getDuNo() - payy));
            }else{
                System.out.println("Không tìm thấy thẻ credit");
            }
        }
    }
    public static void FindCreditCard(){
        Scanner scanner = new Scanner(System.in);
        String hoVaTen = scanner.nextLine();
        for(CreditCard creditCard : creditCards){
            if(creditCard.getName().trim().lastIndexOf(hoVaTen) >=0){
                creditCard.toString();
            }
        }
    }
    public static void DeleteCreditCard(){
        Scanner scanner = new Scanner(System.in);
        int numCard = scanner.nextInt();
        int i;
        for ( i = 0; i <creditCards.size() ; i++) {
            if(creditCards.get(i).getNumCard() == numCard){
                break;
            }
        }
        if(creditCards.get(i).getHanMuc() <=0){
            creditCards.remove(i);
        }
    }

}
