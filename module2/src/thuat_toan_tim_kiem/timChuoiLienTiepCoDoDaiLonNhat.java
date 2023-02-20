package thuat_toan_tim_kiem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class timChuoiLienTiepCoDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        String str = sc.nextLine();
        List<Character> listMax = new ArrayList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i <str.length() ; i++) {
            if(list.size() > 1 && str.charAt(i) <= list.getLast() && list.contains(str.charAt(i))){
                list.clear();
            }
            list.add((str.charAt(i)));
            if(list.size() > listMax.size()){
                listMax.clear();
                listMax.addAll(list);
            }
        }
        System.out.println("Chuỗi con đã sắp xêp =");
        listMax.forEach(System.out::print);

    }
    // độ phức tạp o(n)
}
