public class App {
    public static void main(String[] args) {
        System.out.println("Hello, CI/CD!");
        System.out.println("x is chosen by system.");
        int x = countdown(3);
        System.out.println("result: " + x);
    }
    
    // helper method for testing
    public static int countdown(int start) {
        int x = start;
        while (x != 0) {
            x--;
        }
        return x;
    }
}