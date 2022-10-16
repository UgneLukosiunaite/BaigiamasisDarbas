package pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class ManguMangas{
        public static class MainPage {
            public static By buttonLogInPage = By.xpath("//div[@class='header__profile']/button");
            public static By buttonRegistration = By.xpath("//div[@class='modal-content__footer']/button");
        }

        public static class RegistrationForm{
            public static By nameSurnameInput = By.xpath("//input[@id='ff-13']");
            public static By emailInput = By.xpath("//input[@id='@id='ff-14']");
            public static By phoneNumberInput = By.xpath("//input[@id='@id='ff-15']");
            public static By passwordInput = By.xpath("//input[@id='@id='ff-16']");
            public static By password2Input = By.xpath("//input[@id='@id='ff-17']");
            public static By agreeTermsCheckbox = By.xpath("//input[@id='@id='ff-18']");
            public static By submitRegistrationBtn = By.xpath("//div[@class='form__actions']/button");
        }

    }
}
