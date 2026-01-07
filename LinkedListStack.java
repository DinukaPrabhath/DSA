class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedListStack {
    StackNode top = null;

    void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        top = top.next;
    }

    void display() {
        StackNode temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListStack s = new LinkedListStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.display();
    }
}
