public class QueueRunner {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        System.out.println(queue.isEmpty());
        queue.insert(50);
        queue.insert(51);
        queue.insert(52);
        queue.insert(53);
        queue.insert(54);

        System.out.println(queue.isFull());
        System.out.println(queue.size());
        System.out.println(queue.peek());

        // System.out.println(queue.isEmpty());

    }
}
