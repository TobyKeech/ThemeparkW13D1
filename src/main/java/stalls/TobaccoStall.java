package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    Visitor visitor;

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating, Visitor visitor) {
        super(name, ownerName, parkingSpot, rating);
        this.visitor = visitor;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 18) {
            return false;
        }
        return true;
    }

}
