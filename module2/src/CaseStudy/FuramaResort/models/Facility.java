package CaseStudy.FuramaResort.models;

import java.time.LocalDate;

public  abstract class Facility {
    private String name;
    private double Area;
    private int cost;
    private int capacity;
    private LocalDate RentTime;

    public Facility(String name, double area, int cost, int capacity, LocalDate rentTime) {
        this.name = name;
        Area = area;
        this.cost = cost;
        this.capacity = capacity;
        RentTime = rentTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LocalDate getRentTime() {
        return RentTime;
    }

    public void setRentTime(LocalDate rentTime) {
        RentTime = rentTime;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "name='" + name + '\'' +
                ", Area=" + Area +
                ", cost=" + cost +
                ", capacity=" + capacity +
                ", RentTime=" + RentTime +
                '}';
    }
}
