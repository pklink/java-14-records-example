package net.einself.records;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    public void testBreed() {
        final Dog underTest = new Dog("Poodle", "Bernie");
        Assertions.assertEquals("Poodle", underTest.breed());
    }

    @Test
    public void testName() {
        final Dog underTest = new Dog("Poodle", "Bernie");
        Assertions.assertEquals("Bernie", underTest.name());
    }

    @Test
    public void testToString() {
        final Dog underTest = new Dog("Poodle", "Bernie");
        assertEquals("Dog[breed=Poodle, name=Bernie]", underTest.toString());
    }

    @Test
    public void testIsEqual() {
        final Dog underTest = new Dog("Poodle", "Bernie");
        final Dog bernie = new Dog("Poodle", "Bernie");
        assertEquals(bernie, underTest);
    }

    @Test
    public void testIsNotEqual() {
        final Dog underTest = new Dog("Poodle", "Bernie");
        final Dog mrPeanutbutter = new Dog("Labrador Retriever", "Peanutbutter");
        assertNotEquals(mrPeanutbutter, underTest);
    }

    @Test
    public void testHashcode() {
        final Dog underTest = new Dog("Poodle", "Bernie");
        assertEquals(-1039379410, underTest.hashCode());
    }

    @Test
    public void testIsPoodle() {
        final Dog underTest = new Dog("Poodle", "Bernie");
        assertTrue(underTest.isPoodle());
    }

    @Test
    public void testIsNoPoodle() {
        final Dog underTest = new Dog("Labrador Retriever", "Peanutbutter");
        assertFalse(underTest.isPoodle());
    }

    @Test
    public void testDefaultBreedConstructor() {
        final Dog underTest = new Dog("Bernie");
        assertEquals("Poodle", underTest.breed());
    }

    @Test
    public void testWithoutBreed() {
        assertThrows(IllegalArgumentException.class, () ->
            new Dog(null, "Bernie")
        );
    }

    @Test
    public void testPeanutbutter() {
        final Dog underTest = new Dog("Labrador Retriever", "Peanutbutter");
        assertEquals("Mr. Peanutbutter", underTest.name());
    }







    @Test
    public void testIsFinal() throws NoSuchFieldException {
        assertTrue(Modifier.isFinal(Dog.class.getModifiers()));
        assertTrue(Modifier.isFinal(Dog.class.getDeclaredField("name").getModifiers()));
        assertTrue(Modifier.isFinal(Dog.class.getDeclaredField("breed").getModifiers()));
    }

}
