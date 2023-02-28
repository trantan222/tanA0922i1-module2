package CaseStudy.FuramaResort.models.facilitys;

import java.time.LocalDate;

public class Villa extends Facility{

    private String StdRoom;
    private int floors;
    private double areaPoor;

    public Villa(String name, double area, int cost, int capacity, LocalDate rentTime, String stdRoom, int floors, double areaPoor) {
        super(name, area, cost, capacity, rentTime);
        StdRoom = stdRoom;
        this.floors = floors;
        this.areaPoor = areaPoor;
    }

    public String getStdRoom() {
        return StdRoom;
    }

    public void setStdRoom(String stdRoom) {
        StdRoom = stdRoom;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public double getAreaPoor() {
        return areaPoor;
    }

    public void setAreaPoor(double areaPoor) {
        this.areaPoor = areaPoor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "StdRoom='" + StdRoom + '\'' +
                ", floors=" + floors +
                ", areaPoor=" + areaPoor +
                '}';
    }
}
