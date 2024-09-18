package part5;

public interface MyQueueInterface<E> {
    //using add() , peek() , remove()

    void add(E e);
    E peek();
    void remove();
    int size();
    boolean isEmpty();



}
