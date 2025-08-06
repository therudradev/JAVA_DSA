package queue;
// Circular Queue using Arrays


public class Queue02 {
    static class ArrayQueue {
        int arr[];
        int front, rear;
        int size;

        public ArrayQueue(int n) {
            size = n;
            arr = new int[size];
            front = -1;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == - 1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            // adding first element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            // return arr[front++];
            int result = arr[front];
            // LAST delete
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
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
            int i = front;
            do {
                System.out.print(arr[i] + " ");
                i = (i + 1) % size;
            } while (i != (rear + 1) % size);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(3);
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.enqueue(40);
        q.dequeue();
        q.enqueue(50);

        q.display();

    }

}
