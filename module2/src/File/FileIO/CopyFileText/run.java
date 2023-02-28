package File.FileIO.CopyFileText;

import java.util.List;

public class run {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        List<String> list = readFile.readToFile("D:\\A0922i1-tan\\module2\\src\\File\\FileIO\\CopyFileText\\text.csv");
        list.forEach(System.out::println);
//        readFile.WriteToFile(".\\src\\File\\CopyFileText\\text.csv",list);
    }



}
