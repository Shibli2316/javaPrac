package Random.Assignment2;

public class Stacks {

    public static class Stack {
        int capacity = 2;
        int[] stack = new int[capacity];
        int top = 0;

        public void push(int data){
            if (size() == capacity)
                expand();
            stack[top] = data;
            top++;
        }

        private void expand(){
            int length = size();
            int[] newstack = new int[capacity*2];
            System.arraycopy(stack, 0, newstack, 0, length);
            stack = newstack;
            capacity *= 2;
        }

        public int pop(){
            int data = 0;
            if (isEmpty()){
                System.out.println("\nStack is empty. Popping not possible.");
            }
            else{
                top--;
                data = stack[top];
                stack[top] = 0;
                shrink();
            }
            return data;
        }

        private void shrink(){
            int length = size();
            if (length <= (capacity/2)/2)
                capacity = capacity/2;
            int[] newstack = new int[capacity];
            System.arraycopy(stack, 0, newstack, 0, length);
            stack = newstack;
        }

        public int peak(){
            int data;
            data = stack[top - 1];
            stack[top] = 0;
            return data;
        }

        public int size(){
            return top;
        }

        public boolean isEmpty(){
            return top <= 0;
        }

        public void show(){
            for (int n : stack){
                System.out.print(n + " ");
            }
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("Size of the stack is: " + stack.size());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.print("Stack: ");
        stack.show();

        System.out.println("\nPopping: " + stack.pop());
        System.out.println("Popping: " + stack.pop());
        System.out.println("Popping: " + stack.pop());

        System.out.print("New stack is: ");
        stack.show();

        System.out.println("\nSize of stack is: " + stack.size());
        System.out.print("Peaking the stack is: " + stack.peak());

        System.out.println("\nIs stack empty: " + stack.isEmpty());
    }
}