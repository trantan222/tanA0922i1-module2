package File.ThucHanhFile;

import java.util.ArrayList;
import java.util.List;

public class run {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> list = readAndWriteFile.readFile(".\\src\\File\\list.csv");
        int max = readAndWriteFile.FindMax(list);
        readAndWriteFile.writeToFile(".\\src\\File\\list.csv",max);
    }
}
