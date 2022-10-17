package pom.pages.manguMangas;
import pom.pages.Common;
import pom.pages.Locators;

public class SignOutPage {

   public static void signOut(){
       Common.clickElement(Locators.ManguMangas.SignOutPage.profileMenuBtn);
       Common.clickElement(Locators.ManguMangas.SignOutPage.logOutBtn);
   }

    public static String getProfileMenuBtnText(){
        return Common.getElementText(Locators.ManguMangas.MainPage.buttonLogInPage);
    }

    public static void sleep(){
        Common.sleep(2000);
    }

    public static void signIn() {
        clickOpenLoginPage();
        enterEmail("ul@gmail.com");
        enterPassword("myPassword");
        clickLogin();

    }
    public static void open(String url) {
        Common.openUrl(url);
    }
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
