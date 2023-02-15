package StackQueue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        Stack<Integer> arrStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử tại vị trí thứ " + i);
            arrStack.push(sc.nextInt());
        }
        System.out.println("Mảng ban đầu : " + arrStack);
        for (int i = 0; i < n; i++) {
            System.out.println("Mảng đảo ngược : " + arrStack.pop());
        }

//         đảo ngược chuỗi
//        Stack<String> WStack = new Stack<>();
//        Scanner sc2 = new Scanner(System.in);
//        System.out.println("Nhập vào 1 chuỗi");
//        String mWord = sc2.nextLine();
//        for (int i = 0; i <mWord.length() ; i++) {
//            WStack.push(String.valueOf(mWord.charAt(i)));
//        }
//        System.out.println("Chuỗi ban đầu " + WStack);
//        for (int i = 0; i <mWord.length() ; i++) {
//                System.out.println("Chuỗi đảo ngươc");
//               System.out.print(WStack.pop());
//        }
    }
}


