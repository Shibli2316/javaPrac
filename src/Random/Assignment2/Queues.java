package Random.Assignment2;

public class Queues {

    public static class Queue{
        int queue[] = new int[5];
        int size;
        int front;
        int rear;

        public void enQueue(int data){
            if (!isFull()){
                queue[rear] = data;
                rear = (rear + 1)%5;
                size = size + 1;
            }
            else{
                System.out.println("Queue is full");
            }
        }

        public int deQueue(){
            int data = queue[front];
            if (!isEmpty()){
                front = (front + 1)%5;
                size = size - 1;
            }
            else{
                System.out.println("Queue is empty");
            }
            return data;
        }

        public void show(){
            System.out.print("Elements: ");
            for (int i = 0; i < size; i++){
                System.out.print(queue[(front + i)%5] + " ");
            }
        }

        public int getSize(){
            return size;
        }

        public boolean isEmpty(){
            return getSize() == 0;
        }

        public boolean isFull(){
            return getSize() == 5;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        System.out.println("Is the queue full: " + q.isFull());
        System.out.println("Is the queue empty: " + q.isEmpty());
        System.out.println("Size of the queue is: " + q.getSize());
        q.show();
        System.out.println();
        q.enQueue(6);
    }
}
