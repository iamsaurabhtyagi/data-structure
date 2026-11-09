package org.data_structure.linear.linkedlist;

public class MainApp {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println(list.isEmpty());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println("Size: " + list.size());
        list.remove();
        list.remove();
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println("Size: " + list.size());
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println(list);
        list.reverse();
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println("Size: " + list.size());
        list.add(null);
        list.add(null);
        list.add(80);
        System.out.println(list);
        System.out.println("Contains: " + list.contains(null));

        var index = list.indexOf(80);
        System.out.println("Index: " + index);
    }
}
