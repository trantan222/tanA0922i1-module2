package File.ThucHanhFile;

import java.util.ArrayList;
import java.util.List;

public class run {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> list = readAndWriteFile.readFile(".\\src\\File\\mark.csv");
        int max = readAndWriteFile.FindMax(list);
        readAndWriteFile.writeToFile(".\\src\\File\\mark.csv",max);
    }
}
