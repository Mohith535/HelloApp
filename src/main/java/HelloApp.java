public class HelloApp {

    public static void main(String[] args) {

        // Case 1: No arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Arguments present → use enhanced for loop
        StringBuilder names = new StringBuilder();

        for (String name : args) {
            names.append(name).append(", ");
        }

        // Remove last comma and space
        names.setLength(names.length() - 2);

        // Final output
        System.out.println("Hello, " + names + "!");
    }
}