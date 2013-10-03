package dk.kyuff.service.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * User: swi
 * Date: 03/10/13
 * Time: 20.25
 */
public class PersonTest {

    @Test
    public void testGetFullName() throws Exception {
        Person person = new Person();

        person.setFirstName("Per");
        person.setLastName("Hansen");
        assertEquals("Per Hansen", person.getFullName());

        person.setFirstName("Kaj");
        person.setLastName(null);
        assertEquals("Kaj", person.getFullName());

        person.setFirstName("Erik");
        person.setLastName("");
        assertEquals("Erik", person.getFullName());
    }

    @Test
    public void testSetFullName() throws Exception {

        Person person = new Person();

        person.setFullName("Per Hansen");
        assertEquals("Per", person.getFirstName());
        assertEquals("Hansen", person.getLastName());

        person.setFullName("Per");
        assertEquals("Per", person.getFirstName());
        assertEquals("", person.getLastName());

        person.setFullName(null);
        assertEquals("", person.getFirstName());
        assertEquals("", person.getLastName());

    }
}
