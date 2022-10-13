package lab4.animals;

public class Bird implements Animal {
    String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                '}';
    }
}
