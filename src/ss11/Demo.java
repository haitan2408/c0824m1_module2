package ss11;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        System.out.println(stack.pop());

        Queue<String> queue = new PriorityQueue<>();
        queue.offer("HaiTT");
        queue.offer("ABC");
        queue.offer("Hoa");
        queue.offer("Da Nang");
        for (String i: queue) {
            System.out.println(i);
        }

    }
}
