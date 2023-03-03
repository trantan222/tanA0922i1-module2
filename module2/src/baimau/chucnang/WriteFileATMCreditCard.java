package baimau.chucnang;

import baimau.model.ATm;
import baimau.model.CreditCard;

import java.io.*;
import java.util.ArrayList;

import static baimau.chucnang.chucNangCreditCard.creditCards;
import static baimau.chucnang.chucnangATM.aTmArrayList;

public class WriteFileATMCreditCard {
    public static void WriteFile(String path) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            for (ATm aTm : aTmArrayList) {
                bufferedWriter.write(String.valueOf(aTm.toStringFile()));
                bufferedWriter.write("\n");
            }
            for (CreditCard creditCard : creditCards) {
                bufferedWriter.write(String.valueOf(creditCard.toStringFile()));
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void WriteFileCreditCard(String path, ArrayList<CreditCard> creditCards) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}