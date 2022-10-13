package lab4.enclosures;

import lab4.animals.Animal;
import lab4.animals.Bird;

import java.util.ArrayList;
import java.util.List;

public class BirdsEnclosure extends Enclosure{

    private final List<Bird> birds;

    public BirdsEnclosure(int capacity) {
        super(capacity);
        birds = new ArrayList<>(capacity);
    }

    @Override
    public void addAnimal(Animal animal) {
        if (!(animal instanceof Bird))
            throw new IllegalStateException();
        if (getOccupiedPlaces() == getCapacity())
            throw new IndexOutOfBoundsException();
        birds.add((Bird) animal);
    }

    @Override
    public void removeAnimal(Animal animal) {
        if (!(animal instanceof Bird))
            throw new IllegalStateException();
        if (!birds.contains(animal))
            throw new NullPointerException();
        birds.remove(animal);
    }

    @Override
    public int getOccupiedPlaces() {
        return birds.size();
    }

    public void showBirds() {
        birds.forEach(System.out::println);
    }

    //    public void addBird(Bird bird) {
//        if (getOccupiedPlaces() == getCapacity())
//            throw new IndexOutOfBoundsException();
//        birds.add(bird);
//    }

//    public void removeBird(Bird bird) {
//        if (!birds.contains(bird))
//            throw new NullPointerException();
//        birds.remove(bird);
//    }

//    public int getOccupiedPlaces() {
//        return birds.size();
//    }
}
