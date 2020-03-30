import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;


    @Before
    public void before(){
        developer = new Developer("Him", "AB1234AC", 100.00);
    }

    @Test
    public void hasSalary(){
        assertEquals(100.00, developer.getSalary(), 0.01);
    }

    @Test
    public void raiseWorks(){
        developer.raiseSalary(10.00);
        assertEquals(110.00, developer.getSalary(), 0.01);

    }

    @Test
    public void payBonusWorks(){
        assertEquals(1, developer.payBonus(), 0.01);
    }

}
