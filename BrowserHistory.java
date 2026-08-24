import java.util.Scanner;

class Browse {

    private String[] stack;
    private int top;
    private int size;

    public Browse(int size) {
        this.size = size;
        stack = new String[size];
        top = -1;
    }

    public void push(String url) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        stack[top] = url;

        System.out.println("Visited- " + url);
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Going back from-" + stack[top]);

        stack[top] = null;
        top--;
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Browser history is empty.");
            return;
        }

        System.out.println("Current page-" + stack[top]);
    }

    public void display() {
        if (top == -1) {
            System.out.println("Browser history is empty.");
            return;
        }

        System.out.println("Browser history:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}

public class BrowserHistory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum history size-");
        int size = sc.nextInt();
        sc.nextLine();

        Browse browser = new Browse(size);

        int choice;

        do {
            System.out.println("\n=====Browser History=====");
            System.out.println("1.Visit New Page");
            System.out.println("2.Back");
            System.out.println("3.Current page");
            System.out.println("4.Display History");
            System.out.println("5.Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter url:");
                    String url = sc.nextLine();
                    browser.push(url);
                    break;

                case 2:
                    browser.pop();
                    break;

                case 3:
                    browser.peek();
                    break;

                case 4:
                    browser.display();
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