import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Rachel", 12345, 40000, "BOD", 1000000);
    }

    @Test
    public void canGetName(){
        assertEquals("Rachel", director.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(12345, director.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("BOD", director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(1000000, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(director.getSalary());
        assertEquals(48000, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        director.payBonus(director.getSalary());
        assertEquals(400, director.bonus, 0.01);
    }
}
