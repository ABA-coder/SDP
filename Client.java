public class Client {
    public static void main(String[] args) {
        TravelDirector director = new TravelDirector();

        TravelItinerary.Builder businessBuilder = new TravelItinerary.Builder();
        director.constructBusinessTrip(businessBuilder);
        TravelItinerary businessTrip = businessBuilder.build();
        System.out.println("Director build: " + businessTrip);

        TravelItinerary customTrip = new TravelItinerary.Builder()
                .setDeparture("Astana")
                .setDestination("Paris")
                .setHotel("Louvre Hotel")
                .build();
        System.out.println("Custom build: " + customTrip);

        try {
            TravelItinerary invalidTrip = new TravelItinerary.Builder()
                    .setDestination("London")
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Validation caught: " + e.getMessage());
        }
    }
}