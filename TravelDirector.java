public class TravelDirector {
    public void constructBusinessTrip(TravelItinerary.Builder builder) {
        builder.setDeparture("Taraz")
               .setDestination("Astana")
               .setVehicle("Airplane")
               .setHotel("Hilton");
    }
    
    public void constructHikingTrip(TravelItinerary.Builder builder) {
        builder.setDeparture("Almaty")
               .setDestination("Medeu")
               .setVehicle("Bus");
    }
}
