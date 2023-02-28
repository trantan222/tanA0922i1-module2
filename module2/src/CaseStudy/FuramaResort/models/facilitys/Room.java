package CaseStudy.FuramaResort.models.facilitys;

import java.time.LocalDate;

public class Room extends Facility{

    private boolean service;

    public Room(String name, double area, int cost, int capacity, LocalDate rentTime, boolean service) {
        super(name, area, cost, capacity, rentTime);
        this.service = service;
    }



    public boolean isService() {
        return service;
    }

    public void setService(boolean service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Room{" +
                "service=" + service +
                '}';
    }
}
