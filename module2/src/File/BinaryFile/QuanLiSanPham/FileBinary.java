package File.BinaryFile.QuanLiSanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileBinary {
    public void addFile(String path, List<Product> list){
        try(ObjectOutputStream outputStream = new ObjectOutputStream( new FileOutputStream(path))){
            outputStream.writeObject(list);
            outputStream.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public  List<Product> DisplayFile(String path){
        try(ObjectInputStream stream = new ObjectInputStream(new FileInputStream(path))){
            return (List<Product>) stream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void FindProduct(String path,String ma){
         List<Product> products = DisplayFile(path);
         for (Product product : products){
             if(product.getMaSP().equals(ma)){
                 System.out.println(product.toString());
             }
         }
    }

}
