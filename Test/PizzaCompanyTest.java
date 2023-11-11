import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaCompanyTest {

    @Test
    public void testTotalNumberOfPeopleAtTheParty() {
        PizzaCompany pizzaCompany = new PizzaCompany();
        int hungry = 20;
        int superHungry = 30;
        int classic = 15;
        int totalNumberOfPeople = pizzaCompany.totalNumberOfPeopleAtTheParty(hungry, superHungry, classic);
        int expectedTotalNumberOfPeople = 65;
        assertEquals(expectedTotalNumberOfPeople, totalNumberOfPeople);
    }

    @Test
    public void testForLargePizzaSize() {
        PizzaCompany pizzaCompany = new PizzaCompany();
        int largePizzas;
        int mediumPizzas;
        int smallPizzas;
        PizzaCompany.Size suggestedPizzaSize;

        largePizzas = 4;
        mediumPizzas = 2;
        smallPizzas = 1;
        suggestedPizzaSize = pizzaCompany.pizzaSize(largePizzas, mediumPizzas, smallPizzas);
        assertEquals(PizzaCompany.Size.LARGE, suggestedPizzaSize);

        largePizzas = 0;
        mediumPizzas = 0;
        smallPizzas = 3;
        suggestedPizzaSize = pizzaCompany.pizzaSize(largePizzas, mediumPizzas, smallPizzas);
        assertEquals(PizzaCompany.Size.SMALL, suggestedPizzaSize);

        largePizzas = 0;
        mediumPizzas = 5;
        smallPizzas = 1;
        suggestedPizzaSize = pizzaCompany.pizzaSize(largePizzas, mediumPizzas, smallPizzas);
        assertEquals(PizzaCompany.Size.MEDIUM, suggestedPizzaSize);
    }

    @Test
    public void testCalculateOrder() {
        PizzaCompany pizzaCompany = new PizzaCompany();
        int largePizzas = 2;
        int mediumPizzas = 1;
        int smallPizzas = 3;
        String order = pizzaCompany.calculateOrder(largePizzas, mediumPizzas, smallPizzas);
        String expectedOrder = "2 Large pizzas, 1 Medium pizza, and 3 Small pizzas";
        assertEquals(expectedOrder, order);
    }
}