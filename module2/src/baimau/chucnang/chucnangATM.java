package baimau.chucnang;

import baimau.model.ATm;

import java.util.ArrayList;
import java.util.Scanner;

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
    }
    public  static void WriteATM(){
        WriteFileATMCreditCard creditCard = new WriteFileATMCreditCard();
        creditCard.WriteFileATM("D:\\A0922i1-tan\\module2\\src\\baimau\\card.txt",aTmArrayList);
    }
    public static void ReadAtm(){
        ReadFileATMCreditCard readFileATMCreditCard = new ReadFileATMCreditCard();
        readFileATMCreditCard.readFile("D:\\A0922i1-tan\\module2\\src\\baimau\\card.txt").forEach(System.out::println);
    }
    public static void payATM(){
        Scanner scanner = new Scanner(System.in);
        int numCard = scanner.nextInt();
       for(ATm aTm : aTmArrayList){
          if(aTm.getNumCard() == numCard){
              if(aTm.getSoDu() >=0){
                  System.out.println("Nhập số tiền cần thanh toán : ");
                  int payy = scanner.nextInt();
                  aTm.setSoDu(aTm.getSoDu() - payy);
              }
          }else {
              System.out.println(" số tiền quý khách không đủ !!");
          }
       }
    }
    public static void LoadATM(){
        Scanner scanner = new Scanner(System.in);
        int numCard = scanner.nextInt();
        for(ATm aTm : aTmArrayList){
            if(aTm.getNumCard() == numCard){
                    System.out.println("Nhập số muốn nạp : ");
                    int payy = scanner.nextInt();
                    aTm.setSoDu(aTm.getSoDu() + payy);
            }
        }
    }
    public static void FindATM(){
        Scanner scanner = new Scanner(System.in);
        String hoVaTen = scanner.nextLine();
        for(ATm aTm : aTmArrayList){
            if(aTm.getName().trim().lastIndexOf(hoVaTen) >=0){
                aTm.toString();
            }
        }
    }

    public static void DeleteCardATM(){
        Scanner scanner = new Scanner(System.in);
            int numCard = scanner.nextInt();
        int i;
        for ( i = 0; i <aTmArrayList.size() ; i++) {
            if(aTmArrayList.get(i).getNumCard() == numCard){
                break;
            }
        }
          aTmArrayList.remove(i);
    }
    public static void transfer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn loại thẻ gửi ");
        String s = scanner.nextLine();
        System.out.println("Chọn loại thẻ nhận ");
        String s1 = scanner.nextLine();
        if (s.equals("ATM") && s1.equals("ATM")) {
            System.out.println("Nhập numCard thẻ gửi : ");
            int numcard = scanner.nextInt();
            System.out.println("Nhập numCard thẻ nhận : ");
            int numcard1 = scanner.nextInt();
            ATm temp = null;
            for (ATm aTm : aTmArrayList) {
                if(aTm.getNumCard() == numcard){
                     temp = aTm;
                    }
                if(aTm.getNumCard() == numcard1){
                    System.out.println("NHập số tiền cần gửi : ");
                    int money = scanner.nextInt();
                    if(aTm.getSoDu() >= money){
                        int soTienNhan =aTm.getSoDu() + money;
                        aTm.setSoDu(soTienNhan);
                        int soTienConLai = temp.getSoDu() - money;
                        temp.setSoDu(soTienConLai);
                    }else{
                        System.out.println("Tài khoản quý khách không đủ");
                    }
                }
            }
            for(ATm aTm : aTmArrayList){
                if(aTm.equals(temp)){
                    aTm = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
//        chucnangATM atm = new chucnangATM();
//        atm.addCard();
//        atm.WriteATM();
//        chucnangATM.ReadAtm();
    }
}

