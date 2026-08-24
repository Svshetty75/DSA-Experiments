import java.util.Scanner;

class MyQueue {

    private String[] queue;
    private int front;
    private int rear;
    private int size;

    public MyQueue(int size) {
        this.size = size;
        queue = new String[size];
        front = 0;
        rear = -1;
    }

    public void enqueue(String name) {

        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        rear++;
        queue[rear] = name;

        System.out.println("Customer added- " + name);
    }

    public void dequeue() {

        if (front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Serving customer- " + queue[front]);

        queue[front] = null;
        front++;
    }

    public void peek() {

        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Front customer- " + queue[front]);
    }

    public void display() {

        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Railway Ticket Queue:");

        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }
}

public class RailwayQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum queue size-");
        int size = sc.nextInt();
        sc.nextLine();

        MyQueue railwayQueue = new MyQueue(size);

        int choice;

        do {

            System.out.println("\n=====Railway Ticket Queue=====");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter customer name:");
                    String name = sc.nextLine();
                    railwayQueue.enqueue(name);
                    break;

                case 2:
                    railwayQueue.dequeue();
                    break;

                case 3:
                    railwayQueue.peek();
                    break;

                case 4:
                    railwayQueue.display();
                    break;

                case 5:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
