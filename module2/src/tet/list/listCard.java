package tet.list;
import baimau.model.ATm;
import baimau.model.CreditCard;

import java.util.ArrayList;
import java.util.Scanner;

public class listCard {
    private static int id = 0;
    public void dangkiThe(){
        ArrayList<ATm> aTmArrayList = new ArrayList<>();
        ArrayList<CreditCard> creditCards = new ArrayList<>();
        int choose  = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Chọn thẻ muốn đăng kí ");
            System.out.println("1. ATM" +
                    "2.CreditCard" +
                    "3.exit");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1 :
                        System.out.println("Nhập số thẻ :");
                        int numCard = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Nhập tên chủ thẻ :");
                        String name = scanner.nextLine();
                        System.out.println("Nhập CMND : ");
                        int CMND = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Nhập Địa chỉ :");
                        String address = scanner.nextLine();
                        ATm aTm = new ATm(++id,numCard,name,CMND,address,0);
                        aTmArrayList.add(aTm);
                        System.out.println("Đăng kí thẻ atm thành công ");
                        break;
                case 2 :
                    System.out.println("Nhập số thẻ :");
                    int numCard1 = scanner.nextInt();
                    System.out.println("Nhập tên chủ thẻ :");
                    String name1 = scanner.nextLine();
                    System.out.println("Nhập CMND : ");
                    int CMND1 = scanner.nextInt();
                    System.out.println("Nhập Địa chỉ :");
                    String address1 = scanner.nextLine();
                    System.out.println("Nhập vào hạn mức ");
                    int hanMuc = scanner.nextInt();
                    CreditCard creditCard = new CreditCard(++id,numCard1,name1,CMND1,address1,0,hanMuc);
                    creditCards.add(creditCard);
                    System.out.println("đăng kí thẻ credit thành công");
                    break;
                case 3 :
                    break;
                default:
                    System.out.println("Nhập dữ liệu sai ");
            }

        }while (choose !=3);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int  choose = 0;
        do{
            System.out.println("1. Đăng ký thẻ");
            System.out.println("2.Xuất tất cả các thẻ đang có trong chương trình ra file card.txt");
            System.out.println("3. Đọc danh sách thẻ từ file card.txt");
            System.out.println("4.Thanh toán bằng thẻ");
            System.out.println("5.Nộp tiền vào thẻ");
            System.out.println("6.Tìm card (ATM hoặc Credit card) theo họ tên hoặc CMND/CCCD");
            System.out.println("7.Xây dựng chức năng huỷ thẻ (xoá thẻ)");
            System.out.println("8.Xây dựng chức năng chuyển khoản");
            System.out.println("9.Thoát");
            System.out.println("choose!!");
            choose =Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    listCard listCard = new listCard();
                    listCard.dangkiThe();
                    break;
                case 2:
//                    WriteFileATMCreditCard creditCard = new WriteFileATMCreditCard();
////                    List list = new ArrayList();
////                    list.addAll(aTmArrayList);
////                    list.addAll(creditCards);
//                    creditCard.WriteFileATM("D:\\A0922i1-tan\\module2\\src\\tet\\card.txt",aTmArrayList);
//                    creditCard.WriteFileCreditCard("D:\\A0922i1-tan\\module2\\src\\tet\\card.txt",creditCards);
                    break;
                default:
                    System.out.println("Vui lòng nhập đúng ");
            }
        }while (choose !=9);
    }
}
