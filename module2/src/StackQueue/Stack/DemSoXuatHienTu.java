package StackQueue.Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class DemSoXuatHienTu {
    public static void main(String[] args) {
        System.out.println("Nhập vào 1 chuỗi ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr [] = str.split("");
        System.out.println("Chuỗi mới "+Arrays.toString(newStr));
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < newStr.length ; i++) {
            if(treeMap.containsKey(newStr[i])){
                treeMap.put(newStr[i],treeMap.get(newStr[i] +1 ));
            } else {
                treeMap.put(newStr[i],1 );
            }
        }
    }

}
