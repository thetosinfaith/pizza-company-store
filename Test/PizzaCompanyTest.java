import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaCompanyTest {
        @Test
        public void testForTotalNumberOfPeopleAtTheParty() {
            PizzaCompany pizzaCompany = new PizzaCompany();
            int hungry = 20;
            int superHungry = 30;
            int classic = 15;

            int totalNumberOfPeople = pizzaCompany.testForTotalNumberOfPeopleAtTheParty(hungry, superHungry, classic);

            int expectedTotalNumberOfPeople = 65;

            assertEquals(expectedTotalNumberOfPeople, totalNumberOfPeople);
        }

        @Test
        public void te
    }
