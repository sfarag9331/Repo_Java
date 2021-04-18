package Homework12;

public class Restaurant {

    int currentGuestCount = 0;
    int totalGuestsSoFar;
    String restaurantName;
    int maxGuestCapacity;
    /**
     * Create a Restaurant class:
     *
     * name
     * maxGuestCapacity
     * currentGuestCount
     * totalGuestsSoFar
     *
     * 1. Constructor that allows user to start a restaurant by passing restaurant name and max capacity.
     *      data form user goes to name and maxGuestCapacity
     */
    public Restaurant (String name, int numberOfGuests){
        restaurantName = name;
        maxGuestCapacity = numberOfGuests;

    }

    /**
     * 2. Create a method that tells user if the X number of seats are available
     *      parameter: int
     *
     */
    public void availablityOfXSeats (int numberOfSeats) {
        if (maxGuestCapacity >= numberOfSeats + currentGuestCount){
            System.out.println("Party of " + numberOfSeats + " is available now for seating");
        } else if (maxGuestCapacity < numberOfSeats + currentGuestCount ){
            System.out.println("Party of " + numberOfSeats + " is not available for seating, there's a 30 minute wait time");
        }
    }

    /**
     * 3. Create a method that seats party
     *      parameter: int
     */
    public void seatsParty (int numberOfSeats) {
            currentGuestCount = currentGuestCount + numberOfSeats;
            totalGuestsSoFar = totalGuestsSoFar + numberOfSeats;
    }

     /**
     * 4. Create a method that remove party
     *      parameter: int
     */
     public void removesParty (int numberOfSeats) {
         currentGuestCount = currentGuestCount - numberOfSeats;
     }


     /**
     * 5. Create a method that prints the restaurant summary:
     *      Name:
     *      Max capacity:
     *      Current guest count:
     *      Total guests served so far:
     *
     */
     public void restaurantSummary () {
         System.out.println("Restaurant Summary " +
                 "\nName: " + restaurantName +
                         "\nMax capacity: " + maxGuestCapacity +
                         "\nCurrent guest count: " + currentGuestCount +
                         "\nTotal guests served so far: " + totalGuestsSoFar + "\n\n");
     }


}
