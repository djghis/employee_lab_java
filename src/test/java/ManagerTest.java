
import management.Manager;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ManagerTest {


        Manager manager;

        @Before
        public void before(){
            manager = new Manager("Me", "AB1234AB", 100.00, "Account");
        }

        @Test
        public void hasSalary(){
            assertEquals(100.00, manager.getSalary(), 0.01);
        }

        @Test
        public void raiseWorks(){
            manager.raiseSalary(10.00);
            assertEquals(110.00, manager.getSalary(), 0.01);

        }

        @Test
        public void payBonusWorks(){
            assertEquals(1, manager.payBonus(), 0.01);
        }

        @Test
        public void hasDeptName(){
            assertEquals("Account", manager.getDeptName());
        }

}


