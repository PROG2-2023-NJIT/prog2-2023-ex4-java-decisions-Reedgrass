package prog2.exercise4.flight.booking.system;


package org.example;
import java.time.LocalDate;

public class FlightBooking {
    private String flightCompany;
    //  e.g.,  FOF0345IN
    private String flightID;
    private String passengerFullName;
    private String sourceAirport ;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private int childPassengers = 0;
    private int adultPassengers = 0;
    private int totalPassengers;
    private double departingTicketPrice;
    private double returnTicketPrice;
    private double totalTicketPrice;
    private String ticketNumber;

    private String ticketNumber1;
    private String ticketNumber2;
    private String ticketNumber3;
    private String ticketNumeber4;

    private String BookingCLass;

    //private String TripType;

    public FlightBooking(String passengerFullName, LocalDate depart, LocalDate returnDate, int childPassengers, int adultPassengers) {
        this.passengerFullName = passengerFullName;
        this.departureDate = depart;
        this.returnDate = returnDate;
        this.childPassengers = childPassengers;
        this.adultPassengers = adultPassengers;

        this.flightID = "FOF0345IN";
        this.ticketNumber = this.childPassengers  + "" + this.adultPassengers + this.flightID;
    }



    public String getFlightCompany() {
        return flightCompany;
    }

    public void setFlightCompany(String flightCompany) {
        this.flightCompany = flightCompany;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getPassengerFullName() {
        return passengerFullName;
    }

    public void setPassengerFullName(String passengerFullName) {
        this.passengerFullName = passengerFullName;
    }

    public String getSourceAirport() {
        return sourceAirport;
    }

    public void setSourceAirport(String sourceAirport) {
        this.sourceAirport = sourceAirport;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public LocalDate getDepartingDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getChildPassengers() {
        return childPassengers;
    }

    public int getChildrenPassengers() {
        return childPassengers;
    }

    public void setChildPassengers(int childPassengers) {
        this.childPassengers = childPassengers;
    }

    public int getAdultPassengers() {
        return adultPassengers;
    }

    public void setAdultPassengers(int adultPassengers) {
        this.adultPassengers = adultPassengers;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public void setTotalPassengers(int childPassengers, int adultPassengers) {
        this.childPassengers = childPassengers;
        this.adultPassengers = adultPassengers;
        this.totalPassengers = childPassengers + adultPassengers;
    }

    public double getDepartingTicketPrice() {
        return departingTicketPrice;
    }

    public void setDepartingTicketPrice(double departingTicketPrice) {
        this.departingTicketPrice = departingTicketPrice;
    }

    public double getReturnTicketPrice() {
        return returnTicketPrice;
    }

    public void setReturnTicketPrice(double returnTicketPrice) {
        this.returnTicketPrice = returnTicketPrice;
    }


    public void setTotalTicketPrice(double totalTicketPrice) {
        this.totalTicketPrice = totalTicketPrice;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }


    //task 2
    public String getBookingCLass() {
        return BookingCLass;
    }

    public void setBookingClass(String numOfBookingClass) {
        this.BookingCLass = numOfBookingClass ;
    }
    public enum BookingClass{
        First,Business,Economy
    }

    private BookingClass bookingClass;

    public void setBookingCLass(String numOfBookingCLass) {
        switch (numOfBookingCLass){
            case "1" : bookingClass = BookingClass.First;
            this.ticketNumber2="F";
            break;

            case "2" : bookingClass = BookingClass.Business;
            this.ticketNumber2="B";
            break;

            case "3" : bookingClass = BookingClass.Economy;
            this.ticketNumber2="E";
            break;
        }

    }

    public BookingClass getBookingClass() {
        return bookingClass;
    }
    /*public String getTripType() {
        return TripType;
    }
    public void setTripType(String numOfTripType) {
        this.TripType = numOfTripType ;
    }*/

    //task 3
    public enum tripType{
        Oneway,Return
    }
    //这里主打的就是一个莫名其妙，明明是一样的东西，可是为什么就是不行。

    private tripType TripType;
    public void tripType(String numOfTripType) {
        switch (numOfTripType){
            case "1" : TripType= tripType.Oneway;
                this.ticketNumber1="11";
                break;

            case "2" : TripType= tripType.Return;
                this.ticketNumber1="22";
                break;

        }

    }

    public tripType getTripType() {
        return TripType;
    }
    //task 4 //task 5

    public enum TripSource {
        Nanjing,Beijing,Shanghai,Oulu,Helsinki,Paris
    }
    private TripSource tripSource;

    public void tripSource(String numOfTripSource){
        switch (numOfTripSource){
            case "1":tripSource = TripSource.Nanjing;
            break;

            case "2":tripSource = TripSource.Beijing;
            break;

            case "3":tripSource = TripSource.Shanghai;
            break;

            case "4":tripSource = TripSource.Oulu;
            break;

            case "5":tripSource = TripSource.Helsinki;
            break;

            case "6":tripSource = TripSource.Paris;
            break;
        }

    }
    public TripSource getTripSource(){
        return tripSource;
    }
    //
    public enum TripDestination {
        Nanjing,Beijing,Shanghai,Oulu,Helsinki,Paris
    }
    private  TripDestination tripDestination;

    public void TripDestination(String numOfTripDestination) {
        switch (numOfTripDestination) {
            case "1":
                tripDestination = TripDestination.Nanjing;
                break;

            case "2":
                tripDestination = TripDestination.Beijing;
                break;

            case "3":
                tripDestination = TripDestination.Shanghai;
                break;

            case "4":
                tripDestination = TripDestination.Oulu;
                break;

            case "5":
                tripDestination = TripDestination.Helsinki;
                break;

            case "6":
                tripDestination = TripDestination.Paris;
                break;
        }
    }
    public TripDestination getTripDestination(){
        return tripDestination;
    }
    //
    public enum  DestinationAirport{
        NanjingLukouInternationalAirport,BeijingCapitalInternationalAirport,ShanghaiPudongInternationalAirport, OuluAirport,
         HelsinkiAirport,ParisCharlesdeGaulleAirport
    }

    private DestinationAirport destinationAirport;

    public void setDestinationAirport (String numOfDestinationAirport){
        switch (numOfDestinationAirport){
            case "1":destinationAirport = DestinationAirport.NanjingLukouInternationalAirport;
            break;

            case "2":destinationAirport = DestinationAirport.BeijingCapitalInternationalAirport;
            break;

            case "3":destinationAirport = DestinationAirport.ShanghaiPudongInternationalAirport;
            break;

            case "4":destinationAirport = DestinationAirport.OuluAirport;
            break;

            case "5":destinationAirport = DestinationAirport.HelsinkiAirport;
            break;

            case "6":destinationAirport = DestinationAirport.ParisCharlesdeGaulleAirport;
            break;
        }
    }
    public DestinationAirport getDestinationAirport(){
        return destinationAirport;
    }

    public void setTicketNumber(String TicketNumber){
        String a = "0";
        String b  = "0";
        String c ="0";
        if(TripType==tripType.Oneway){
            a = "11";
        }
        if(TripType==tripType.Return){
            a = "22";
        }
        if(bookingClass==BookingClass.First){
            b = "F";
        }
        if(bookingClass==BookingClass.Business){
            b = "B";
        }
        if(bookingClass==BookingClass.Economy){
            b = "E";
        }
        if((tripSource==TripSource.Nanjing&&tripDestination==TripDestination.Beijing) ||(tripSource==TripSource.Beijing&&tripDestination==TripDestination.Nanjing) ||(tripSource==TripSource.Oulu&&tripDestination==TripDestination.Helsinki) ||(tripSource==TripSource.Helsinki&&tripDestination==TripDestination.Oulu)){
            c = "DOM";
        }
        else{
            c = "INT";
        }
        this.ticketNumber = a + b + "0000" +c;

    }

    public void setTotalTicketPrice() {
        this.totalTicketPrice = Math.abs((((2 *((300 + (0.1*300)) + (0.05*300))) + (5*((300 + (0.1*300)) + (0.05*300)))) + 250)*2);
    }
    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }



    @Override
    public String toString() {
        String result = "Dear " + passengerFullName + ". Thank you for booking your flight with " +
                flightCompany + ". Following are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + ticketNumber + "\n" +
                "From " + tripSource + " to " + tripDestination + "\n" +
                "Date of departure: " + departureDate + "\n" +
                "Date of return: " + returnDate + "\n" +
                "Total passengers: " + totalPassengers + "\n" +
                "Total ticket price in Euros: " + totalTicketPrice;

        return result;
    }
}
