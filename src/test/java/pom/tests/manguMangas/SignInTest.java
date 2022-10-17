package pom.tests.manguMangas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.manguMangas.SignInPage;
import pom.tests.TestBase;

public class SignInTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        SignInPage.open("https://mangumangas.lt/");
    }

    @Test
    private void testSignIn() {
        SignInPage.clickOpenLoginPage();
        SignInPage.enterEmail("ul@gmail.com");
        SignInPage.enterPassword("myPassword");
        SignInPage.clickLogin();

        String signedInEmail = SignInPage.getSignedInUserEmail();

        Assert.assertEquals(signedInEmail, "ul@gmail.com");
    }


}
