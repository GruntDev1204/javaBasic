package part5;

public class MyStackByAL<E> extends MyArrayList<E>  implements MyStackInterface<E> {

    @Override
    public void push(E e) {
       this.add(e);
    }

    @Override
    public void pop() {
            this.removeIndex(this.getSize() - 1);
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
       return getElement(this.getSize() -1 );
    }

}
