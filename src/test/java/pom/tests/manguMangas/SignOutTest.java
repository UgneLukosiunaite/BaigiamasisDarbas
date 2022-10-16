package pom.tests.manguMangas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.manguMangas.RegistrationPage;
import pom.pages.manguMangas.SignInPage;
import pom.pages.manguMangas.SignOutPage;
import pom.tests.TestBase;

public class SignOutTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        RegistrationPage.open("https://mangumangas.lt/");
    }

    @Test
    private void testSignOut() {
        SignInPage.signIn();
        SignOutPage.sleep();
        SignOutPage.signOut();
        SignOutPage.sleep();
        String profileMenuBtnText = SignOutPage.getProfileMenuBtnText();

        Assert.assertEquals(profileMenuBtnText, "Prisijungti / Registruotis");
    }
}
