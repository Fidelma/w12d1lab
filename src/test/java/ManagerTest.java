import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Bob", "bs67dfasas", 40000.00, "sales");
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", manager.getName());
    }


    @Test
    public void canGetNI() {
        assertEquals("bs67dfasas", manager.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(40000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDepartment() {
        assertEquals("sales", manager.getDepartment());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000.00);
        assertEquals(41000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400.00, manager.payBonus(), 0.01);
    }
}
