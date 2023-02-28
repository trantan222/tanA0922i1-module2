package baimau.chucnang;

import baimau.model.ATm;
import baimau.model.CreditCard;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;

public class ReadFileATMCreditCard {
    public static final String REGEX = ",";
    public ArrayList<ATm> readFIleATm(String path) {
        ArrayList<ATm> aTmArrayList = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line = "";
            while ((line = reader.readLine()) != null) {
                ATm aTm = new ATm(line.split(REGEX));
                aTmArrayList.add(aTm);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return aTmArrayList;
    }
//    public ArrayList<String> readCreditCard(String path) {
//        ArrayList<String> creditCards = new ArrayList<>();
//        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
//            String line = "";
//            while((line = bufferedReader.readLine()) != null){
//              String arr[] = line.split(REGEX);
//              ATm aTm = new ATm(arr);
//              creditCards.
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return creditCards;
//    }


}
