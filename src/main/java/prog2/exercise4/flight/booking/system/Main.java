package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String passengerFullName = input.next();
        System.out.println("Please enter your date of departure: ");
        String departureDate1 = input.next();
        System.out.println("Please enter your date of return: ");
        String returnDate1 = input.next();
        System.out.println("Please enter how many children tickets do you need: ");
        int childPassengers = input.nextInt();
        System.out.println("Please enter how many adult tickets do you need: ");
        int adultPassengers = input.nextInt();

        LocalDate departureDate = LocalDate.parse(departureDate1);
        LocalDate returnDate = LocalDate.parse(returnDate1);
        input.close();

        FlightBooking family1 = new FlightBooking(passengerFullName, departureDate, returnDate, childPassengers,
                adultPassengers);

        family1.setTripSource("1");
        family1.setTripDestination("1", "2");
        family1.setReturnDate(returnDate);
        family1.setTripType("2");
        family1.setBookingClass("1");

        family1.setDepartingTicketPrice(2, 5);
        family1.setReturnTicketPrice();

        family1.setTotalTicketPrice();

        System.out.println(family1.StringOption1());

    }
}
