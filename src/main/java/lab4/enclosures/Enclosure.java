package lab4.enclosures;

import lab4.animals.Animal;

public abstract class Enclosure {

    final int capacity;

    public Enclosure(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public abstract int getOccupiedPlaces();

    public abstract void addAnimal(Animal animal);

    public abstract void removeAnimal(Animal animal);

    @Override
    public String toString() {
        return "Enclosure{" +
                "capacity=" + capacity +
                '}';
    }

}
