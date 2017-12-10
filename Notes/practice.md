```java
// insertBefore()
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

```java
// delete()
if (head != null && head.getData() == x) {
    head = head.getNext();
    return new String("deleted " + x);
}
Node pos = head;
while (pos != null) {
    if (pos.getNext() == null) 
        pos = null;
    else if (pos.getNext().getData() == x) {
        pos.putNext(pos.getNext().getNext()); 
        return new String("deleted " + x);
    }
    else 
        pos = pos.getNext();
}
return new String("Not found");
```
