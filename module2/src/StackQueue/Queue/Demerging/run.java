package StackQueue.Queue.Demerging;

import java.time.LocalDate;
import java.util.*;

public class run {
    public static void main(String[] args) {
        ArrayList<person> personList = new ArrayList<>();
        ArrayList<person> result = new ArrayList<>();
        personList.add(new person("A","male", LocalDate.parse("2008-02-02")));
        personList.add(new person("B","famale", LocalDate.parse("1998-02-03")));
        personList.add(new person("C","famale", LocalDate.parse("1997-06-11")));
        personList.add(new person("D","male", LocalDate.parse("2000-01-11")));
        personList.add(new person("E","famale", LocalDate.parse("2010-09-12")));
        personList.add(new person("F","male", LocalDate.parse("1996-01-10")));
        Collections.sort(personList);
        Queue<person> maleQueue = new LinkedList<>();
        Queue<person> femaleQueue = new LinkedList<>();
      for(person person : personList){
          if(person.getGender().toLowerCase().equals("male")){
              maleQueue.add(person);
          } else {
              femaleQueue.add(person);
          }

      }
        result.addAll(femaleQueue);
        result.addAll(maleQueue);
        result.forEach(System.out::println);
    }
}
