package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        visitor = new Visitor(30, 180.00, 60.00);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 6, visitor);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canBuyTobacco(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void hasRating(){
        assertEquals(6, tobaccoStall.getRating());
    }
}
