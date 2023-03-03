package baimau.chucnang;

import baimau.model.ATm;

import java.util.ArrayList;
import java.util.Scanner;

public class chucnangATM {

    public static ArrayList<ATm> aTmArrayList = new ArrayList<>();
    public  void addCard(){
       ATm aTm = new ATm();
       aTm.inputATM();
       aTmArrayList.add(aTm);
       WriteATM();
    }
    public  static void WriteATM(){

        WriteFileATMCreditCard.WriteFile("D:\\A0922i1-tan\\module2\\src\\baimau\\card.txt");
    }
    public static void ReadAtm(){
        ReadFileATMCreditCard.readFile("D:\\A0922i1-tan\\module2\\src\\baimau\\card.txt");
    }
    public static void payATM(){
        Scanner scanner = new Scanner(System.in);
        int dem = 0;
        System.out.println("Nhap numcard");
        int numCard = scanner.nextInt();
       for(ATm aTm : aTmArrayList){
          if(aTm.getNumCard() == numCard){
              if(aTm.getSoDu() >0){
                  System.out.println("Nhập số tiền cần thanh toán : ");
                  int payy = scanner.nextInt();
                  aTm.setSoDu(aTm.getSoDu() - payy);
                  System.out.println("thanh toan thanh cong");
                  dem++;
              }
          }
       }
       if(dem==0) {
            System.out.println(" khong tim thay tai khoan !!");
        }
    }
    public static void LoadATM(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input numcard");
        int numCard = scanner.nextInt();
        for(ATm aTm : aTmArrayList){
            if(aTm.getNumCard() == numCard){
                    System.out.println("Nhập số muốn nạp : ");
                    int payy = scanner.nextInt();
                    aTm.setSoDu(aTm.getSoDu() + payy);
                System.out.println("Nap tien thanh cong");
            }
        }
    }
    public static void FindATM(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho va ten chu the ");
        String hoVaTen = scanner.nextLine();
        for(ATm aTm : aTmArrayList){
            if(aTm.getName().trim().lastIndexOf(hoVaTen) >=0){
                System.out.println(aTm);
            }
        }
    }

    public static void DeleteCardATM(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numCard");
            int numCard = scanner.nextInt();
        int i;
        for ( i = 0; i <aTmArrayList.size() ; i++) {
            if(aTmArrayList.get(i).getNumCard() == numCard){
                break;
            }
        }
          aTmArrayList.remove(i);
        System.out.println("Xoa Thanh Cong");
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
                     break;
                    }
            }
            for(ATm aTm : aTmArrayList){
                if(aTm.getNumCard() == numcard1){
                    System.out.println("NHập số tiền cần gửi : ");
                    int money = scanner.nextInt();
                    if(temp.getSoDu() >= money){
                        int soTienNhan =aTm.getSoDu() + money;
                        aTm.setSoDu(soTienNhan);
                        int soTienConLai = temp.getSoDu() - money;
                        temp.setSoDu(soTienConLai);
                        System.out.println("Chuyen Khoan Thanh Cong");
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

