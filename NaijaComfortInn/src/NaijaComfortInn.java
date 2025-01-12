import java.util.*;

class Room {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    private boolean isAvailable;
    private boolean needsMaintenance;

    public Room(int roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true;
        this.needsMaintenance = false;
    }

    public void markAsOccupied() {
        this.isAvailable = false;
    }

    public void markAsAvailable() {
        this.isAvailable = true;
    }

    public void markAsUnderMaintenance() {
        this.needsMaintenance = true;
        this.isAvailable = false;
    }

    public boolean isAvailable() {
        return isAvailable && !needsMaintenance;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {
        return "Room Number: " + roomNumber + " | Type: " + roomType + " | Price: " + pricePerNight;
    }
}

class Guest {
    private String name;
    private String phoneNumber;
    private String email;
    private String bookingReference;

    public Guest(String name, String phoneNumber, String email, String bookingReference) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.bookingReference = bookingReference;
    }

    public String getDetails() {
        return "Name: " + name + " | Phone: " + phoneNumber + " | Email: " + email + " | Booking Reference: " + bookingReference;
    }

    public String getBookingReference() {
        return bookingReference;
    }
}

class Booking {
    public Guest guest;
    protected Room room;
    private Date checkInDate;
    private Date checkOutDate;
    private double totalPayment;

    public Booking(Guest guest, Room room, Date checkInDate, Date checkOutDate, double totalPayment) {
        this.guest = guest;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalPayment = totalPayment;
    }

    public double calculatePayment(int days, boolean festivePeriod, double multiplier) {
        double baseCost = room.getPricePerNight() * days;
        return festivePeriod ? baseCost * multiplier : baseCost;
    }

    public void cancelBooking() {
        room.markAsAvailable();
    }

    @Override
    public String toString() {
        return "Guest: " + guest.getDetails() + "\nRoom: " + room + "\nCheck-in: " + checkInDate + " | Check-out: " + checkOutDate + "\nTotal Payment: " + totalPayment;
    }
}

class HotelSystem {
    private List<Room> rooms = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();
    private List<String> admins = new ArrayList<>();
    private double festivePeriodMultiplier = 1.2;

    public void initializeRooms() {
        rooms.add(new Room(101, "Single", 10000));
        rooms.add(new Room(102, "Double", 15000));
        rooms.add(new Room(103, "Suite", 25000));
    }

    public void bookRoom(String name, String phone, String email, String roomType, int nights, boolean festivePeriod) {
        for (Room room : rooms) {
            if (room.isAvailable() && room.getRoomType().equalsIgnoreCase(roomType)) {
                String bookingReference = "RES" + (bookings.size() + 1000);
                Guest guest = new Guest(name, phone, email, bookingReference);
                double totalPayment = room.getPricePerNight() * nights;
                if (festivePeriod) {
                    totalPayment *= festivePeriodMultiplier;
                }
                Booking booking = new Booking(guest, room, new Date(), new Date(), totalPayment);
                bookings.add(booking);
                room.markAsOccupied();
                System.out.println("Booking Successful!\n" + booking);
                return;
            }
        }
        System.out.println("No available rooms of type " + roomType);
    }

    public void cancelBooking(String bookingReference) {
        for (Iterator<Booking> iterator = bookings.iterator(); iterator.hasNext(); ) {
            Booking booking = iterator.next();
            if (booking.guest.getBookingReference().equals(bookingReference)) {
                booking.cancelBooking();
                iterator.remove();
                System.out.println("Booking canceled successfully. Room is now available.");
                return;
            }
        }
        System.out.println("Booking reference not found.");
    }

    public void viewAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println(room);
            }
        }
    }

    public void manageGuestDetails(int roomNumber) {
        for (Booking booking : bookings) {
            if (booking.room.getRoomNumber() == roomNumber) {
                System.out.println(booking);
                return;
            }
        }
        System.out.println("No guest found for room number " + roomNumber);
    }

}

public class NaijaComfortInn {
    public static void main(String[] args) {
        HotelSystem hotelSystem = new HotelSystem();
        hotelSystem.initializeRooms();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Book Room");
            System.out.println("2. View Available Rooms");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Manage Guest Details");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your phone number: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter your email: ");
                    String email = scanner.nextLine();
                    System.out.print("Select room type (Single/Double/Suite): ");
                    String roomType = scanner.nextLine();
                    System.out.print("Enter number of nights: ");
                    int nights = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Is it a festive period? (true/false): ");
                    boolean festivePeriod = scanner.nextBoolean();
                    hotelSystem.bookRoom(name, phone, email, roomType, nights, festivePeriod);
                    break;
                case 2:
                    hotelSystem.viewAvailableRooms();
                    break;
                case 3:
                    System.out.print("Enter booking reference: ");
                    String bookingRef = scanner.nextLine();
                    hotelSystem.cancelBooking(bookingRef);
                    break;
                case 4:
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine();
                    hotelSystem.manageGuestDetails(roomNumber);
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for using Naija Comfort Inn!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
