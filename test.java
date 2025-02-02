
/*
 author by w3cschool.cc
 Main.java
 */

import java.util.LinkedList;
import java.util.Queue;

public class test {
    public static void main(String[] args) {
        //add()和remove()方法在失败的时候会抛出异常(不推荐)
        Queue<String> queue = new LinkedList<String>();
        //添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        
        Queue<String> copy = queue;
        
        copy.offer("from copy");
        
        for(String q : copy){
            System.out.println(q);
        }
        System.out.println("===");
        
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        
        
        System.out.println("poll="+queue.poll()); //返回第一个元素，并在队列中删除
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("element="+queue.element()); //返回第一个元素 
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek="+queue.peek()); //返回第一个元素 
        for(String q : queue){
            System.out.println(q);
        }
    }
}