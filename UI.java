import java.util.Scanner;

public class UI{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Ticketing System!");

        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Purchase a ticket");
            System.out.println("2. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    purchaseTicket(scanner);
                    break;
                case 2:
                    System.out.println("Thank you for using the Ticketing System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void purchaseTicket(Scanner scanner) {
        System.out.println("\nTicket Purchase");
        System.out.print("Enter passenger name: ");
        String passengerName = scanner.nextLine();
        //name the 
        System.out.print("Enter flight number: ");
        String flightNumber = scanner.nextLine();

        System.out.print("Enter departure airport: ");
        String departureAirport = scanner.nextLine();

        System.out.print("Enter arrival airport: ");
        String arrivalAirport = scanner.nextLine();

        System.out.print("Enter departure date: ");
        String departureDate = scanner.nextLine();

        System.out.print("Enter seat number: ");
        String seatNumber = scanner.nextLine();

        ticket ticket = new ticket(passengerName, flightNumber, departureAirport,arrivalAirport, departureDate, seatNumber);

        System.out.println("\nTicket details:");
        System.out.println(ticket.toString());
    }
}