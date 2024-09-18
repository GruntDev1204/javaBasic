package part5;

public class MyQueueByAL<E> extends MyArrayList<E> implements MyQueueInterface<E> {

    @Override
    public E peek() {
        return this.getElement(0);
    }

    @Override
    public void remove() {
        this.removeIndex(0);
    }

    @Override
    public int size() {
        return this.getSize();
    }

    @Override
    public boolean isEmpty() {
        return this.getSize() == 0;
    }
}
