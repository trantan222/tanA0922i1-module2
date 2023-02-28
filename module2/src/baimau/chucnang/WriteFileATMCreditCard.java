package baimau.chucnang;

import baimau.model.ATm;
import baimau.model.CreditCard;

import java.io.*;
import java.util.ArrayList;

public class WriteFileATMCreditCard {
    public static void WriteFileATM(String path, ArrayList<ATm> aTmArrayList) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            for (ATm aTm : aTmArrayList) {
                bufferedWriter.write(String.valueOf(aTm));
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void WriteFileCreditCard(String path, ArrayList<CreditCard> creditCards) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            for (CreditCard creditCard : creditCards) {
                bufferedWriter.write(String.valueOf(creditCard));
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}