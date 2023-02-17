package File.DemoFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class run {
    public static void main(String[] args) {
//        System.out.println("Nhập vào đường dẫn ");
//        Scanner sc = new Scanner(System.in);
//        String path = sc.nextLine();
//        FIleRead fIleRead = new FIleRead();
//        fIleRead.ReadFile(path);
            FIleRead fIleRead = new FIleRead();
            List<mark> list = new ArrayList<>();
              list.add(new mark(3));
              list.add(new mark(3));
              list.add(new mark(3));
              list.add(new mark(3));
              fIleRead.writeFile(".\\src\\File\\mark.csv",list);
              fIleRead.ReadFile("C:\\tan\\New folder\\cong.txt");




    }
}
