package pom.tests.manguMangas;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.manguMangas.RegistrationPage;
import pom.pages.manguMangas.SignInPage;
import pom.tests.TestBase;

public class SignInTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        RegistrationPage.open("https://mangumangas.lt/");
    }

    @Test
    private void testSignIn() {
        SignInPage.clickOpenLoginPage();
        SignInPage.enterEmail("ul@gmail.com");
        SignInPage.enterPassword("myPassword");
        SignInPage.clickLogin();
    }


}
