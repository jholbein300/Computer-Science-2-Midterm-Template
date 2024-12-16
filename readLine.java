import java.util.Scanner;

public class readLine {

    private static final Scanner scanner = new Scanner(System.in);

    public static String readLine(String prompt) {
        System.out.print(prompt); // anyting is an int so it doesnt need checks
        return scanner.nextLine();
    }

    public static int readInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) { // checks if the next thing is an integer
            System.out.println("input isnt a int");
            System.out.print(prompt);
            scanner.next(); 
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public static double readDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("input is not a double");
            System.out.print(prompt);
            scanner.next();
        }
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }

    public static boolean readBoolean(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextBoolean()) { 
            System.out.println("input is not a boolean");
            System.out.print(prompt);
            scanner.next();
        }
        return scanner.nextBoolean();
    }
}