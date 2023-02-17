package javaCollectionFrameWork.LinkedList;

import javaCollectionFrameWork.Arraylist.Product;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner sc = new Scanner(System.in);

        int choose ;
        do {
            System.out.println("1.Thêm sản phẩm\n" +
                    "2.Sửa thông tin sản phẩm theo id\n" +
                    "3.Xoá sản phẩm theo id\n" +
                    "4.Hiển thị danh sách sản phẩm\n" +
                    "5.Tìm kiếm sản phẩm theo tên\n" +
                    "Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("----------");
            System.out.println("Nhập vào sự lựa chọn");
            choose = sc.nextInt();
             sc.nextLine();
            if(choose == 1){
                // add
                System.out.println("Nhập vào tên ");
                String name = sc.nextLine();
                System.out.println("Nhập vào id ");
                String id = sc.nextLine();
                System.out.println("Nhập vào cost ");
                int cost = sc.nextInt();
                javaCollectionFrameWork.Arraylist.Product product = new Product(name,id,cost);
                productManager.addProduct(product);
            }else if(choose == 2){
                // edit
                System.out.println("Nhập id ");
                String id = sc.nextLine();
                System.out.println("Nhập vào tên :");
                String Rename = sc.nextLine();
                System.out.println("Nhập vào cost : ");
                int cost = sc.nextInt();
                productManager.EditProduct(id,Rename,cost);
            }else if(choose == 3){
                // remove
                System.out.println("Nhập vào id ");
                String id = sc.nextLine();
                productManager.removeProduct(id);
            } else if(choose == 4){
                // display
                productManager.display();
            }else if(choose == 5){
                System.out.println("Nhập vào tên sản phẩm");
                String name = sc.nextLine();
                productManager.find(name);
            }else if(choose == 6){
                productManager.Sort();
                productManager.display();
            }
        }while (choose !=0);
    }
}
