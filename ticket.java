public class ticket {
    private person passengerName;
    private plane flight;
    private String departureAirport;
    private String arrivalAirport;
    private String departureDate;
    private String seatNumber;

    public ticket(person passenger, plane flight, String departureAirport,String arrivalAirport, String departureDate, String seatNumber) {
        this.passengerName = passenger;
        this.flight = flight;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDate = departureDate;
        this.seatNumber = seatNumber;
    }

    public person getPassengerName() {
        return passengerName;
    }
    public String getStatus(){
        //this is to get the peron's plane information of it private or Commercial
        return flight.status();
    }
    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return "Passenger Name: " + passengerName + "\n" +
                "Flight Number: " + flight + "\n" +
                "Departure Airport: " + departureAirport + "\n" +
                "Arrival Airport: " + arrivalAirport + "\n" +
                "Departure Date: " + departureDate + "\n" +
                "Seat Number: " + seatNumber;
    }
}
