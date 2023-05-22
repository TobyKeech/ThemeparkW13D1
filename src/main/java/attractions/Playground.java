package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;


public class Playground extends Attraction implements ISecurity, IReviewed {

    Visitor visitor;

    public Playground(String name, int rating, Visitor visitor) {
        super(name, rating);
        this.visitor = visitor;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 15) {
            return false;
        }
        return true;
    }
}
