import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin dbAdmin;
    @Before
    public void before() {
        dbAdmin = new DatabaseAdmin("Bob", "Z0001JK", 100);
    }

    @Test
    public void hasSalery() {
        assertEquals(100.0, dbAdmin.getSalary());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("Z0001JK", dbAdmin.getNiNumber());
    }

    @Test
    public void getName() {
        assertEquals("Bob", dbAdmin.getName());
    }

    @Test
    public void canRaiseSalary() {
        dbAdmin.raiseSalary(20);
        assertEquals(120.0, dbAdmin.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(1.0, dbAdmin.payBonus());
    }
}
