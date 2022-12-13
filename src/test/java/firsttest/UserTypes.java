package firsttest;

import com.selenium.First;
import org.testng.annotations.*;

public class UserTypes {
    First first = new First();

    @Test(priority = 0)
    public void loginAsAdmin(){
        first.adminLogin();
    }
    @Test(priority = 2)
    public void loginAsManager(){
        first.managerLogin();
    }
    @Test(priority = 3)
    public void loginAsTeacher(){
        first.teacherLogin();
    }
    @Test(priority = 1)
    public void loginAsStudent(){
        first.studentLogin();
    }

    @BeforeMethod
    public void setUp(){
        first.startSession();
    }

    @AfterMethod
    public void tearDown(){
        first.terminateSession();
    }
}
