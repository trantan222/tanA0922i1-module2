package javaCollectionFrameWork.LinkedList;

public class Product implements Comparable<Product>{
    private String name;
    private String id;
    private int cost;

    public Product(String name, String id, int cost) {
        this.name = name;
        this.id = id;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cost=" + cost +
                '}';
    }


    @Override
    public int compareTo(Product o) {
        return this.cost - o.cost;
    }
}
