import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PizzaCompany pizzaCompany = new PizzaCompany();

        Scanner input = new Scanner(System.in);

        System.out.println("""
                Welcome to Pizzazz,  a family-owned and operated pizza restaurant serving Africa for over 20 years!
                I'm Pizzanaut, your pizza assistant bot. What can I do for you today?
                                
                1. Suggest pizza package
                2. Know how many slices would be left
                3. View pizza prices
                4. Place an order
                5. Exit
                """);
        int pizzanaut = input.nextByte();
        System.out.println("You picked " + pizzanaut + "!");

        switch (pizzanaut) {
            case 1:
                System.out.println("How many hungry people do you have?");
                int hungry = input.nextInt();

                System.out.println("How many super hungry people do you have?");
                int superHungry = input.nextInt();

                System.out.println("How many classic people do you have?");
                int classic = input.nextInt();
                System.out.println("Great! So, you have " + hungry + " hungry, " + superHungry + " super hungry, and " + classic + " classic.");

                LegendsPizza legendsPizza = new LegendsPizza();
                legendsPizza.peopleAtTheParty(9, 7, 3);



                System.out.println("This " + pizzaSize + " pizza is perfect for a party of " + pizzaSize.ordinal() + ". It's " + pizzaSize.getPrice());
                System.out.println("Would you like to order this pizza package?");

                if (input.nextBoolean()) {
                    System.out.println("Your order is complete. Your order will be delivered in 30 minutes or less. Thank you for ordering from Pizzazz!");

                    int slices = pizzaCompany.calculateTotalOrder(pizzaSize);

                    System.out.println("Okay, your order is complete. Your order will be delivered in 30 minutes or less. Thank you for ordering from Pizzazz!");
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
                System.out.println("Thank you for visiting Pizzazz! We hope you enjoyed your experience.");
                break;

            default:
                System.out.println("Invalid option. Please enter a number between 1 and 5.");
        }