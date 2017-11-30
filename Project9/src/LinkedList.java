class LinkedList {
    private class Node {
        int item;
        Node link;

        Node(int item, Node link) {
            this.item = item;
            this.link = link;
        }
    }

    private Node head;
    private Node tail;

    LinkedList() {
        head = null;
        tail = null;
    }

    void addToStart(int item) {
        if (head == null) {
            head = new Node(item, null);
            tail = head;
        } else {
            head = new Node(item, head);
        }
    }

    void addToEnd(int item) {
        Node tmp = new Node(item, null);
        if (tail == null) {
            tail = tmp;
            head = tail;
        } else {
            tail.link = tmp;
            tail = tail.link;
        }
    }

    void printLength() {
        int cnt = 0;
        Node pos = head;

        while (pos != null) {
            cnt++;
            pos = pos.link;
        }

        System.out.println("The length of the linked list is " + cnt);
    }

    boolean contains(int n) {
        Node pos = head;
        while (pos != null) {
            if (pos.item == n)
                return true;
            pos = pos.link;
        }
        return false;
    }

    void delete(int n) {
        Node pos = head;
        while (this.contains(n) && pos != null) {
            if (pos.link == null)
                pos = null;
            else if (pos.link.item == n)
                pos.link = pos.link.link;
            else
                pos = pos.link;
        }
    }

    void printList() {
        Node pos = head;
        if (pos == null) System.out.println("This is an empty list.");
        while (pos != null) {
            System.out.print(pos.item + " ");
            pos = pos.link;
        }
        System.out.println();
    }
}
