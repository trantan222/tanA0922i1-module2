package File.BinaryFile;

import java.io.Serializable;

public class Product implements Serializable {
//    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private double price;
    private String description;
    private static int count;

    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }
    public Product(String[] data) {
        this.id = Integer.parseInt(data[0]);
        this.name = data[1];
        this.price = Double.parseDouble(data[2]);
        this.description = data[3];
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
