package lab4.animals;

public class Mammal implements Animal {
    String name;

    public Mammal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                '}';
    }
}
