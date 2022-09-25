package lab4.enclosures;

import java.util.ArrayList;
import java.util.List;

public class MammalEnclosure extends Enclosure {

    private int capacity;
    private List<MammalEnclosure> mammalEnclosures;

    public MammalEnclosure() {
        this.capacity = 20;
        this.mammalEnclosures = new ArrayList<>();
    }

    @Override
    public int getEnclosureCapacity() {
        return capacity;
    }

    @Override
    public int getOccupiedEnclosures() {
        return 0;
    }

}
