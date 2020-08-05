package com.company;

public interface Queue {
    boolean add(int e) throws QueueIsFullException;
    int poll();
    int remove() throws QueueIsEmptyException;
    int element() throws QueueIsEmptyException;
    boolean offer(int e);
}

