package thuat_toan_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class CaiDatThuatToanNhiPhan {
    public static final int INT = -1;

    // tạo hàm binarrySearch
    public static int binarySearch(int[] array, int left, int right , int value) {
        if(left> right) return INT;
        int mid = (left + right) / 2;
         if(array[mid] == value) return mid;
         if(value > array[mid]) return binarySearch(array,mid+1,right,value);
         return binarySearch(array,left,mid -1 ,value);
    }
    public static void main(String[] args) {
        // khởi tạo mảng
        System.out.println("Nhập vào số lượng phần tử : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for (int i = 0; i <n ; i++) {
            System.out.println("Nhập vào phần tử tại "+i);
            arr[i] = sc.nextInt();
        }
//        int t [] = {1,2,3,5,6,7};
        // sắp xếp mảng
         Arrays.sort(arr);
        int newArr[] = arr;
        System.out.println(Arrays.toString(newArr));
        System.out.println("Nhập phần tử cần tìm");
        int x = sc.nextInt();
//        int index = binarySearch(newArr,0,newArr.length-1,x);
//        System.out.println("index: "+ index +" Số cần tìm là: "+ x);
        System.out.println(binarySearch(newArr,0,newArr.length-1,x));
//
//
//
//
    }
//

//
}
