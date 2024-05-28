public class PriorityQueueRunner {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(5);
        System.out.println(priorityQueue.isEmpty());
        System.out.println(priorityQueue.isFull());
        priorityQueue.insert(50);
        priorityQueue.insert(51);
        priorityQueue.insert(54);
        priorityQueue.insert(52);
        priorityQueue.insert(53);

        System.out.println(priorityQueue.size());
        while (!priorityQueue.isEmpty())
            System.out.println(priorityQueue.remove());

        System.out.println("is priority queue is empty ? " + priorityQueue.isEmpty());

    }
}
