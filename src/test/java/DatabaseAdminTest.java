import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {


    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Bob", "bs67dfasas", 40000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", databaseAdmin.getName());
    }


    @Test
    public void canGetNI() {
        assertEquals("bs67dfasas", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(40000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(41000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400.00, databaseAdmin.payBonus(), 0.01);
    }
}
