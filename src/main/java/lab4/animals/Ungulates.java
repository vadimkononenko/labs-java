package lab4.animals;

public class Ungulates extends Mammal {
    public Ungulates(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Ungulates{" +
                "name='" + name + '\'' +
                '}';
    }
}
