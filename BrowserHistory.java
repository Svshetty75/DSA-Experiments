import java.util.Scanner;
public class StackBrowserHistory {
static String[] stack = new String[10];
static int top = -1;
static void push(String url) {
if (top == stack.length - 1) {
System.out.println("Stack Overflow! Browser history is full.");
} else {
top++;
stack[top] = url;
System.out.println("Page added to history.");
}
}
static void pop() {
if (top == -1) {
System.out.println("Stack Underflow! No history available.");
} else {
System.out.println("Going back from: " + stack[top]);
top--;
}
}
static void peek() {
if (top == -1) {
System.out.println("No pages in history.");
} else {
System.out.println("Current page: " + stack[top]);
}
}
static void display() {
if (top == -1) {
System.out.println("No pages in history.");
} else {
System.out.println("Browser History:");
for (int i = top; i >= 0; i--) {
System.out.println(stack[i]);
}}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int choice;
do {
System.out.println("\n--- Browser History ---");
System.out.println("1. Push");
System.out.println("2. Pop");
System.out.println("3. Peek");
System.out.println("4. Display");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
sc.nextLine();
switch (choice) {
case 1:
System.out.print("Enter URL: ");
String url = sc.nextLine();
push(url);
break;
case 2:
pop();
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
