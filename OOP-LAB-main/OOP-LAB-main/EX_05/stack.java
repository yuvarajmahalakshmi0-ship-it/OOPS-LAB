import java.util.Scanner;

class StackImpl {
    int stack[];
    int top;

    StackImpl(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int item) throws Exception {
        if (top == stack.length - 1) {
            throw new Exception("stack overflow!stack is full");
        }

        stack[++top] = item;
        System.out.println(item + "pushed into stack");
    }

    public int pop() throws Exception {
        if (top == -1) {
            throw new Exception("stack underflow!stack is empty");
        }

        return stack[top--];
    }

    public void display() throws Exception {
        if (top == -1) {
            throw new Exception("stack underflow!stack is empty");
        }

        System.out.println("stack elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}

public class stack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StackImpl s = new StackImpl(5);

        try {
            s.push(10);
            s.push(20);
            s.push(30);

            s.display();

            System.out.println("popped element: " + s.pop());
            System.out.println("popped element: " + s.pop());
            System.out.println("popped element: " + s.pop());

            s.display();

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
