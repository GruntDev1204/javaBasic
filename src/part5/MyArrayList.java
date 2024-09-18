package part5;

public class MyArrayList<E> {
    private int capacity;
    private int size;

    private E[] elements;

    private final int defaultCapacity = 10;

    public MyArrayList() {
        this.capacity = defaultCapacity;
        // Khởi tạo mảng với Object và ép kiểu sau
        this.elements = (E[]) new Object[capacity];
        this.size = 0;
    }

    public MyArrayList(int cap) {
        this.capacity = cap;
        this.elements = (E[]) new Object[capacity];
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public void add(E e) {
        if (this.size == this.capacity) {
            addCapacity();
        }
        this.elements[this.size] = e;
        this.size++;
    }

    public void add(int index, E element) {
        if (index > size || index < 0) {
            System.out.println("Index quá kích thước ");
            return;
        }
        if (size == capacity) {
            addCapacity();
        }
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public E getElement(int index) {
        if (index >= size || index < 0) {
            System.out.println("Tìm kiếm quá kích thước ");
            return null;
        }
        return elements[index];
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy
    }

    public void removeIndex(int index) {
        if (index >= size || index < 0) {
            System.out.println("Index quá kích thước ");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    public void removeElement(E element) {
        int i = 0;
        while (i < size) {
            if (elements[i].equals(element)) {
                removeIndex(i);
            } else {
                i++;
            }
        }
    }

    public int lastIndexOf(E element) {
        for (int i = size - 1; i >= 0; i--) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy
    }

    private void addCapacity() {
        this.capacity *= 2;
        E[] newArray = (E[]) new Object[capacity];
        // Sao chép các phần tử cũ sang mảng mới
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyArrayList: [");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
