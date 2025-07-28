package Collection_class.Queue_and_deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
其实就是队列和双端队列
 */

public class Main {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("AAA");
        q.offer("BBB");
        q.offer("CCC");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

        //dq的addFirst加在队首,addLast就是加在队尾
        Deque<String> dq = new LinkedList<>();
        dq.addFirst("AAA");
        dq.addLast("BBB");
        dq.addFirst("CCC");

        //Java里面都是默认小根堆,可以使用Lambda来定义大根堆
        Queue<Integer> queue = new PriorityQueue<>();
        Queue<Integer> q2 = new PriorityQueue<>((a,b) -> b - a);
        queue.offer(2);
        queue.offer(3);
        queue.offer(1);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
