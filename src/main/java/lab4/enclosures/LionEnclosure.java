package lab4.enclosures;

import lab4.animals.Animal;
import lab4.animals.Lion;

import java.util.ArrayList;
import java.util.List;

public class LionEnclosure extends MammalEnclosure {

    private final List<Lion> lions;

    public LionEnclosure(int capacity) {
        super(capacity);
        lions = new ArrayList<>(capacity);
    }

    @Override
    public void addAnimal(Animal animal) {
        if (!(animal instanceof Lion))
            throw new IllegalStateException();
        if (getOccupiedPlaces() == getCapacity())
            throw new IndexOutOfBoundsException();
        lions.add((Lion) animal);
    }

    @Override
    public void removeAnimal(Animal animal) {
        if (!(animal instanceof Lion))
            throw new IllegalStateException();
        if (!lions.contains(animal))
            throw new NullPointerException();
        lions.remove(animal);
    }

    @Override
    public int getOccupiedPlaces() {
        return lions.size();
    }

    public void showLions() {
        lions.forEach(System.out::println);
    }

}

