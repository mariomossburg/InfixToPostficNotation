package queueAndStack;
//stack = LIFO
public class StackForArray <T> {
    private int top;
    T[] stack;

    public StackForArray(){
        this(5);
    }

    public StackForArray(int size){
        top=0;
        stack =(T[]) new Object[size];
    }
    //pushes data onto the stack
    public void push(T data){
        if (top>=stack.length) {
            T[] temp = (T[]) new Object[stack.length * 2];
            for (int i = 0; i < stack.length; i++)
                temp[i] = stack[i];
            }
            stack[top] = data;
            top++;
    }
    public T pop(){
        if (top<=0){
            System.out.println("Stack is empty");
            System.exit(0);
        }
        T data = stack[top-1];
        top--;
        return data;
    }

    public T peek(){
        if (top<=0){
            System.out.println("Stack is empty");
            System.exit(0);
        }
        return stack[top-1];
    }
    public boolean isEmpty(){
        return top == 0;
    }
    public void print(){
        for (int i = 0; i<top; i++){
            System.out.print(stack[i] + ", ");
        }

    }
}//end class
