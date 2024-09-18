package part5;

public class MyQueue<E> extends MyLinkedList<E> implements MyQueueInterface<E> {
    private boolean option;


    //true là xài addfirst , false xài addlast
    public MyQueue(boolean otp){
        this.option = otp;
    }

    @Override
    public void add(E e) {
        if (this.option) {
            addFirst(e);
        } else {
            addLast(e);
        }
    }

    @Override
    public E peek() {
        //lấy thằng đầu tiên đc add vào
        if (this.option) {
           return  this.getLast();
        } else {
           return this.getFirst();
        }
    }

    @Override
    public void remove() {
        //xóa từ thằng đầu tiên đc add vào
        if (this.option) {
              this.removeLast();
        } else {
             this.removeFirst();
        }
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
