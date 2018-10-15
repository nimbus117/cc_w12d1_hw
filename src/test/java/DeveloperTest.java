import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {

    Developer developer;
    @Before
    public void before() {
        developer = new Developer("Bob", "Z0001JK", 100);
    }

    @Test
    public void hasSalery() {
        assertEquals(100.0, developer.getSalary());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("Z0001JK", developer.getNiNumber());
    }

    @Test
    public void getName() {
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(20);
        assertEquals(120.0, developer.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(1.0, developer.payBonus());
    }
}
