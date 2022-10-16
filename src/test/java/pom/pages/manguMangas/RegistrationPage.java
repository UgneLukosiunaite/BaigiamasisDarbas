package pom.pages.manguMangas;

import pom.pages.Common;
import pom.pages.Locators;

public class RegistrationPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickOpenLoginPage() {
        Common.clickElement(
                Locators.ManguMangas.MainPage.buttonLogInPage
        );
    }

    public static void clickRegister() {
        Common.clickElement(
                Locators.ManguMangas.MainPage.buttonRegistration
        );    }

    public static void enterFullName(String text) {
        Common.sendKeysToElement(
                text,
                Locators.ManguMangas.RegistrationForm.nameSurnameInput
        );
    }

    public static void enterEmail(String text) {
        Common.sendKeysToElement(
                text,
                Locators.ManguMangas.RegistrationForm.emailInput
        );
    }

    public static String getInvalidEmailText(){
        return Common.getElementText(Locators.ManguMangas.RegistrationForm.invalidEmailErrorText);
    }
    public static String getInvalidPhoneNumberText(){
        return Common.getElementText(Locators.ManguMangas.RegistrationForm.invalidPhoneNumberErrorText);
    }

    public static void enterPhoneNumber(String text) {
        Common.sendKeysToElement(
                text,
                Locators.ManguMangas.RegistrationForm.phoneNumberInput
        );
    }

    public static void enterPassword(String text) {
        Common.sendKeysToElement(
                text,
                Locators.ManguMangas.RegistrationForm.passwordInput
        );
    }

    public static void enterPassword2(String text) {
        Common.sendKeysToElement(
                text,
                Locators.ManguMangas.RegistrationForm.password2Input
        );
    }

    public static void clickAgreeTerms() {
        Common.clickElement(
                Locators.ManguMangas.RegistrationForm.agreeTermsCheckbox
        );
    }

    public static void submitRegistration() {
        Common.clickElement(
                Locators.ManguMangas.RegistrationForm.submitRegistrationBtn
        );
    }
}
