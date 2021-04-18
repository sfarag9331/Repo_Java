package Homework12;

public class restaurantPractice {
    public static void main(String[] args) {

        Restaurant p1 = new Restaurant("Sally", 200);
        p1.availablityOfXSeats(10);
        p1.seatsParty(5);
        p1.seatsParty(10);
        p1.seatsParty(15);
        p1.restaurantSummary();
        p1.removesParty(10);
        p1.restaurantSummary();
        p1.availablityOfXSeats(200);
        p1.seatsParty(10);
        p1.restaurantSummary();

    }
}
