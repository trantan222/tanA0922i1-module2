package DemoPerson;

import java.util.ArrayList;
import java.util.List;

public class tet {
    public static void main(String[] args) {
        FileUtil f = new FileUtil();
        List<person> personList= new ArrayList<>();
        personList.add(new person("A",1,"AAA"));
        personList.add(new person("B",2,"BBB"));
        personList.add(new person("C",3,"CCC"));
        personList.add(new person("D",4,"DDD"));
        f.writeToFile3(".\\src\\DemoPerson\\student.csv",personList);
//        List<person> list = f.ReadFile(".\\src\\DemoPerson\\student.csv");
//        list.forEach(System.out::println);
    }
}
