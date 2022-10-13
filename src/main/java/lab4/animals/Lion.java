package lab4.animals;

public class Lion extends Mammal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                '}';
    }
}
