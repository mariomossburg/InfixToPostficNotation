package queueAndStack;
import java.util.NoSuchElementException;

public class QueueForLinkedList <T>{
    Node<T>front, rear;
    int size;
    private class Node<T>{
        T data;
        Node<T> next;
    }
    public void Queue(){
        size=0;
        front=rear=null;

    }
    public void enQueue(T data){
        Node<T> node = new Node<>();
        node.data=data;
        node.next=null;
        if (front==null && rear==null){
            rear=front=node;
            size++;
            return;
        }
        rear.next=node;
        rear=node;
        size++;
    }

    public T deQueue(){
        Node<T> temp = front;
        if (front==null)
            throw new NoSuchElementException("Queue is empty");
        if (front==rear){
            front=rear=null;
            size--;
            return temp.data;
        }else {
            front=front.next;
            size--;
            return temp.data;
        }
    }
    public T peek(){
        if (front==null)
            throw new NoSuchElementException("Queue is empty");
        return front.data;
    }
    public int getSize(){
        return getSize();
    }
    public String toString(){
        Node<T> temp = front;
        String s = "[ ";
        for (int i = 0;i<size;i++){
            s = s + temp.data + ", ";
            temp=temp.next;
        }
        s = s + "]";
        return s;
    }
}//end class
