import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Melinda", "AB5678BA", 5000.00, "Management", 120000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Melinda", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("AB5678BA", director.getNiMNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(5000.00, director.getSalary(), 0.00);
    }

    @Test
    public void hasDeptname(){
        assertEquals("Management", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(120000.00, director.getBudget(), 0.00);
    }

    @Test
    public void raiseWorks(){
        director.raiseSalary(2000.00);
        assertEquals(7000.00, director.getSalary(), 0.00);
    }

    @Test
    public void raiseCantBeNegative(){
        director.raiseSalary(-100.00);
        assertEquals(5000.00, director.getSalary(), 0.00);
    }

    @Test
    public void raiseCantBe0(){
        director.raiseSalary(0.00);
        assertEquals(5000.00, director.getSalary(), 0.00);
    }

    @Test
    public void payBonusWorks(){
        director.payBonus();
        assertEquals(100.00, director.payBonus(), 0.00);
    }

}
