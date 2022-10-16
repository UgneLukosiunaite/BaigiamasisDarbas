package pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class ManguMangas{
        public static class MainPage {
            public static By buttonLogInPage = By.xpath("//div[@class='header__profile']/button");
            public static By buttonRegistration = By.xpath("//div[@class='modal-content__footer']/button");
        }

        public static class RegistrationForm{
            public static By nameSurnameInput = By.xpath("//form[@class='form']/div[1]/input");
            public static By emailInput = By.xpath("//form[@class='form']/div[2]/input");
            public static By phoneNumberInput = By.xpath("//form[@class='form']/div[3]/input");
            public static By passwordInput = By.xpath("//form[@class='form']/div[4]/div/input");
            public static By password2Input = By.xpath("//form[@class='form']/div[5]/div/input");
            public static By agreeTermsCheckbox = By.xpath("//form[@class='form']/div[6]/div/input");
            public static By submitRegistrationBtn = By.xpath("//div[@class='form__actions']/button");
        }

    }
}
