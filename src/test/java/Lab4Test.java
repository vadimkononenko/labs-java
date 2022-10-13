import lab4.Zoo;
import lab4.animals.Eagle;
import lab4.animals.Giraffe;
import lab4.animals.Lion;
import lab4.animals.Zebra;
import lab4.enclosures.BirdsEnclosure;
import lab4.enclosures.LionEnclosure;
import lab4.enclosures.UngulatesEnclosure;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lab4Test {

    Zoo zoo;
    LionEnclosure lionEnclosure;
    BirdsEnclosure birdsEnclosure;
    UngulatesEnclosure ungulatesEnclosure;
    Lion lion1;
    Eagle eagle1, eagle2;
    Giraffe giraffe1;
    Zebra zebra1, zebra2;

    @Before
    public void setUp() {
        zoo = new Zoo();
        lionEnclosure = new LionEnclosure(1);
        birdsEnclosure = new BirdsEnclosure(2);
        ungulatesEnclosure = new UngulatesEnclosure(3);

        lion1 = new Lion("lion1");

        eagle1 = new Eagle("eagle1");
        eagle2 = new Eagle("eagle2");

        giraffe1 = new Giraffe("giraffe1");
        zebra1 = new Zebra("zebra1");
        zebra2 = new Zebra("zebra2");

        addAnimalsToZoo();
    }

    @After
    public void tearDown() {
        zoo = null;
        lionEnclosure = null;
        birdsEnclosure = null;
        ungulatesEnclosure = null;
    }

    @Test
    public void shouldFillUpEnclosuresCorrectly() {
        Assert.assertEquals(3, zoo.getEnclosures().size());
    }

    @Test
    public void shouldReturnExactCountOfAnimalsInZoo() {
        Assert.assertEquals(6, zoo.getCountOfAnimals());
    }

    @Test
    public void shouldRemoveAnimalCorrectly() {
        lionEnclosure.removeAnimal(lion1);
        Assert.assertEquals(0, lionEnclosure.getOccupiedPlaces());
    }

    @Test
    public void shouldThrowExceptionDeletingAnotherTypeAnimal() {
        Assert.assertThrows(IllegalStateException.class, () -> {
            lionEnclosure.removeAnimal(zebra1);
        });
    }

    @Test
    public void shouldThrowExceptionDeletingNotExistingTypedAnimal() {
        Lion lion = new Lion("testLion");
        Assert.assertThrows(NullPointerException.class, () -> {
            lionEnclosure.removeAnimal(lion);
        });
    }

    @Test
    public void shouldThrowExceptionAddingExtraAnimal() {
        Lion lion = new Lion("testLion");
        Assert.assertThrows(IndexOutOfBoundsException.class, () -> {
            lionEnclosure.addAnimal(lion);
        });
    }

    private void addAnimalsToZoo() {
        lionEnclosure.addAnimal(lion1);

        birdsEnclosure.addAnimal(eagle1);
        birdsEnclosure.addAnimal(eagle2);

        ungulatesEnclosure.addAnimal(giraffe1);
        ungulatesEnclosure.addAnimal(zebra1);
        ungulatesEnclosure.addAnimal(zebra2);

        zoo.addEnclosure(lionEnclosure);
        zoo.addEnclosure(birdsEnclosure);
        zoo.addEnclosure(ungulatesEnclosure);
    }

}
