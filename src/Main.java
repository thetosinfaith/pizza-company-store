import java.util.Scanner;

public class Main {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        PizzaCompany pizzaCompany = new PizzaCompany();

        System.out.println("""
                Welcome to Pizzazz,  a family-owned and operated pizza restaurant serving Africa for over 20 years!
                I'm Pizzanaut, your pizza assistant bot. What can I do for you today?
                                
                1 -> Suggest pizza package
                2 -> Know how many slices would be left
                3 -> View pizza prices
                4 -> Place an order
                5 -> Exit
                """);
        byte pizzanaut = input.nextByte();
        System.out.println("You picked " + pizzanaut + "!");

        switch (pizzanaut) {
            switch (pizzanaut) {
                case 1:
                    pizzaCompany.testForTotalNumberOfPeopleAtTheParty(20, 30, 10);
                    System.out.println("How many hungry people do you have?");
                    byte hungry = input.nextByte();

                    System.out.println("How many super hungry people do you have?");
                    byte superHungry = input.nextByte();

                    System.out.println("How many classic people do you have?");
                    byte classic = input.nextByte();
                    System.out.println("Great! So, you have " + hungry + " hungry, " + superHungry + " super hungry, and " + classic + " classic.");

                    PizzaSize pizzaSize = pizzaCompany.suggestPizzaPackage(hungry, superHungry, classic);

                    System.out.println("This" + pizzaSize.name() + "perfect for a party of" + PizzaSize.size + "It's" + PizzaSize.getPrice);
                    System.out.println("Would you like to order this pizza package?");

                    if (input.nextBoolean()) {
                        System.out.println("Your order is complete. Your order will be delivered in 30 minutes or less. Thank you for ordering from Pizzazz!");

                        int slices = pizzaCompany.CalculateTotalOrder();

                        System.out.print("Okay, your order is complete. Your order will be delivered in 30 minutes or less. Thank you for ordering from Pizzazz!");

                    }
                    break;

                case 2:
                    System.out.println("How many slices do you have left?");
                    int slices = input.nextInt();

                    System.out.println("How many people are you feeding?");
                    int people = input.nextInt();

                    int slicesPerPerson = slices / people;

                    System.out.println("Each person will get " + slicesPerPerson + " slices.");
                    break;

                case 3:
                    pizzaCompany.printPizzaPrices();
                    break;

                case 4:
                    pizzaCompany.placeOrder();
                    break;

                case 5:

            }
