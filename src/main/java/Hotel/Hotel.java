package Hotel;

import Hotel.Room.Bedroom;
import Hotel.Room.ConferenceRoom;
import Hotel.Room.Room;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public int bedroomCount(){
        return this.bedrooms.size();
    }

    public int conferenceCount(){
        return this.conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom){
        bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        conferenceRooms.add(conferenceRoom);
    }



}
