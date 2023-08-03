import Hotel.Room.Bedroom;
import Hotel.Room.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;


    @Before
    public void before() {
        bedroom = new Bedroom(RoomType.DOUBLE, 1);
    }


    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void doubleHasValue2() {
        assertEquals(2, bedroom.getCapacityFromEnum());
    }

    @Test
    public void hasRoomNumber() { assertEquals(1, bedroom.getRoomNumber());}
}