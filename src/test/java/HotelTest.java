import Hotel.Room.Bedroom;
import Hotel.Room.ConferenceRoom;
import Hotel.Room.RoomType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import Hotel.Hotel;
import Hotel.Room.Room;
import Hotel.Guest;
import Hotel.Room.Bedroom;
public class HotelTest
{
    private Hotel hotel;
    private ConferenceRoom conferenceRoom;

    private Bedroom bedroom;
    private Guest guestOne;


    @Before
    public void before(){
        hotel = new Hotel();
        guestOne = new Guest("Boaby");
        bedroom.addGuest(guestOne);
        hotel.addConferenceRoom(conferenceRoom);
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCEROOM, 2, "One");
        bedroom = new Bedroom(RoomType.DOUBLE, 3);
    }

    @Test
    public void hotelHasBedrooms(){
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom);
        assertEquals(2,hotel.bedroomCount());
    }

    @Test
    public void hotelHasConferenceRooms(){
        assertEquals(1, hotel.conferenceCount());
    }

    @Test
    public void hotelCanAddBedrooms(){
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom);
        assertEquals(2, hotel.bedroomCount());
    }

    @Test
    public void hotelCanAddConferenceRooms(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(2, hotel.conferenceCount());
    }

    @Test
    public void hotelCanAddGuestToBedroom(){
        bedroom.addGuest(guestOne);
        assertEquals(2, bedroom.getGuestCount());
    }

    @Test
    public void hotelCanAddGuestToConference(){
        conferenceRoom.addGuest(guestOne);
        assertEquals(1, hotel.conferenceCount());
    }

    @Test
    public void hotelCanRemoveGuestFromBedroom(){
        bedroom.addGuest(guestOne);
        bedroom.removeGuest();
        assertEquals(0,bedroom.getGuestCount());
    }
}