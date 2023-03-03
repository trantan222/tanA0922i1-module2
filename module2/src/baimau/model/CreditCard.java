package baimau.model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CreditCard extends Card {
    private int duNo;
    private int hanMuc;

    public CreditCard(int id,int numCard, String name, int CMND, String address, int duNo, int hanMuc) {
        super(id,numCard, name, CMND, address);
        this.duNo = 0;
        this.hanMuc = hanMuc;
    }

    public CreditCard() {
    }

    public CreditCard(String arr[]) {
        this.setNumCard(Integer.parseInt(arr[0]));
        this.setName(arr[1]);
        this.setCMND(Integer.parseInt(arr[2]));
        this.setAddress(arr[3]);
        this.setDuNo(0);
        this.setHanMuc(Integer.parseInt(arr[5]));
    }

    public int getDuNo() {
        return duNo;
    }

    public void setDuNo(int duNo) {
        this.duNo = duNo;
    }

    public int getHanMuc() {
        return hanMuc;
    }

    public void setHanMuc(int hanMuc) {
        this.hanMuc = hanMuc;
    }


    public String toStringFile() {
        return getId() +"," +
                getNumCard() + "," +
                getName() + "," +
                getCMND() + "," +
                getAddress() + "," +
                duNo + "," +
                hanMuc;

    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "id=" +getId()+
                "numCard=" + getNumCard() +
                ", name='" + getName() + '\'' +
                ", CMND=" + getCMND() +
                ", address='" + getAddress() + '\'' +
                "duNo=" + duNo +
                ", hanMuc=" + hanMuc +
                '}';
    }
    public void inputCreditCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thẻ :");
        int numCard = scanner.nextInt();
        scanner.nextLine();
        this.setNumCard(numCard);

        System.out.println("Nhập tên chủ thẻ :");
        String name = scanner.nextLine();
        this.setName(name);

        System.out.println("Nhập CMND : ");
        int CMND = scanner.nextInt();
        scanner.nextLine();
        this.setCMND(CMND);

        System.out.println("Nhập Địa chỉ :");
        String address = scanner.nextLine();
        this.setAddress(address);

        System.out.println("Nhập vào hạn mức ");
        int hanMuc = scanner.nextInt();
        this.setHanMuc(hanMuc);
        setId(++ATm.id);
    }
}
