package org.data_structure.linear.linkedlist;

public class MainApp {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.remove();
        list.remove();
        System.out.println(list);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println(list);
        list.reverse();
        System.out.println(list);
    }
}
