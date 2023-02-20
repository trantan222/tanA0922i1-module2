package StackQueue.Stack;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiNhiPhan {
    public static void main(String[] args) {
        // thập phân sang nhị phân
      Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thập phân");
        int n = sc.nextInt();
        Stack<Integer> BinaryStack = new Stack<>();
        int soDu;
        while(n > 0){
            System.out.println(soDu = n % 2);
            BinaryStack.push(soDu);
            n = n /2;
        }
        int size = BinaryStack.size();
        System.out.println("Hệ nhị phân là ");
        for (int i = 0; i <size ; i++) {
            System.out.print( BinaryStack.pop());
        }



        // chuyển nhị phân sang thập phân
        System.out.println("Nhập số lương ");
        int num = sc.nextInt();
        System.out.println("Nhập vào số nhị phân ");
        int binary [] = new int[num];
        Stack<Integer> Decimal = new Stack<>();
        for (int i = 0; i <num ; i++) {
            System.out.println("Phần tử tại vị trí thứ "+i);
            binary[i] = sc.nextInt();
            while (binary[i] != 1 && binary[i] != 0){
                binary[i] = sc.nextInt();
            }
        }
        System.out.println("Mảng nhị phân ban đầu : "+ Arrays.toString(binary));
        int decimals ;
        int de = num;
        for (int i = 0; i < num ; i++) {
            de = de -1 ;
            decimals = (int) (binary[i]*(Math.pow(2,de)));
            Decimal.push (decimals);
        }
        System.out.println("Số thập phân là : ");
        int sizee = Decimal.size();
        int a = 0;
        for (int i = 0; i <sizee ; i++) {
           a+= Decimal.pop();
        }
        System.out.println(a);
    }
}
