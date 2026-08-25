import java.util.Scanner;
public class Main {
static int[] queue;
static int front = -1;
static int rear = -1;
static void enqueue(int value) {
if (rear == queue.length - 1) {
System.out.println("Queue Overflow");
} else {
if (front == -1) {
front = 0;
}
rear++;
queue[rear] = value;
System.out.println(value + " added to the queue.");
}
}
static void dequeue() {
if (front == -1 || front > rear) {
System.out.println("Queue Underflow");
} else {
System.out.println(queue[front] + " removed from the queue.");
front++;
if (front > rear) {
front = -1;
rear = -1;
}
}
}
static void peek() {
if (front == -1) {
System.out.println("Queue is empty.");
} else {
System.out.println("Front element: " + queue[front]);
}
}
    static void display() {
if (front == -1) {
System.out.println("Queue is empty.");
} else {
System.out.print("Queue: ");
for (int i = front; i <= rear; i++) {
System.out.print(queue[i] + " ");
}
System.out.println();
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter queue size: ");
int size = sc.nextInt();
queue = new int[size];
int choice;
do {
System.out.println("\n--- Linear Queue Menu ---");
System.out.println("1. Enqueue");
System.out.println("2. Dequeue");
System.out.println("3. Peek");
System.out.println("4. Display");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
switch (choice) {
case 1:
System.out.print("Enter value: ");
int value = sc.nextInt();
enqueue(value);
break;
        case 2:
dequeue();
break;
case 3:
peek();
break;
case 4:
display();
break;
case 5:
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid choice.");
}
} while (choice != 5);
sc.close();
}
}
