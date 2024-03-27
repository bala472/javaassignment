public class Flight {
    private String name;
    private String ticketPrice;
    private String arrivalTime;
    private String departureTime;
    private String flightNumber;
    private static int totalFlightCount;
    public Flight(){
        totalFlightCount++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(String ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public String getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public String getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public static int getTotalFlightCount() {
        return totalFlightCount;
    }
}
