package lab4.animals;

public class Zebra extends Ungulates {
    public Zebra(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Zebra{" +
                "name='" + name + '\'' +
                '}';
    }
}
