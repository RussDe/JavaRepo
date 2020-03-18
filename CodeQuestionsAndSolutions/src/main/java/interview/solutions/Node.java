package interview.solutions;

//implementing node
public class Node {
    private Node head;
    private Node tail;
    private Node next;
    private int item;
    private int listSize;

    //initial constructor
    Node() {
        this.head = null;
        this.tail = head;
        this.listSize = 0;
    }

    private Node(int item) {
        this.item = item;
        next = null;
    }

    //getters and setters
    private int getListSize() {
        return listSize;
    }

    private void addListSize() {
        this.listSize++;
    }

    private void removeListSize() {
        this.listSize--;
    }

    private int getItem() {
        return this.item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    private Node getNext() {
        return this.next;
    }

    private void setNext(Node next) {
        this.next = next;
    }

    //1. adding before the head
    private void addToHead(int item) {
        Node newNode = new Node(item);
        if (getListSize() == 0) {
            head = newNode;
            tail = head;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        addListSize();
    }

    //2. adding to the tail
    public void addToTail(int item) {
        Node newNode = new Node(item);
        if (getListSize() == 0) {
            head = newNode;
            tail = head;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        addListSize();
    }

    //3. adding to any place
    public void addNode(int position, int item) {

        if (position < 0 || position > getListSize()) {
            System.out.println("Position not within a range");
        } else {
            if (position == 0)
                addToHead(item);
            else if (position == getListSize())
                addToTail(item);
            else {
                Node newNode = new Node(item);
                Node thisNode = head;
                for (int i = 1; i < position; i++) {
                    thisNode = thisNode.getNext();
                }
                newNode.setNext(thisNode.getNext());
                thisNode.setNext(newNode);
                addListSize();
            }
        }
    }

    //4. deleting the head
    public void deleteHead() {
        Node temp = head;
        head = temp.getNext();
        removeListSize();
    }

    //5. deleting the tail
    public void deleteTail() {
        Node current = head;
        for (int i = 1; i < getListSize() - 1; i++) {
            current = current.getNext();
        }
        current.setNext(null);
        tail = current;
        removeListSize();
    }

    //6. deleting a node from position
    public void deleteNode(int position) {
        if (position < 0 || position > getListSize()) {
            System.out.println("Position not within a range");
        } else {
            if (position == 0)
                deleteHead();
            else if (position == getListSize())
                deleteTail();
            else {
                Node thisNode = head;
                for (int i = 1; i < position - 1; i++) {
                    thisNode = thisNode.getNext();
                }
                Node temp = thisNode.getNext();
                thisNode.setNext(temp.getNext());
            }
            removeListSize();
        }
    }


    //*. Print out LinkedList
    @Override
    public String toString() {
        Node thisNode = this.head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (thisNode != null) {
            sb.append(thisNode.getItem());
            sb.append(", ");
            thisNode = thisNode.getNext();
        }
        sb.deleteCharAt(sb.lastIndexOf(",")).deleteCharAt(sb.lastIndexOf(" ")).append("]");
        return sb.toString();
    }

}