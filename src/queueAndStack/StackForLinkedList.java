package queueAndStack;

public class StackForLinkedList <T> {

    private class Node<T> {
        private T data;
        private Node<T> next;

    }
    private Node<T> top;
    private int size;
    //default constructor for stack
    public StackForLinkedList(){
        top = null;
        size = 0;
    }
    public void push(T data){
        Node<T> node = new Node<>();
        node.data=data;
        node.next = top;
        top = node;
        size++;
    }
    //removes the top element of stack
    public T pop(){
        if (top == null)
            throw new IndexOutOfBoundsException();
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }
    //peek only views top element
    public T peek(){
        if (pop()==null){
            throw new IndexOutOfBoundsException();
        }
        return top.data;
    }

    public String toString(){
        String str = "[";
        Node<T> temp = top;
        while (temp.next != null){
            str = str + temp.data + ", ";
            temp = temp.next;
        }
        str=str + temp.data + "]";
        return str;
    }
}//end class
