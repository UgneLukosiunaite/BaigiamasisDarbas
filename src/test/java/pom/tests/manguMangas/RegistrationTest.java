package pom.tests.manguMangas;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.manguMangas.RegistrationPage;
import pom.tests.TestBase;

public class RegistrationTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        RegistrationPage.open("https://mangumangas.lt/");
    }

    @Test
    private void testSuccessfulRegistration() {
        RegistrationPage.clickOpenLoginPage();
        RegistrationPage.clickRegister();
        RegistrationPage.enterFullName("Saule Sauliene");
        RegistrationPage.enterEmail("ul@gmail.com");
        RegistrationPage.enterPhoneNumber("+37067772133");
        RegistrationPage.enterPassword("myPassword");
        RegistrationPage.enterPassword2("myPassword");
        RegistrationPage.clickAgreeTerms();
        RegistrationPage.submitRegistration();
    }

}