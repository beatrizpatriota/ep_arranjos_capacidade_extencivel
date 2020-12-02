public class PilhaIngenua2 implements Pilha {
    protected int capacity;
    public static int CAPACITY = 8;
    protected Integer[] pilha;
    protected int size;

    PilhaIngenua2() {
        capacity = CAPACITY;
        pilha = new Integer[capacity];
        size = 0;
    }

    public void add(int newElement) {
        if(size == capacity) {
            capacity += CAPACITY;
            Integer [] tmp = new Integer[capacity];
            for (int j = 0; j < size; j++)
                tmp[j] = pilha[j];
            pilha = tmp;
        }

        pilha[size] = newElement;
        size++;
    }

    public int remove() {
        int tmp = pilha[size - 1];
        size--;
        return tmp;
    }
}
