package DemoPerson;

public class person implements Comparable<person>{
    private String name;
    private int id ;
    private String address;

    public person(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }


    @Override
    public int compareTo(person o) {
        return this.name.compareTo(o.name) ;
    }
    public String ToStringFile(){
        return name +","+ id + "," + address;
    }

    public person(String data[]) {
        this.name = data[0];
        this.id = Integer.parseInt(data[1]);
        this.address = data[2];
    }
}
