package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed, ISecurity, IReviewed {

    Visitor visitor;

    public RollerCoaster(String name, int rating, Visitor visitor) {
        super(name, rating);
        this.visitor = visitor;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() > 200){
            return 16.80;
        }
        return 8.40;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() > 145 && visitor.getAge() > 12) {
            return true;
        }
        return false;
    }
}
