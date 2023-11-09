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
        int pizzanaut = input.nextInt();
        System.out.println("You picked " + pizzanaut + "!");

        switch (pizzanaut){
            case 1:
                pizzaCompany.testForTotalNumberOfPeopleAtTheParty(20, 30, 10);
                System.out.println("How many hungry people do you have?");
                int hungry = input.nextInt();

                System.out.println("How many super hungry people do you have?");
                int superHungry = input.nextInt();

                System.out.println("How many classic people do you have?");
                int classic = input.nextInt();
                System.out.println("Great! So, you have " + hungry + " hungry, " + superHungry + " super hungry, and " + classic + " classic.");

                System.out.println("");

                System.out.println("""
                        Suggested pizza package: """ + pizzaSize.name() + ""\" Pizza
                                                    This pizza is perfect for a party of ""\" + pizzaSize.getPartySize() + ""\" people.
                                                    Price: ""\" + pizzaSize.getPrice());
                        """);

                System.out.println("Would you like to order this pizza package?");

                boolean order = SCANNER.nextBoolean();

                if (order) {
                    System.out.println("Your order is complete. Your order will be delivered in 30 minutes or less. Thank you for ordering from Pizzazz!");

                    int slices = pizzaCompany.CalculateTotalOrder();

                    System.out.println("You ordered a " + pizzaSize.name() + " pizza with " + slices + " slices.");
                }
                break;


                switch (pizzanaut){
                    case 2:
                        pizzaCompany.



            switch (pizzaSize) {
                case BIGPIZZA ->


                    System.out.println("Great! So, you have " + hungry + " hungry, " + superHungry + " super hungry, and " + classic + " classic.");

                    for (int c = 0; c < 1; c++) {
                        for (int j = 0; j < c; j++) {
                            System.out.println("Fetching data...");

                        }
                        System.out.println("""
                                Suggested pizza package: Medium Pizza
                                This pizza is perfect for a party of 4-6 people.
                                Price: #2K
                                                                
                                Would you like to order this pizza package?
                                """);
                        boolean check = input.nextBoolean();

                        break;


                        if (check == yes)
                            PizzaCompany pizzaCompany = new PizzaCompany() {
                                int slices = pizzaCompany.CalculateTotalOrder();

                        System.out.print("Okay, your order is complete. Your order will be delivered in 30 minutes or less. Thank you for ordering from Pizzazz!");

                            }

                    }

                        else if (pizzanaut == hungry) {
                            PizzaCompany pizzaCompany = new PizzaCompany();
                            int slices = pizzaCompany.largeHas10Slices(10);
                            System.out.println("The number of slices needed for a party of 15 people is: " + slices);
                        }

                        switch (pizzanaut) {
                            case 5 -> {
                                System.out.println("""
                                        1 -> Big Pizza = #5k
                                        2 -> Medium Pizza = #3K
                                        3 -> Small Pizza = #2k
                                        """);

                            }

                    }
                    switch (pizzanaut) {
                        case 4 -> {
                            System.out.println("Your order has been placed. You can expect your pizzas to be delivered within 30 minutes.");
                        }

                    }

                    switch (pizzanaut) {
                        case 5 -> {
                            System.out.println("""
                                    1 -> Contact customer support
                                    2 -> View your order history
                                    3 -> Leave a feedback
                                    """);
                        }
                    }


                default -> throw new IllegalStateException("Unexpected value: " + pizzaSize);
            }
                default -> throw new IllegalStateException("Unexpected value: " + input);
            }

        }


//        while (!input.equals(5));
//        System.out.println("Thanks for Patronizing!");

    }

}




