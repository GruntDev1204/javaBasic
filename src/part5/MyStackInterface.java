package part5;

public interface MyStackInterface<E> {
    void push(E e);
    void pop();
    boolean isEmpty();
    int size();
    E peek();
}
