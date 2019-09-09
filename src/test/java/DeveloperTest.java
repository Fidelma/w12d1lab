import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Bob", "bs67dfasas", 40000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", developer.getName());
    }


    @Test
    public void canGetNI() {
        assertEquals("bs67dfasas", developer.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(40000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000.00);
        assertEquals(41000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400.00, developer.payBonus(), 0.01);
    }
}
