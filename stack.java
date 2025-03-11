interface Stack {
    void push(int item);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}

class IntegerStack implements Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

   
    public IntegerStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

   
    public void push(int item) {
        if (!overflow()) {
            stackArray[++top] = item;
            System.out.println("Pushed: " + item);
        } else {
            System.out.println("Stack Overflow!");
        }
    }

   
    public int pop() {
        if (!underflow()) {
            int item = stackArray[top--];
            System.out.println("Popped: " + item);
            return item;
        } else {
            System.out.println("Stack Underflow!");
            return -1;
        }
    }

   
    public void display() {
        if (!underflow()) {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty!");
        }
    }


    public boolean overflow() {
        return (top == maxSize - 1);
    }

   
    public boolean underflow() {
        return (top == -1);
    }
}


public class stack {
    public static void main(String[] args) {
        stack stack = new stack(5); 

       
        stack.push(10);
        stack.push(20);
        stack.push(30);

       
        stack.display();

       
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); 
       
        stack.display();
    }
}