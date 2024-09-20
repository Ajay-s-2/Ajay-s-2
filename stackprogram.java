import java.util.Scanner;

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full, cannot push value");
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop value");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, nothing to peek");
            return -1;
        } else {
            return stackArray[top];
        }
    }
    // display the stack
    public void display(){
        for (int i : stackArray) {
            System.out.println("The stackarray : "+ i);
        }
    }

}


public class stackprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = scanner.nextInt();
        Stack stack = new Stack(size);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Exit\n5. Display");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    System.out.println("Popped: " + stack.pop());
                    break;
                case 3:
                    System.out.println("Top element is: " + stack.peek());
                    break;
                case 4:
                    exit = true;
                    break;
                case 5:
                    stack.display();
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
        scanner.close();
        
    }
    
    
}
