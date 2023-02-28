package baimau.chucnang;

import baimau.model.CreditCard;

import java.util.ArrayList;

public class chucNangCreditCard {
    private ArrayList<CreditCard> creditCards;

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
        creditCards.forEach(System.out::println);
    }
    public void WriteCreditCard(){
       WriteFileATMCreditCard creditCard = new WriteFileATMCreditCard();
       creditCard.WriteFileCreditCard("D:\\A0922i1-tan\\module2\\src\\baimau\\card.txt",creditCards);
    }
    public void ReadCreditCard(){
        ReadFileATMCreditCard readFileCreditCard = new ReadFileATMCreditCard();
//        readFileCreditCard.readCreditCard("D:\\A0922i1-tan\\module2\\src\\baimau\\card.txt").forEach(System.out::println);
//        readFileCreditCard.read("D:\\A0922i1-tan\\module2\\src\\baimau\\card.txt").forEach(System.out::println);
    }
//    public static void main(String[] args) {
//        chucNangCreditCard nangCreditCard = new chucNangCreditCard();
////        nangCreditCard.addCard();
////        nangCreditCard.WriteCreditCard();
//        nangCreditCard.ReadCreditCard();
//    }

}
