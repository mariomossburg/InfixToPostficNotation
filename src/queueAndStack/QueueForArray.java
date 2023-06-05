package queueAndStack;
import java.util.NoSuchElementException;

public class QueueForArray<T>{
    private int front,rear,size,capacity;
    private T[] queue;

    public QueueForArray(){
        this(5);
    }

    public QueueForArray(int capacity){
        this.capacity=capacity;
        front=rear-0;
        size=0;
        queue = (T[]) new Object[capacity];
    }
    public void enQueue(T data){
        if (!isFull()) {
            queue[(rear+1)%capacity] = data;
            rear = rear + 1;
            size++;
            return;
        }
        throw new IndexOutOfBoundsException("queue is full");
    }
    public T deQueue(){
        if (!isEmpty()) {
            T data = queue[front];
            front = (front+1)%capacity;
            size--;
            return data;
        }
        throw new NoSuchElementException("queue is empty");
    }
    public T peek(){
        if (!isEmpty()) {
            T data = queue[front];
            return data;
        }
        throw new NoSuchElementException("queue is empty");
    }
    public boolean isEmpty(){
        return getSize()==0;
    }
    public boolean isFull(){
        return size==capacity;
    }
    public int getSize(){
        return size;
    }

    public void print(){
        for (int i = 0; i <size; i++){
            System.out.print(queue[(front+i)%capacity] + ", ");
        }
        System.out.println();
    }


}//end class
