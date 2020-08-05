package com.company;

public class QueueImpl implements Queue {

    private  int array[];
    private int capacity;
    private int size;

    public QueueImpl(int capacity)
    {
        size = 0;
        this.capacity = capacity;
        array = new int[capacity];
    }
    @Override
    public boolean add(int e) throws QueueIsFullException{
        if(size == capacity){
            throw new QueueIsFullException("Queue is full");
        }
        array[size] = e;
        ++size;
        return true;
    }

    @Override
    public int poll() {
        if(size == 0){
            System.out.println("Queue is empty");
            return 0;
        }
        int top = array[0];
        for (int i = 0; i < size; ++i) {
            array[i] = array[i + 1];
        }
        --size;
        return top;
    }

    @Override
    public int remove() throws QueueIsEmptyException{
        if(size == 0)
        {
            throw new QueueIsEmptyException("Queue is empty");
        }
        else {
            int top = array[0];
            for (int i = 0; i < size; ++i) {
                array[i] = array[i + 1];
            }
            --size;
            return top;
        }
    }

    @Override
    public int element() throws QueueIsEmptyException{
        if(size == 0){
            throw new QueueIsEmptyException("Queue is empty");
        }
        return array[0];
    }

    @Override
    public boolean offer(int e) {
        if(size == capacity){
            return false;
        }
        array[size] = e;
        return true;
    }
}
