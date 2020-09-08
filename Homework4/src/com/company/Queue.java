package com.company;

public interface Queue<E> {
    boolean add(E e) throws QueueIsFullException;
    boolean offer(E e);
    E poll();
    E remove() throws QueueIsEmptyException;
    E element() throws QueueIsEmptyException;
    E peek();
}

