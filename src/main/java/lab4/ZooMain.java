package lab4;

import lab4.animals.Eagle;
import lab4.animals.Giraffe;
import lab4.animals.Lion;
import lab4.animals.Zebra;
import lab4.enclosures.BirdsEnclosure;
import lab4.enclosures.LionEnclosure;
import lab4.enclosures.UngulatesEnclosure;

public class ZooMain {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion lion1 = new Lion("l1");
        Lion lion2 = new Lion("l2");
        Lion lion3 = new Lion("l3");
        Lion lion4 = new Lion("l4");

        Eagle eagle1 = new Eagle("e1");
        Eagle eagle2 = new Eagle("e2");
        Eagle eagle3 = new Eagle("e3");

        Zebra zebra1 = new Zebra("z1");
        Zebra zebra2 = new Zebra("z2");

        Giraffe giraffe1 = new Giraffe("g1");
        Giraffe giraffe2 = new Giraffe("g2");

        LionEnclosure lionEnclosure = new LionEnclosure(4);
        lionEnclosure.addAnimal(lion1);
        lionEnclosure.addAnimal(lion2);
        lionEnclosure.addAnimal(lion3);
        lionEnclosure.addAnimal(lion4);

        BirdsEnclosure birdsEnclosure = new BirdsEnclosure(3);
        birdsEnclosure.addAnimal(eagle1);
        birdsEnclosure.addAnimal(eagle2);
        birdsEnclosure.addAnimal(eagle3);

        UngulatesEnclosure ungulatesEnclosure = new UngulatesEnclosure(4);
        ungulatesEnclosure.addAnimal(zebra1);
        ungulatesEnclosure.addAnimal(zebra2);
        ungulatesEnclosure.addAnimal(giraffe1);
        ungulatesEnclosure.addAnimal(giraffe2);

        zoo.addEnclosure(birdsEnclosure);
        zoo.addEnclosure(lionEnclosure);
        zoo.addEnclosure(ungulatesEnclosure);

        System.out.println("--------------------");

        zoo.getEnclosures().forEach(System.out::println);

        System.out.println("--------------------");

        ungulatesEnclosure.showUngulates();

        System.out.println("--------------------");

        lionEnclosure.showLions();

        System.out.println("--------------------");

        birdsEnclosure.showBirds();

        System.out.println("\nAfter removing:\n");

        zoo.getEnclosure(0).removeAnimal(eagle2);

        birdsEnclosure.showBirds();

        System.out.println("--------------------");

        System.out.println(zoo.getCountOfAnimals());
    }
}
