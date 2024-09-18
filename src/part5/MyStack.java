package part5;

public class MyStack<E> extends MyLinkedList<E> implements MyStackInterface<E> {
    private boolean useOption;

    public MyStack(boolean option) {
        this.useOption = option;
    }

    @Override
    public void push(E e) {
        if (useOption) {
            addFirst(e);  // Sử dụng addFirst nếu useOption là true
        } else {
            addLast(e);   // Sử dụng addLast nếu useOption là false
        }
    }

    @Override
    public void pop() {
        if (useOption) {
            removeFirst();  // Sử dụng removeFirst nếu useOption là true
        } else {
            removeLast();   // Sử dụng removeLast nếu useOption là false
        }
    }

    @Override
    public boolean isEmpty() {
        return this.getSize() == 0;
    }

    @Override
    public int size() {
        return this.getSize();
    }

    @Override
    public E peek() {
        if (useOption) {
            return this.getFirst();  // Sử dụng getFirst nếu useOption là true
        } else {
            return this.getLast();   // Sử dụng getLast nếu useOption là false
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyStackList: [");
        Node current = getHead(); // Lấy head từ getter

        while (current != null) {
            sb.append(current.data);
            if (getNext(current) != null) {
                sb.append(", ");
            }
            current = getNext(current); // Lấy next từ getter
        }

        sb.append("]");
        return sb.toString();
    }
}
