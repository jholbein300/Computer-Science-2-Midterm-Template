//For this problem:
    //This program is meant to calculate the total after tax and tip
        //One small problem!
            //For some reason, unless you put 100% for the tip, it doesn't calculate it!
            //Figure out why, and change it so that the program runs effectively
            //For full credit, add input validation (so I can not put a negative value for the price, tip, or tax rate)

public class Problem3 {
    public static void main(String[] args) {

        double mealPrice = readLine.readDouble("Enter the meal price: ");

        int tipPercentage = readLine.readInt("Enter the tip percentage: ");

        int taxRate = readLine.readInt("Enter the tax rate: ");

        double tip = mealPrice * (tipPercentage / 100);
        double tax = mealPrice * (taxRate / 100);

        double totalCost = mealPrice + tip + tax;

        System.out.printf("The total cost of your meal is: $%.2f%n", totalCost);

    }
}
