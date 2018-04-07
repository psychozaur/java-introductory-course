package pl.com.empas.java_introductory_course.generics.collections;

public class SimpleLinkedList<V> {

    class Item {
        V value;
        Item next;
        Item previous;

        Item(V val, Item next, Item prev) {
            this.value = val;
            this.next = next;
            this.previous = prev;
        }
    }

    private Item root;

    public SimpleLinkedList() {

    }

    public SimpleLinkedList(V ... vals) {
        root = new Item(vals[0], null, null);
        Item tmp = root;
        for(int i = 1; i < vals.length; i++) {
            Item newItem = new Item(vals[i], null, tmp);
            tmp.next = newItem;
            tmp = newItem;
        }
    }

    public void addLast(V value) {
        if(root == null) {
            root = new Item(value, null, null);
        } else {
            Item tmp = root;
            while(tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Item(value, null, tmp);
        }
    }

    public void addFirst(V value) {
        if(root == null) {
            root = new Item(value, null, null);
        } else {
            Item tmp = root;
            root = new Item(value, tmp, null);
            tmp.previous = root;
        }

    }

    public void removeLast() {
        if(root != null) {
            Item tmp = root;
            while(tmp.next != null) {
                tmp = tmp.next;
            }
            Item newLast = tmp.previous;
            newLast.next = null;
        }
    }

    public void removeFirst() {
        if(root != null) {
            Item newFirst = root.next;
            newFirst.previous = null;
            root = newFirst;
        }
    }

    @Override
    public String toString() {
        Item tmp = root;
        StringBuffer buffer = new StringBuffer("[ ");
        while(tmp != null) {
            buffer.append(tmp.value).append(", ");
            tmp = tmp.next;
        }
        return buffer.delete(buffer.length() -2, buffer.length()).append(" ]").toString();
    }

    public static void main(String [] args) {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>(1,2,3,4,5,6);
        System.out.println(list);
        list.addFirst(10);
        list.addLast(30);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        list.removeLast();
        System.out.println(list);
    }
}
