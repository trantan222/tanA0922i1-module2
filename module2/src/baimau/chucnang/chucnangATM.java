package baimau.chucnang;

import baimau.model.ATm;

import java.util.ArrayList;

public class chucnangATM {
    public static ArrayList<ATm> aTmArrayList;
    public chucnangATM(ArrayList<ATm> aTmArrayList) {
        this.aTmArrayList = aTmArrayList;
    }
    public chucnangATM(){
        aTmArrayList = new ArrayList<>();
    }
    public  void addCard(){
       ATm aTm = new ATm();
       aTm.inputATM();
       aTmArrayList.add(aTm);
//       aTmArrayList.forEach(System.out::println);
    }
    public  static void WriteATM(){
        WriteFileATMCreditCard creditCard = new WriteFileATMCreditCard();
        creditCard.WriteFileATM("D:\\A0922i1-tan\\module2\\src\\baimau\\card.txt",aTmArrayList);
//        aTmArrayList.forEach(System.out::println);
    }
    public static void ReadAtm(){
        ReadFileATMCreditCard readFileATMCreditCard = new ReadFileATMCreditCard();
        readFileATMCreditCard.readFIleATm("D:\\A0922i1-tan\\module2\\src\\baimau\\card.txt").forEach(System.out::println);
    }

    public static void main(String[] args) {
//        chucnangATM atm = new chucnangATM();
//        atm.addCard();
//        atm.WriteATM();
        chucnangATM.ReadAtm();
    }
}

