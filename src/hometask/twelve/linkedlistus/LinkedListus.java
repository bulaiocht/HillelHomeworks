package hometask.twelve.linkedlistus;

import java.util.Iterator;

/**
 * Created by Kocherga Vitalii on 18.02.16.
 */
public class LinkedListus<T> implements Iterable<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;

    private class Node<T> {
        private T value;
        private Node<T> next;
        private Node<T> prev;

        /**
         * @param value
         */
        public Node(T value) {
            this.value = value;
        }

        /**
         * @param value
         * @param next  - link to next node
         * @param prev  - link to previous node
         */
        public Node(T value, Node<T> next, Node<T> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }

    /**
     * Adding node with defined value to the beginning of the list
     *
     * @param value
     */
    public void addFirst(T value) {
        if (isEmpty(first)) {
            Node<T> newNode = new Node<T>(value);
            first = last = newNode;
            last.prev = first;
            size++;
        } else {
            Node<T> newNode = new Node<T>(value, first, null);
            first.prev = newNode;
            first = newNode;
            size++;
        }
    }

    /**
     * Adding node with defined value to the end of the list
     *
     * @param value
     */
    public void addLast(T value) {
        if (isEmpty(last)) {
            Node<T> newNode = new Node<T>(value);
            first = last = newNode;
            size++;
        } else {
            Node<T> newNode = new Node<T>(value, null, last);
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
            size++;
        }
    }

    /**
     * Removing the first node of the list
     *
     * @return true when deletion is successful and false if not
     */
    public boolean removeFirst() {
        if (isEmpty(first)) {
            return false;
        } else {
            first = first.next;
            first.prev = null;
            size--;
            return true;
        }
    }

    /**
     * Removing the last node of the list
     *
     * @return true when deletion is successful and false if not
     */
    public boolean removeLast() {
        if (isEmpty(last)) {
            return false;
        } else {
            last = last.prev;
            last.next = null;
            size--;
            return true;
        }
    }

    /**
     * Deleting node on specified position inside the list
     *
     * @param index of node to delete
     * @return true if operation is successful and false if not
     */
    public boolean remove(int index) {
        if (index <= 0 || index > size) {
            throw new IndexOutOfBoundsException("No such element");
        } else if (index == 1) {
            removeFirst();
        } else if (index == size) {
            removeLast();
        } else {
            int count = 1;
            Node<T> tNode = first;
            while (tNode != null) {
                if (count == index) {
                    tNode.prev.next = tNode.next;
                    tNode.next.prev = tNode.prev;
                    size--;
                }
                tNode = tNode.next;
                count++;
            }
        }
        return true;
    }

    /**
     * setting the value of the node on specified position inside list
     *
     * @param index - position of a node. Beginning with 1
     * @param value -
     * @return true if operation is successful and false if not
     */
    public boolean set(int index, T value) {
        if (index <= 0 || index > size) {
            throw new IndexOutOfBoundsException("No such element");
        } else {
            int count = 1;
            Node<T> tNode = first;
            while (tNode != null) {
                if (count == index) {
                    tNode.value = value;
                }
                tNode = tNode.next;
                count++;
            }
        }
        return true;
    }

    /**
     * Checking if node has NULL value
     *
     * @param node
     * @return
     */
    private boolean isEmpty(Node<T> node) {
        return node == null;
    }

    /**
     * @return the size of a list
     */
    public int size() {
        return size;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private Node<T> pointer = first;

            @Override
            public boolean hasNext() {
                return pointer != null;
            }

            @Override
            public T next() {
                Node<T> tNode = pointer;
                pointer = pointer.next;
                return tNode.value;
            }
        };
    }
}