import techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;


    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("You", "AD1234AB", 100.00);
    }

    @Test
    public void hasSalary(){
        assertEquals(100.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void raiseWorks(){
        databaseAdmin.raiseSalary(10.00);
        assertEquals(110.00, databaseAdmin.getSalary(), 0.01);

    }

    @Test
    public void payBonusWorks(){
        assertEquals(1, databaseAdmin.payBonus(), 0.01);
    }


}
