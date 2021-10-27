
/**
 * @author Albert Ku
 * @date 2020/3/4
 */


public class StackD<E> {

    private Object[] data;
    private int lastElement = -1;

    public StackD() {
        this(10);
    }

    public StackD(int capacity) {
        data = new Object[capacity];
    }


    public E push(E item) {
        if (lastElement == data.length-1){
            this.expansion();
        }
        data[lastElement++] = (Object) item;
        return item;
    }


    public E pop() {
        Object item = data[data.length-1];
        //let gc
        data[data.length-1] = null;
        return (E)item;
    }


    public boolean empty() {
        return data.length > 0;
    }


    public boolean search(E item) {
        for (int i = 0; i <data.length; i++) {
            if (data[i] == item){
                return true;
            }
        }
        return false;
    }


    private void expansion() {
        int newCount = Math.min(data.length << 2, Integer.MAX_VALUE);
        Object[] temp = new Object[newCount];
        for (int i = 0; i <data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
}
