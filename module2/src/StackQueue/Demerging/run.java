package StackQueue.Demerging;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class run {
    public static void main(String[] args) {
        List<person> personList = new ArrayList<>();
        personList.add(new person("A","male", LocalDate.parse("1999-2-2")));
        personList.add(new person("B","famale", LocalDate.parse("1998-2-3")));
        personList.add(new person("C","famale", LocalDate.parse("1997-6-11")));
        personList.add(new person("D","male", LocalDate.parse("2000-1-11")));
        personList.add(new person("D","famale", LocalDate.parse("2010-9-12")));
        personList.add(new person("E","male", LocalDate.parse("1996-1-1")));

        Collections.sort(personList, new Comparator<person>() {
            @Override
            public int compare(person o1, person o2) {
                return o1.getGender().compareTo(o2.getGender());
            }
        });
       for(person person : personList){
           System.out.println(person.toString());
       }
    }
}
