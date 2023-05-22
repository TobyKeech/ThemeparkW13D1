package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;

    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        visitor = new Visitor(24, 176.00, 1000.00);

        dodgems = new Dodgems("Bumper Cars", 5, visitor);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void getDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.0);
    }

    @Test
    public void canDoublePrice() {
        assertEquals(4.50, dodgems.priceFor(visitor), 0.0);
    }
}
