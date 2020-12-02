public class PilhaArranjo2 implements Pilha {
    protected int capacity = 8;
    protected Integer[] pilha = new Integer[capacity];
    protected int size = 0;

    @Override
    public void add(int newElement) {
        if (size == capacity) {
            capacity *= 2;
            Integer[] temp = new Integer[capacity];

            for (int i = 0; i < pilha.length; i++) {
                temp[i] = pilha[i];
            }

            pilha = temp;
        }

        pilha[size++] = newElement;
    }

    @Override
    public int remove() {
        return pilha[--size];
    }
}
