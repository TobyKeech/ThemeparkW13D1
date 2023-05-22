package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;

    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        visitor = new Visitor(25, 35.00, 68.00);
        playground = new Playground("Fun Zone", 7, visitor);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void visitorIsAllowed(){
        assertEquals(false, playground.isAllowedTo(visitor));
    }

}
