import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("David", 24238, 25000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("David", developer.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(24238, developer.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(developer.getSalary());
        assertEquals(30000, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        developer.payBonus(developer.getSalary());
        assertEquals(250, developer.bonus, 0.01);
    }
}
