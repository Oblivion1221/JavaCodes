```java
if (head == null)
    return new String(m + " not found");
else {
    Node pos = head;
    if (head.getData() == m) {
        head = new Node(n, head);
        return new String("insert before " + m + " " + n + " done");
    }
    while (pos.getNext() != null) {
        if (pos.getNext().getData() == m) {
            pos.putNext(new Node(n, pos.getNext()));
            return new String("insert before " + m + " " + n + " done");
        }
        pos = pos.getNext();
    }
    return new String(m + " not found");
}
```