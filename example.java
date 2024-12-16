public class example {
    public static void main(String[] args) {
        String name = readLine.readLine("What is your name? ");
        int age = readLine.readInt("What is your age? ");
        double height = readLine.readDouble("What is your height in meters? ");
        boolean finishedWork = readLine.readBoolean("Is your work done? ");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Finished work: " + finishedWork);
    }
}