package Hotel.Room;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    CONFERENCEROOM(10);

    private final int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

}


