import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NaijaComfortInn {

    static class Room {
        private final int roomNumber;
        private final String roomType;
        private final double pricePerNight;
        private boolean isAvailable;
        private boolean needsMaintenance;

        public Room(int roomNumber, String roomType, double pricePerNight) {
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.pricePerNight = pricePerNight;
            this.isAvailable = true;
            this.needsMaintenance = false;
        }

        public int getRoomNumber() {
            return roomNumber;
        }

        public String getRoomType() {
            return roomType;
        }

        public double getPricePerNight() {
            return pricePerNight;
        }

        public boolean isAvailable() {
            return isAvailable && !needsMaintenance;
        }

        public void bookRoom() {
            isAvailable = false;
        }

        public void cancelBooking() {
            isAvailable = true;
        }

        @Override
        public String toString() {
            return "Room " + roomNumber + " (" + roomType + "), Price: " + pricePerNight + " per night";
        }
    }

    static class Guest {
        private final String guestName;
        private final String guestPhone;
        private final String guestEmail;

        public Guest(String guestName, String guestPhone, String guestEmail) {
            this.guestName = guestName;
            this.guestPhone = guestPhone;
            this.guestEmail = guestEmail;
        }

        public String getGuestName() {
            return guestName;
        }
    }

    static class Booking {
        private final Guest guest;
        private final Room room;
        private final int numbersOfNights;
        private final String bookingRefNumber;
        private static int refCounter = 200;

        public Booking(Guest guest, Room room, int nights) {
            this.guest = guest;
            this.room = room;
            this.numbersOfNights = nights;
            this.bookingRefNumber = "RES" + refCounter++;
        }

        public String getBookingRefNumber() {
            return bookingRefNumber;
        }

        @Override
        public String toString() {
            return "Booking Reference Number: " + bookingRefNumber +
                    "\nGuest: " + guest.getGuestName() +
                    "\nRoom: " + room.getRoomType() +
                    "\nNights: " + numbersOfNights +
                    "\nTotal Price: " + (room.getPricePerNight() * numbersOfNights);
        }
    }

    static class Hotel {
        private final List<Room> rooms = new ArrayList<>();
        private final List<Booking> bookings = new ArrayList<>();

        public Hotel() {
            rooms.add(new Room(1, "Single", 100000));
            rooms.add(new Room(2, "Double", 150000));
            rooms.add(new Room(3, "Suite", 200000));
        }

        public void viewAvailableRooms() {
            System.out.println("Available rooms:");
            for (Room room : rooms) {
                if (room.isAvailable()) {
                    System.out.println(room);
                }
            }
        }

        public void bookRoom(String guestName, String guestPhone, String guestEmail, int nights, String roomType) {
            for (Room room : rooms) {
                if (room.isAvailable() && room.getRoomType().equalsIgnoreCase(roomType)) {
                    Guest guest = new Guest(guestName, guestPhone, guestEmail);
                    Booking booking = new Booking(guest, room, nights);
                    bookings.add(booking);
                    room.bookRoom();
                    System.out.println("Booking successful! Ref: " + booking.getBookingRefNumber());
                    return;
                }
            }
            System.out.println("No room available!");
        }

        public void cancelBooking(String bookingRefNumber) {
            for (Booking booking : bookings) {
                if (booking.getBookingRefNumber().equals(bookingRefNumber)) {
                    booking.room.cancelBooking();
                    bookings.remove(booking);
                    System.out.println("Booking canceled successfully! Ref: " + bookingRefNumber);
                    return;
                }
            }
            System.out.println("Reference number not found!");
        }
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Naija Comfort Inn!");
        boolean quit = false;

        while (!quit) {
            System.out.println("\nMENU:");
            System.out.println("1. View available rooms");
            System.out.println("2. Book room");
            System.out.println("3. Cancel booking");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    hotel.viewAvailableRooms();
                    break;
                case 2:
                    System.out.println("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter your phone number: ");
                    String phone = scanner.nextLine();
                    System.out.println("Enter your email: ");
                    String email = scanner.nextLine();
                    System.out.println("Select room type (Single/Double/Suite): ");
                    String roomType = scanner.nextLine();
                    System.out.println("Enter number of nights: ");
                    int nights = scanner.nextInt();
                    scanner.nextLine();
                    hotel.bookRoom(name, phone, email, nights, roomType);
                    break;
                case 3:
                    System.out.println("Enter your reference number: ");
                    String refNumber = scanner.nextLine();
                    hotel.cancelBooking(refNumber);
                    break;
                case 4:
                    quit = true;
                    System.out.println("Thank you for staying with us!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}
