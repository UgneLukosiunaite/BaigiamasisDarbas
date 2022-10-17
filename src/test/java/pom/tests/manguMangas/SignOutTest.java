package pom.tests.manguMangas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.manguMangas.SignOutPage;
import pom.tests.TestBase;

public class SignOutTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        SignOutPage.open("https://mangumangas.lt/");
    }

    @Test
    private void testSignOut() {
        SignOutPage.signIn();
        SignOutPage.sleep();
        SignOutPage.signOut();
        SignOutPage.sleep();
        String profileMenuBtnText = SignOutPage.getProfileMenuBtnText();

        Assert.assertEquals(profileMenuBtnText, "Prisijungti / Registruotis");
    }
}
