package pom.tests.manguMangas;

import org.testng.Assert;
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

    @Test
    private void testInvalidEmailFails() {
        RegistrationPage.clickOpenLoginPage();
        RegistrationPage.clickRegister();
        RegistrationPage.enterFullName("Jonas Jonaitis");
        RegistrationPage.enterEmail("not valid");
        RegistrationPage.enterPhoneNumber("+37067771133");
        RegistrationPage.enterPassword("myPassword");
        RegistrationPage.enterPassword2("myPassword");
        RegistrationPage.clickAgreeTerms();
        RegistrationPage.submitRegistration();

        String invalidEmailText = RegistrationPage.getInvalidEmailText();

        Assert.assertEquals(invalidEmailText, "Neteisingas el. pašto adresas");
    }

    @Test
    private void testInvalidPhoneFails() {
        RegistrationPage.clickOpenLoginPage();
        RegistrationPage.clickRegister();
        RegistrationPage.enterFullName("Julius Jonaitis");
        RegistrationPage.enterEmail("ul@gmail.com");
        RegistrationPage.enterPhoneNumber("-11111");
        RegistrationPage.enterPassword("myPassword");
        RegistrationPage.enterPassword2("myPassword");
        RegistrationPage.clickAgreeTerms();
        RegistrationPage.submitRegistration();

        String invalidPhoneNumberText = RegistrationPage.getInvalidPhoneNumberText();

        Assert.assertEquals(invalidPhoneNumberText, "Neteisingas telefono numeris");
    }
}