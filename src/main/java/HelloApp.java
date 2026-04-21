public class HelloApp {

    public static void main(String[] args) {

        // No arguments → default
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use String.join() to combine names
        String names = String.join(", ", args);

        // Print result
        System.out.println("Hello, " + names + "!");
    }
}