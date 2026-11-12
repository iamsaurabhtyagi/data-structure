package org.data_structure.linear.queue;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Queue<E> {

    private final E[] items;
    private int end;
    private int front;
    private int size;

    Queue() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    Queue(int initialCapacity) {
        if(initialCapacity <= 0)
            throw new IllegalArgumentException("Capacity must be greater then zero");

        this.items = (E[]) new Object[initialCapacity];
    }

    public void insert(E item) {
        Objects.requireNonNull(item, "Queue does not allow null item");

        if(size() == items.length)
            throw new IllegalStateException("Queue is FULL");

        end = end % items.length;

        items[end++] = item;
        size++;
    }

    public E delete() {
        if(isEmpty())
            throw new IllegalStateException("No item to delete");

        var item = items[front];
        items[front++] = null;

        front = front % items.length;
        size--;

        return item;
    }

    public E get(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Invalid index: " + index);

        return items[(front + index) % items.length];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public long size() {
        //return Arrays.stream(items).filter(Objects::nonNull).count();
        return size;
    }

    public void clear() {
        var index = 0;
        while (index != items.length) {
            items[index++] = null;
            size = 0;
            front = 0;
            end = 0;
        }
    }

    @Override
    public String toString() {
        return IntStream.range(0, size)
                .mapToObj(i -> items[(front + i) % items.length])
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "[", "]"));
    }
}
