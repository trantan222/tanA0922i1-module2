package ExceptionAndDebug;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        IllegalTriangleException illegalTriangleException = new IllegalTriangleException();
        try {
            System.out.println("Nhập canh a ");
             a = sc.nextInt();
            System.out.println("Nhập canh b ");
             b = sc.nextInt();
            System.out.println("Nhập canh c ");
             c = sc.nextInt();
             try {
                 illegalTriangleException.checkTriangle(a, b, c);
             }catch (IllegalTriangleMessage illegalTriangleMessage) {
                 System.out.println(illegalTriangleMessage.getMessage());
             }
        }catch (Exception e ){
            System.err.println(" Nhập dữ liệu sai!!!!");
        }

    }
}
