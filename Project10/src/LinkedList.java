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

    void insert(int n) {
        Node newNode = new Node(n, null);
        if (head == null)
            head = newNode;
        else if (n <= head.item) {
            newNode.link = head;
            head = newNode;
        } else {
            Node pos = head;
            boolean b = false;
            while (pos.link != null) {
                if (newNode.item >= pos.item && pos.link.item >= newNode.item) {
                    newNode.link = pos.link;
                    pos.link = newNode;
                    b = true;
                    break;
                } else {
                    pos = pos.link;
                }
            }
            if (!b) {
                pos.link = newNode;
            }
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
