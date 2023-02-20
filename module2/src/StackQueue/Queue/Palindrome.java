package StackQueue.Queue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
        public static void main(String[] args) {
            System.out.println("Input String : ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            Queue queue = new LinkedList();

            Stack stack = new Stack();

            for (int i = 0; i <str.length() ; i++) {
                queue.add(str.charAt(i));
            }
            for (int i = 0; i <str.length() ; i++) {
                stack.push(str.charAt(i));
            }
            boolean isPalindrome = true;

            for (int i = 0; i <str.length() ; i++) {
                if(queue.poll().equals(stack.pop())){
                    continue;
                }else{
                    isPalindrome = false;
                    break;
                }
            }
            if(!isPalindrome){
                System.out.println(" đây không phải là chuỗi Palindrome");
            } else {
                System.out.println(" đây  là chuỗi Palindrome");
            }
        }
    }

