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

    LinkedList() {
        head = null;
    }

    void addToStart(int item) {
        if (head == null) {
            head = new Node(item, null);
        } else {
            head = new Node(item, head);
        }
        System.out.println(item + " is added successfully");
    }

    void addToEnd(int item) {
        if (head == null) {
            head = new Node(item, null);
        } else {
            Node pos = head;
            while (pos.link != null) {
                pos = pos.link;
            }
            pos.link = new Node(item, null);
        }
        System.out.println(item + " is added successfully");
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
        if (head.item == n) {
            head = head.link;
        }
        Node pos = head;
        while (this.contains(n) && pos != null) {
            if (pos.link == null)
                pos = null;
            else if (pos.link.item == n) {
                pos.link = pos.link.link;
                break;
            }
            else
                pos = pos.link;
        }
        System.out.println(n + " is deleted successfully");
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
