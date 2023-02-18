package File.CopyFileText;

import java.util.ArrayList;
import java.util.List;

public class run {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        List<String> list = readFile.readToFile(".\\src\\File\\list.csv");
        readFile.WriteToFile(".\\src\\File\\CopyFileText\\text.csv",list);
    }



}
