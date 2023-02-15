package StackQueue.Demerging;

import java.time.LocalDate;
import java.util.Date;

public class person {
   private String name;
   private String gender;
   private LocalDate date;

    public person(String name, String gender, LocalDate date) {
        this.name = name;
        this.gender = gender;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
