package File.BinaryFile;

import java.util.ArrayList;
import java.util.List;

public class run {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"A",4,"RICE1"));
        list.add(new Product(2,"B",5,"RICE2"));
        list.add(new Product(3,"C",6,"RICE3"));
        list.add(new Product(4,"D",7,"RICE4"));
        list.add(new Product(4,"D",7,"RICE4"));
        Demo2 demo2 = new Demo2();
        demo2.writeObject("D:\\A0922i1-tan\\module2\\src\\File\\BinaryFile\\new.dat",list);
        demo2.readObject("D:\\A0922i1-tan\\module2\\src\\File\\BinaryFile\\new.dat").forEach(System.out::println);
    }
}
