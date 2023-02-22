package File.BinaryFile.QuanLiSanPham;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("A","IP1","VN1",36,"RICE1"));
        productList.add(new Product("B","IP2","VN2",37,"RICE2"));
        productList.add(new Product("C","IP3","VN3",38,"RICE3"));
        productList.add(new Product("D","IP4","VN4",35,"RICE4"));
        productList.add(new Product("E","IP5","VN5",39,"RICE5"));
//        String path1 = "D:\\A0922i1-tan\\module2\\src\\File\\BinaryFile\\QuanLiSanPham\\text.csv";
        String path = "C:\\Users\\PC\\Desktop\\New Text Document.txt";
        FileBinary fileBinary = new FileBinary();
        fileBinary.addFile(path,productList);
        fileBinary.DisplayFile(path).forEach(System.out::println);
        fileBinary.FindProduct(path,"C");

    }
}
