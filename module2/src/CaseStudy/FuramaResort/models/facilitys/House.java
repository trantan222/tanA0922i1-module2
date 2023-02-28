package CaseStudy.FuramaResort.models.facilitys;

import java.time.LocalDate;

public class House extends Facility{
    private String StdRoom;
    private int floors;

    public House(String name, double area, int cost, int capacity, LocalDate rentTime, String stdRoom, int floors) {
        super(name, area, cost, capacity, rentTime);
        StdRoom = stdRoom;
        this.floors = floors;
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

    @Override
    public String toString() {
        return "House{" +
                "StdRoom='" + StdRoom + '\'' +
                ", floors=" + floors +
                '}';
    }
}
