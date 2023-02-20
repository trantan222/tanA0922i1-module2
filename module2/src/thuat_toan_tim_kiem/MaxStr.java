package thuat_toan_tim_kiem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MaxStr {
    public static void main(String[] args) {
        ArrayList<Character> max = new ArrayList<>();

        System.out.println("Nhập vào 1 chuỗi ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i <str.length() ; i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i+1; j <str.length() ; j++) {
                if(str.charAt(j) > list.getLast()){
                    list.add(str.charAt(j));
                }
            }
            if(max.size() < list.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        max.forEach(System.out::print);
    }

}
