package com.company;

public class QueueImpl<E> implements Queue<E> {

    private  Object array[];
    private int capacity;
    private int size;

    public QueueImpl(int capacity)
    {
        size = 0;
        this.capacity = capacity;
        array = new Object[capacity];
    }
    @Override
    public boolean add(E e) throws QueueIsFullException{
        if(size == capacity){
            throw new QueueIsFullException("Queue is full");
        }
        array[size] = e;
        ++size;
        return true;
    }

    @Override
    public boolean offer(E e) {
        if(size == capacity){
            return false;
        }
        array[size] = e;
        return true;
    }

    @Override
    public E poll() {
        if(size == 0){
            System.out.println("Queue is empty");
            return null;
        }
        E top = (E)array[0];
        for (int i = 0; i < size; ++i) {
            array[i] = array[i + 1];
        }
        --size;
        return top;
    }

    @Override
    public E remove() throws QueueIsEmptyException{
        if(size == 0)
        {
            throw new QueueIsEmptyException("Queue is empty");
        }
        else {
            E top = (E)array[0];
            for (int i = 0; i < size; ++i) {
                array[i] = array[i + 1];
            }
            --size;
            return top;
        }
    }

    @Override
    public E element() throws QueueIsEmptyException{
        if(size == 0){
            throw new QueueIsEmptyException("Queue is empty");
        }
        return (E)array[0];
    }

    @Override
    public E peek(){
        if(size == 0) {
            return null;
        }
        return (E)array[0];
    }
}
