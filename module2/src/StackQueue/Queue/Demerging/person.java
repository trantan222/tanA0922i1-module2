package StackQueue.Queue.Demerging;

import java.time.LocalDate;

public class person implements Comparable<person>{
   private String name;
   private String gender;
   private LocalDate date;

    public person(String name, String gender, LocalDate date) {
        this.name = name;
        this.gender = gender;
        this.date = date;
    }

    public person() {
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

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public int compareTo(person o) {
        return this.date.compareTo(o.date);
    }
}
