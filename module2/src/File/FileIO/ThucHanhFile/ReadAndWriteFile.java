package File.FileIO.ThucHanhFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String path) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File f = new File(path);
            if (!f.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                numbers.add(Integer.valueOf(line));
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public int FindMax(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }

    public void writeToFile(String path, int max) {
        try {
            File f = new File(path);
            if(!f.exists()){
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f));
            bufferedWriter.write("Max = "+ max);
            bufferedWriter.close();
        } catch(Exception e ){
            e.printStackTrace();
        }
    }
}