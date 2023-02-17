package javaCollectionFrameWork.LinkedList;

import javaCollectionFrameWork.Arraylist.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ProductManager {
    private LinkedList<Product> productArrayList;

    public ProductManager() {
        this.productArrayList = new LinkedList<>();
    }

    public ProductManager(LinkedList<javaCollectionFrameWork.Arraylist.Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    public void addProduct(javaCollectionFrameWork.Arraylist.Product product){
        productArrayList.add(product);
    }
    public void EditProduct(String id,String editName,int editCost ) {
        for (javaCollectionFrameWork.Arraylist.Product product : productArrayList) {
            if (product.getId().indexOf(id) >= 0) {
                product.setName(editName);
                product.setCost(editCost);
            }
        }
    }
    public void removeProduct(String id){
        for (javaCollectionFrameWork.Arraylist.Product product : productArrayList) {
            if (id.equalsIgnoreCase(product.getId())) {
                productArrayList.remove(product);
            }
            }
    }
    public void display(){
        for(javaCollectionFrameWork.Arraylist.Product product : productArrayList){
            System.out.println(product.toString());
        }
    }
    public void find(String name ){
        for(javaCollectionFrameWork.Arraylist.Product product : productArrayList){
            if(name.equalsIgnoreCase(product.getName())){
                System.out.println(product);
            }
        }
    }
    // sắp xếp tu cao đến thấp
    public void Sort(){
        Collections.sort(productArrayList, new Comparator<javaCollectionFrameWork.Arraylist.Product>() {
            @Override
            public int compare(javaCollectionFrameWork.Arraylist.Product o1, Product o2) {
                if(o1.getCost() > o2.getCost()){
                    return 1;
                }else if(o2.getCost() < o1.getCost()){
                    return -1;
                }
                return 0;
            }
        });

    }

    }
