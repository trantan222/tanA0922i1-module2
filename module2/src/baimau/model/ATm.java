package baimau.model;

import java.util.Scanner;

public class ATm extends Card{
    private int soDu;

    public ATm(int numCard, String name, int CMND, String address,int soDu) {
        super(numCard, name, CMND, address);
        this.soDu = 0;
    }

    public ATm() {
    }
    public ATm(String arr []) {
     this.setNumCard(Integer.parseInt(arr[0]));
     this.setName(arr[1]);
     this.setCMND(Integer.parseInt(arr[2]));
     this.setAddress(arr[3]);
     this.setSoDu(0);
    }

    public int getSoDu() {
        return soDu;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "numCard=" + getNumCard() +
                ", name='" + getName() + '\'' +
                ", CMND=" + getCMND() +
                ", address='" + getAddress() + '\'' +
                "soDu=" + soDu +
                '}';
    }
    public void inputATM(){
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
        this.setSoDu(0);
    }
}
