package lab4.animals;

public class Giraffe extends Ungulates {
    public Giraffe(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Giraffe{" +
                "name='" + name + '\'' +
                '}';
    }
}
