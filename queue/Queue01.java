package queue;

// Queues Using Arrays

public class Queue01 {
    static class ArrayQueue {
        int arr[];
        int front, rear;
        int n;

        public ArrayQueue(int size) {
            n = size;
            arr = new int[n];
            front = 0;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        // add
        public void enqueue(int data) {
            if (rear == n - 1) {
                System.out.println("Queue is Full");
                return;
            }
            arr[++rear] = data;
            // rear = rear + 1;
            // arr[rear] = data;
        }

        // remove
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            // return arr[front++]; //this can be done in circular queue
            // or

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        q.dequeue();
        q.dequeue();
        q.display();
    }

}
