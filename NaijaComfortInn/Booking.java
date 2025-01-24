package NaijaComfortInn;
import java.time.LocalDate;

public class Booking {

    private String fullName;
    private String phoneNumber;
    private String emailAddress;
    private int numOfGuests;
    private String roomNumber;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public Booking(String fullName, String phoneNumber, String emailAddress, int numOfGuests, String roomNumber, LocalDate checkInDate, LocalDate checkOutDate) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.numOfGuests = numOfGuests;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getFullName() {
        return fullName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public int getNumOfGuests() {
        return numOfGuests;
    }
    public String getRoomNumber() {
        return roomNumber;
    }
    public LocalDate getCheckInDate() {
        return checkInDate;
    }
    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

}