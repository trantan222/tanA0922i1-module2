package javaCollectionFrameWork.Arraylist;

import java.util.*;

public class ProductManager {
    private Product product;
    private ArrayList<Product> productArrayList;

    public ProductManager() {
        this.productArrayList = new ArrayList<>();
    }

    public ProductManager(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    public void addProduct(Product product){
        productArrayList.add(product);
    }
    public void EditProduct(String id,String editName,int editCost ) {
        for (Product product : productArrayList) {
            if (product.getId().indexOf(id) >= 0) {
                product.setName(editName);
                product.setCost(editCost);
            }
        }
    }
    public void removeProduct(String id){
        int temp = 0;
        for (int i = 0; i < productArrayList.size(); i++) {
            if(productArrayList.get(i).equals(id)){
                temp = i;
            }
        }
        productArrayList.remove(temp);
    }
    public void display(){
        for(Product product : productArrayList){
            System.out.println(product.toString());
        }
    }
    public void find(String name ){
        for(Product product : productArrayList){
            if(name.equalsIgnoreCase(product.getName())){
                System.out.println(product);
            }
        }
    }
    // sắp xếp tu cao đến thấp
    public void Sort(){
       Collections.sort(productArrayList, new Comparator<Product>() {
           @Override
           public int compare(Product o1, Product o2) {
               if(o1.getCost() > o2.getCost()){
                   return 1;
               }else if(o1.getCost() <  o2.getCost()){
                   return -1;
               }else {
                   return 0;
               }
           }
       });

    }

    }
