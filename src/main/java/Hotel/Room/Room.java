package Hotel.Room;

import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {
    private RoomType roomType;
    private ArrayList<Guest> guests;

    public Room(RoomType roomType){
        this.roomType = roomType;
        this.guests = new ArrayList<Guest>();

    }

    public RoomType getRoomType(){
        return this.roomType;
    }

    public int getGuestCount(){
        return guests.size();
    }

    public int getCapacityFromEnum(){
        return this.roomType.getCapacity();
    }

    public void addGuest(Guest guest){
      this.guests.add(guest);
    }

    public void removeGuest(){
        guests.clear();
    }
}
