package lesson3.homework;

import java.util.EmptyStackException;

public class MyDeque<T> {
    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int begin = 0;
    private int end = 0;
    private int capacity;
    //0 1 2 3 4
    //    b
    //e
    //    8 4 6


    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        this.capacity = capacity;
        list = (T[]) new Object[capacity];
        begin = this.capacity/2;
        end = capacity/2;
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
        begin = capacity /2;
        end = capacity/2;
    }

    public void insertRight(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        if(end==capacity){
            reCapacityRight();
        }
        if(list[end+1]!=null){
            end = nextIndex(end);
        }
        list[end+1] = value;
        size++;
        end = nextIndex(end);
    }

    public void insertLeft(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        if(begin==0){
            reCapacityLeft();
        }

        list[begin-1] = value;
        size++;
        begin = beforeIndex(begin);
    }

    public T removeLeft() {
        T temp = peekLeft();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[begin];
    }

    public T removeRight() {
        T temp = peekRight();
        size--;
        list[end] = null;
        end = beforeIndex(end);
        return temp;
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[end];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int beforeIndex(int index) {
        return (index - 1)% list.length;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void reCapacityLeft(){
        T[] tempArr = (T[]) new Object[capacity +6];
        capacity+=6;
        System.arraycopy(list,0,tempArr,begin+6,size);
        list = tempArr;
        begin = begin+6;
        end = end+5;
    }
    private void reCapacityRight(){
        T[] tempArr = (T[]) new Object[capacity +6];
        capacity+=6;
        System.arraycopy(list,0,tempArr,begin,size);
        list = tempArr;
        end = end+6;
    }

    public String toString(){
        String string = "";
        for (int i = 0; i < list.length; i++) {
            string = string + " " + list[i];
        }
        return string;
    }

}
