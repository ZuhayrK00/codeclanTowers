package Hotel.Room;

public class ConferenceRoom extends Room{

    private int roomNumber;
    private String name;
    public ConferenceRoom(RoomType roomType, int roomNumber, String name) {
        super(roomType);
        this.roomNumber = roomNumber;
        this.name = name;
    }

    public int getRoomNumber() { return roomNumber; }

    public String getName() { return name; }
}
