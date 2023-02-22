package File.FileIO.ReadFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadFilee {
    public static final String AN_OBJECT = ",";
    public static final String blank = "";

    public List<country> Read(String path) {
        List<country> list = new ArrayList<>();
        try ( BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = "";
            while((line = bufferedReader.readLine()) != null){
                if(line.trim().equals(blank)){
                    continue;
                }
                String [] temp = line.split(AN_OBJECT);
                country country = new country(temp);
                list.add(country);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }



}