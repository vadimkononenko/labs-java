package lab4.enclosures;

import lab4.animals.Animal;
import lab4.animals.Ungulates;

import java.util.ArrayList;
import java.util.List;

public class UngulatesEnclosure extends MammalEnclosure {

    private final List<Ungulates> ungulates;

    public UngulatesEnclosure(int capacity) {
        super(capacity);
        ungulates = new ArrayList<>(capacity);
    }

    @Override
    public void addAnimal(Animal animal) {
        if (!(animal instanceof Ungulates))
            throw new IllegalStateException();
        if (getOccupiedPlaces() == getCapacity())
            throw new IndexOutOfBoundsException();
        ungulates.add((Ungulates) animal);
    }

    @Override
    public void removeAnimal(Animal animal) {
        if (!(animal instanceof Ungulates))
            throw new IllegalStateException();
        if (!ungulates.contains(animal))
            throw new NullPointerException();
        ungulates.remove(animal);
    }

    @Override
    public int getOccupiedPlaces() {
        return ungulates.size();
    }

    public void showUngulates() {
        ungulates.forEach(System.out::println);
    }

}
