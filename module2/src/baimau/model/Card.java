package baimau.model;

public abstract class Card {

    private int id;
    private int numCard;
    private String name;
    private int CMND;
    private String address;


    public Card(int id ,int numCard, String name, int CMND, String address) {
        this.id = id;
        this.numCard = numCard;
        this.name = name;
        this.CMND = CMND;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Card() {
    }
    //    public Card(String arr[]) {
//        this.numCard = Integer.parseInt(arr[0]);
//        this.name = arr[1];
//    }

    public int getNumCard() {
        return numCard;
    }

    public void setNumCard(int numCard) {
        this.numCard = numCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "numCard=" + numCard +
                ", name='" + name + '\'' +
                ", CMND=" + CMND +
                ", address='" + address + '\'' +
                '}';
    }
}
