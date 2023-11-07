import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaCompanyTest {

    @Test

    void testThatLargeHas10Slices(){

        PizzaCompany pizzaCompany = new PizzaCompany();

        int slices = pizzaCompany.largeHas10Slices();

        assertEquals(10, slices);
    }

    void testThatMediumHas6Slices(){

        PizzaCompany pizzaCompany = new PizzaCompany();

        int slices = pizzaCompany.MediumHas6Slices();

        assertEquals(6, slices);
    }

    void testThatSmallHas4Slices(){

        PizzaCompany pizzaCompany = new PizzaCompany();

        int slices = pizzaCompany.SmallHas4Slices();

        assertEquals(4, slices);
    }



    void testThatAppCanAccuratelyCountPartyAttendees(){

//        PizzaCompany pizzaCompany = new PizzaCompany();
//
//        pizzaCompany.
//
//
//        assertEquals(7,  );

    }

}