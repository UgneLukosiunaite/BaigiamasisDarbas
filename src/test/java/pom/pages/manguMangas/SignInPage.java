package pom.pages.manguMangas;

import pom.pages.Common;
import pom.pages.Locators;
import pom.tests.TestBase;

public class SignInPage extends TestBase {
    public static void enterEmail(String text) {
        Common.sendKeysToElement(
                text,
                Locators.ManguMangas.SignInPage.emailInput
        );
    }

    public static void enterPassword(String text) {
        Common.sendKeysToElement(
                text,
                Locators.ManguMangas.SignInPage.passwordInput
        );
    }

    public static void clickOpenLoginPage() {
        Common.clickElement(
                Locators.ManguMangas.MainPage.buttonLogInPage
        );
    }

    public static void clickLogin() {
        Common.clickElement(
                Locators.ManguMangas.SignInPage.logInBtn
        );
    }


}
