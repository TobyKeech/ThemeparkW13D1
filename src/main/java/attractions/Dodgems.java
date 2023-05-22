package attractions;

import behaviours.ITicketed;
import people.Visitor;


public class Dodgems extends Attraction implements ITicketed {

    Visitor visitor;

    public Dodgems(String name, int rating, Visitor visitor) {
        super(name, rating);
        this.visitor = visitor;

    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getAge() < 12){
            return 2.25;
        }
        return 4.50;
    }
}
