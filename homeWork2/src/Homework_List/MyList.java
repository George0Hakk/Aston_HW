package Homework_List;

import java.util.*;
import java.util.function.Consumer;

public class MyList<T> implements Iterable<T>{
    private Object[] array;
    private static final Object[] emptyList = {};
    private static int size = 0;
    private static final int BASE_CAPACITY = 10;

    public MyList(){
        this.array= new Object[BASE_CAPACITY];

    }

    public MyList(int capacity){
        if (capacity>0){
            this.array=new Object[capacity];
        } else {
            if (capacity == 0){
                this.array = new Object[BASE_CAPACITY];

            }
        }
    }

    public boolean add(T element) {
        int oldCapacity = array.length;
        this.size++;
        if (this.size>oldCapacity){
            int newCapacity = oldCapacity >> 1;
            this.array =Arrays.copyOf(array,newCapacity);
            this.array[size-1]=element;
        } else {
            this.array[size-1]=element;
        }
        return true;


    }

    public void get(int index){


    }


    public boolean remove(int index){
        this.size-=1;
        if(size>index){
            System.arraycopy(this.array,index+1,this.array,index,size-index);
            this.array[size]=null;

        }
        return true;
    }

    public void addAll(){

    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }
}