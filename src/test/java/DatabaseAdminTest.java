import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin dba;

    @Before
    public void before(){
        dba = new DatabaseAdmin("Alex", 56743, 29000);
    }

    @Test
    public void canGetName(){
        assertEquals("Alex", dba.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(56743, dba.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(29000, dba.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        dba.raiseSalary(dba.getSalary());
        assertEquals(34800, dba.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        dba.payBonus(dba.getSalary());
        assertEquals(290, dba.bonus, 0.01);
    }
}
