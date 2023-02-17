package DemoPerson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static final String AN_OBJECT = ",";
    public static final String Blank = " ";

    public void WriteToFile(String path, List<person> personList) {
        FileWriter writer = null ;
        try {
             writer = new FileWriter(path,true);
             for(person person : personList){
                 writer.write(person.ToStringFile());
                 writer.write("\n");
             }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void writeToFile2(String path, List<person> personList) {
        try (FileWriter writer = new FileWriter(path)) {
            for (person person : personList) {
                writer.write(person.ToStringFile());
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public void writeToFile3(String path, List<person> personList) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            for (person person : personList) {
                bufferedWriter.write(person.ToStringFile());
                bufferedWriter.write("\n");
            }
            // writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Reader
    public List<person> ReadFile(String path) {
       List<person> personList1 = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null;
            while((line = reader.readLine()) !=null) {
                if (line.trim().equals(Blank)) {
                    continue;
                }
                String[] result = line.split(AN_OBJECT);
                person person = new person(result);
                personList1.add(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personList1;
    }
    }
