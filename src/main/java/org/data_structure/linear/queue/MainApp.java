package org.data_structure.linear.queue;

public class MainApp {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);
        queue.insert(90);
        queue.insert(100);

        System.out.println(queue);

        queue.delete();
        queue.delete();
        System.out.println(queue);
        System.out.println(queue.get(3));

        queue.delete();
        queue.delete();
        queue.delete();
        queue.delete();
        System.out.println(queue.size());

        queue.insert(300);
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.get(4));

        queue.clear();
        System.out.println(queue);
        //queue.delete();  // will get IllegalStateException with "No item to delete"

        queue.insert(1000);

    }
}
