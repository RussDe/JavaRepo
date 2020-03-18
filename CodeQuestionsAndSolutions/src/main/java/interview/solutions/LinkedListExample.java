package interview.solutions;

public class LinkedListExample {
    MyNode head;
    MyNode tail;

    public static class MyNode {
        int data;
        MyNode next;

//        public MyNode(int data, MyNode next) {
//            this.data = data;
//            this.next = next;
//        }

        public MyNode(int data) {
            this.data = data;
        }


        public String toString() {
            return String.valueOf(data);
        }
    }

    public void addNextNode(int data) {
        MyNode temp = new MyNode(data);
        if (tail != null) {
            tail.next = temp;
            tail = temp;
        } else {
            head = temp;
            tail = temp;
        }
    }

    public MyNode deleteNode(int data) {
        return null;
}

    public MyNode findNode(int data) {
        if (head == null)
            return null;
        if (head.data == data)
            return head;
        MyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            if (temp.data == data)
                return temp;
        }
        return null;
    }
}
