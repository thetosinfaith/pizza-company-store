public class PizzaCompany {
    public enum Size {
        SMALL,
        MEDIUM,
        LARGE
    }

    public int totalNumberOfPeopleAtTheParty(int hungry, int superHungry, int classic) {
        return hungry + superHungry + classic;
    }

    public Size suggestPizzaSize(int hungry, int superHungry, int classic) {
        int totalPeople = totalNumberOfPeopleAtTheParty(hungry, superHungry, classic);
        if (totalPeople >= 10) {
            return Size.LARGE;
        } else if (totalPeople >= 5) {
            return Size.MEDIUM;
        } else {
            return Size.SMALL;
        }
    }

    public void placeOrder(Size pizzaSize, int quantity) {
        PizzaCompany pizzaCompany = new PizzaCompany();
        Size suggestedPizzaSize = pizzaCompany.suggestPizzaSize(20, 30, 15);
        pizzaCompany.placeOrder(suggestedPizzaSize, 2);
        System.out.println("Placing order for " + quantity + " " + pizzaSize + " pizzas");
    }

    public int calculateTotalOrder(int largePizzas, int mediumPizzas, int smallPizzas) {
        int totalOrderCost = 0;
        totalOrderCost += largePizzas * PizzaSize.LARGE.ordinal();
        totalOrderCost += mediumPizzas * PizzaSize.MEDIUM.ordinal();
        totalOrderCost += smallPizzas * PizzaSize.SMALL.ordinal();
        return totalOrderCost;
    }
}