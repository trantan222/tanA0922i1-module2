package StackQueue.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class trienKhaiQueue {
    private class Node{
         public int data;
         public Node link;

        public Node(int data) {
            this.data = data;
        }
    }
    private class queue{
        public Node front = null;
        public Node rear = null;

     public queue() {
            front = rear;
        }
    }
    queue queue = new queue();

    public void enQueue(int data){
        Node node = new Node(data);
        if(queue.rear == null){
            queue.front = queue.rear = node;
            queue.rear.link = queue.front;
        } else {
            queue.rear.link = node;
            queue.rear = node;
            queue.rear.link = queue.front;
        }
    }
    public void deQueue(){
        if(queue.front == null){
            System.out.println("NULL");
        }
        if(queue.front == queue.rear){
            queue.front = queue.rear = null;
        }else {
             queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }

    }
    public void display(){
        Node temp = queue.front;
        while(temp != queue.rear){
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(queue.rear.data);
    }

    public static void main(String[] args) {
        trienKhaiQueue trienKhaiQueue = new trienKhaiQueue();
        trienKhaiQueue.enQueue(1);
        trienKhaiQueue.enQueue(4);
        trienKhaiQueue.enQueue(8);
        trienKhaiQueue.deQueue();
        trienKhaiQueue.display();
    }
}
