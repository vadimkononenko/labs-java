package lab4;

import lab4.enclosures.Enclosure;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public final List<Enclosure> enclosures = new ArrayList<>();

    public int getCountOfAnimals() {
        int count = 0;
        for (Enclosure e: enclosures) {
            count += e.getOccupiedPlaces();
        }

        return count;
    }

    public void addEnclosure(Enclosure enclosure){
        enclosures.add(enclosure);
    }

    public Enclosure getEnclosure(int index) {
        return enclosures.get(index);
    }

    public List<Enclosure> getEnclosures() {
        return enclosures;
    }

}
