public class Main {

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.add(1);
        queue.add(2.5);
        queue.add("a");
        queue.add(4);
        queue.add(5);


        queue.printQueue();
    }
}