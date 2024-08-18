public class CircularQueue<T> {
    private int top = -1;
    private int base = -1;
    private T[] data;

    public CircularQueue(int size) {
        data = (T[]) new Object[size];
    }

    public void add(T item) {
        if (isFull()) {
            throw new IllegalStateException("Fila Cheia");
        }
        else if (isEmpty()) {
            top++;
        }
        base = (base + 1) % data.length;
        data[base] = item;
    }

    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila Vazia");
        }
        T item = data[top];
        if (top == base) {
            top = base = -1;
        }
        else {
            top = (top + 1) % data.length;
        }
        return item;
    }

    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    }

    public boolean isFull() {
        return (base + 1) % data.length == top;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printQueue() {
        int i;
        if (isEmpty()) {
            System.out.println("Fila Vazia");
        } else {
            for (i = top; i != base; i = (i + 1) % data.length)
                System.out.print(data[i] + " ");
            System.out.println(data[i]);
        }

        System.out.println();
    }
}