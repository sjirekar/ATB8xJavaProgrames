package nov.ex_04112024_Collection_Framework_Set_PQ_MAP;

import java.util.PriorityQueue;

public class Lab211_Queue {
    public static void main(String[] args) {
        //Queue -> 0.01 % used in Automation
        PriorityQueue pq = new PriorityQueue();
        pq.offer("1"); //instead of add we have offer function here
        pq.offer("2"); //Works on FIFO> First in first out
        pq.offer("3");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll()); //Works as FIFO
        System.out.println(pq);
    }
}
