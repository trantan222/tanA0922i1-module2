package File.FileIO.CopyFileText;

import jdk.jfr.events.FileReadEvent;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public List<String> readToFile(String path){
        List<String> list = new ArrayList<>();
        try {
        File f = new File(path);
        if(!f.exists()){
                throw new FileNotFoundException();
        }
        BufferedReader reader = new BufferedReader(new FileReader(f));
        String line = "";
        while((line =reader.readLine()) != null){
            list.add((line));
        }
        reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void WriteToFile(String path, List<String> list){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))){
            for(String s : list){
                bufferedWriter.write(s);
                bufferedWriter.write("\n");
//                bufferedWriter.flush();
            }
//            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
