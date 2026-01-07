class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedListFIFOQueue {
    QueueNode front = null, rear = null;

    void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        front = front.next;
        if (front == null) rear = null;
    }

    void display() {
        QueueNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListFIFOQueue q = new LinkedListFIFOQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.display();
    }
}
