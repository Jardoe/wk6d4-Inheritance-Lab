import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jussi", 23424, 32000.00, "IT");
    }

    @Test
    public void getName(){
        assertEquals("Jussi", manager.getName());
    }

    @Test
    public void getNI(){
        assertEquals(23424, manager.getNI());
    }

    @Test
    public void getSalary(){
        assertEquals(32000.00, manager.getSalary(),0.01);
    }

    @Test
    public void getDeptName(){
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(manager.getSalary());
        assertEquals(38400, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        manager.payBonus(manager.getSalary());
        assertEquals(320, manager.bonus, 0.01 );
    }


}
