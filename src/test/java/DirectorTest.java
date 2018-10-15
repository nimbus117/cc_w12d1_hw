import management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {

    Director director;
    @Before
    public void before() {
        director = new Director("Bob", "Z0001JK", 100, "Managed Services", 500);
    }

    @Test
    public void hasSalery() {
        assertEquals(100.0, director.getSalary());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("Z0001JK", director.getNiNumber());
    }

    @Test
    public void getName() {
        assertEquals("Bob", director.getName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(20);
        assertEquals(120.0, director.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(2.0, director.payBonus());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Managed Services", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(500.0, director.getBudget());
    }
}
