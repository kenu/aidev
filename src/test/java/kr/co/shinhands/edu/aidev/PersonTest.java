package kr.co.shinhands.edu.aidev;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class PersonTest {

    @Test
    public void testPersonCreation() {
        Person person = new Person("John Doe", 30);
        assertNotNull(person);
        assertEquals("John Doe", person.getName());
        assertEquals(30, person.getAge());
    }

    @Test
    public void testPersonAgeIncrement() {
        Person person = new Person("Jane Doe", 25);
        person.incrementAge();
        assertEquals(26, person.getAge());
    }

    @Test
    public void testPersonNameChange() {
        Person person = new Person("Bob Smith", 40);
        person.setName("Robert Smith");
        assertEquals("Robert Smith", person.getName());
    }

    @Test
    public void testPersonAgeValidation() {
        assertThrows(IllegalArgumentException.class, () -> new Person("Invalid", -1));
    }

    @Test
    public void testPersonToString() {
        Person person = new Person("Alice Johnson", 35);
        assertEquals("Person {name='Alice Johnson', age=35}", person.toString());
    }
}

