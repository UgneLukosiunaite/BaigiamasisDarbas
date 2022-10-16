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

            public static By invalidEmailErrorText = By.xpath("//form[@class='form']/div[2]/div");
            public static By invalidPhoneNumberErrorText = By.xpath("//form[@class='form']/div[3]/div");
        }
        public static class SignInPage{
            public static By logInBtn = By.xpath("//div[@class='form__actions']/button");
            public static By emailInput = By.xpath("//div[@class='modal-content']/form/div[1]/input");
            public static By passwordInput = By.xpath("//div[@class='input-password']/input");
        }
        public static class SignOutPage{
            public static By profileMenuBtn = By.xpath("//div[@class='header__profile']/div/button");
            public static By logOutBtn = By.xpath("//ul[@class='dropdown__list']/li[5]/button");

        }
    }
}
