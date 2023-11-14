import java.util.Scanner;

public class LegendsPizza {
    //A simple console app to help you order the right amount of pizza for your next party.
    //Simply enter the number of people attending, and the app will calculate the ideal number of pizzas to order.

    //hungry people => 2 slices
    //super-hungry => 4 slices
    //classic => 1 slice

    private  final int HUNGRY_PEOPLE = 2;
    private final int SUPER_HUNGRY = 4;
    private final int CLASSIC = 1;
    private final int LARGE_SLICES = 10;
    private final int MEDIUM_SLICES = 6;
    private final int SMALL_SLICES = 4;

    public int peopleAtTheParty(int hungry, int superHungry, int classic) {
        int totalHungry = hungry * HUNGRY_PEOPLE;
        int totalSuperHungry = superHungry * SUPER_HUNGRY;
        int totalClassic = classic * CLASSIC;

        int totalPeople = totalHungry + totalSuperHungry + totalClassic;

        return totalPeople;

    }

    public int suggestPizzaPackage(int large, int medium, int small){
        int totalSlices = large * LARGE_SLICES + medium * MEDIUM_SLICES + small * SMALL_SLICES;
        // If the number of large pizzas is more than 10, suggest the hungry package.
        if (totalSlices > 10) {
            return suggestPizzaPackage(10, medium, small);
        }






    }
}