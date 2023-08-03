import Hotel.Room.ConferenceRoom;
import Hotel.Room.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){ conferenceRoom = new ConferenceRoom(RoomType.CONFERENCEROOM, 2, "Conference Room 1");}

    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.CONFERENCEROOM, conferenceRoom.getRoomType());
    }

    @Test
    public void conferenceRoomHasValue10() {
        assertEquals(10, conferenceRoom.getCapacityFromEnum());
    }

    @Test
    public void hasRoomNumber() { assertEquals(2, conferenceRoom.getRoomNumber());}

    @Test
    public void hasName() { assertEquals("Conference Room 1", conferenceRoom.getName());}
}
