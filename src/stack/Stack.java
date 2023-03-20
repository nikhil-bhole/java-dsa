package stack;
public class Stack {
    static final int MAX_SIZE = 1000; //Max stack size.
    int top;
    int[] a = new int[MAX_SIZE];

    public Stack() {
        top = -1;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public void push(int x) {
        if(top >= (MAX_SIZE-1)) {
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
        }
        else {
            int x = a[top--];
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            return a[top];
        }
    }

    public void print() {
        for(int i = top; i > -1; i--) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.print();
        stack.pop();
        stack.print();
    }
}
