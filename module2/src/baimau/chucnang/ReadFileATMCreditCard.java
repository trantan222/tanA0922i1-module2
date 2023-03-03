package baimau.chucnang;

import baimau.model.ATm;
import baimau.model.CreditCard;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class ReadFileATMCreditCard {
    public static final String REGEX = ",";

    public static void readFile(String path) {
        ArrayList<ATm> tmp1 = new ArrayList<>();
        ArrayList<CreditCard> tmp2 = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String arr[] = line.split(",");
                if (arr.length == 6) {
                    ATm aTm = new ATm(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), (arr[2]), Integer.parseInt(arr[3]), arr[4],Integer.parseInt(arr[5]));
                    tmp1.add(aTm);
                }
                if (arr.length == 7) {
                    CreditCard creditCard = new CreditCard(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), arr[2], Integer.parseInt(arr[3]), arr[4], Integer.parseInt(arr[5]),Integer.parseInt(arr[6]));
                    tmp2.add(creditCard);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        tmp1.forEach(System.out::println);
        tmp2.forEach(System.out::println);
    }
}
