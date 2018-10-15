import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    Manager manager;
    @Before
    public void before() {
        manager = new Manager("Bob", "Z0001JK", 100, "Managed Services");
    }

    @Test
    public void hasSalery() {
        assertEquals(100.0, manager.getSalary());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("Z0001JK", manager.getNiNumber());
    }

    @Test
    public void getName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(20);
        assertEquals(120.0, manager.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(1.0, manager.payBonus());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Managed Services", manager.getDeptName());
    }

    @Test
    public void cannotDecreaseSalary() {
        manager.raiseSalary(-20.0);
        assertEquals(100.0, manager.getSalary());
    }

    @Test
    public void canSetName() {
        manager.setName("Frank");
        assertEquals("Frank", manager.getName());
    }

    @Test
    public void cannotSetNameToNull() {
        manager.setName(null);
        assertEquals("Bob", manager.getName());
    }
}
