public class TravelItinerary {
    private String departure;
    private String destination;
    private String vehicle;
    private String hotel;

    private TravelItinerary(Builder builder) {
        this.departure = builder.departure;
        this.destination = builder.destination;
        this.vehicle = builder.vehicle;
        this.hotel = builder.hotel;
    }

    @Override
    public String toString() {
        return "TravelItinerary{" +
                "departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", vehicle='" + vehicle + '\'' +
                ", hotel='" + hotel + '\'' +
                '}';
    }
    
    public static class Builder {
        private String departure;
        private String destination;
        private String vehicle;
        private String hotel;
    
        public Builder setDeparture(String departure) {
            this.departure = departure;
            return this;
        }

        public Builder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder setVehicle(String vehicle) {
            this.vehicle = vehicle;
            return this;
        }

        public Builder setHotel(String hotel) {
            this.hotel = hotel;
            return this;
        }

        public TravelItinerary build() {
            if (departure == null || destination == null) {
                throw new IllegalStateException("Departure and destination are mandatory fields!");
            }
            return new TravelItinerary(this);
        }
    }
}