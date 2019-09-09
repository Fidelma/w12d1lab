import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {


    Director director;

    @Before
    public void setUp(){
        director = new Director("Bob", "bs67dfasas", 40000.00, "sales", 500000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", director.getName());
    }


    @Test
    public void canGetNI() {
        assertEquals("bs67dfasas", director.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(40000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDepartment() {
        assertEquals("sales", director.getDepartment());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1000.00);
        assertEquals(41000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(800.00, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget() {
        assertEquals(500000.00, director.getBudget(), 0.01);
    }


}
