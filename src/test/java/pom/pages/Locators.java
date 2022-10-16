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
            public static By agreeTermsCheckbox = By.xpath("////div[@class='form__actions']/button");


        }

    }

    public static class SeleniumEasy {

        public static class FirstFormDemo {
            public static By inputFullName = By.xpath("//input[@id='user-message']");
            public static By buttonShowMessage = By.xpath("//form[@id='get-input']//button");
            public static By spanDisplay = By.xpath("//span[@id='display']");

            public static By inputValueA = By.xpath("//input[@id='sum1']");
            public static By inputValueB = By.xpath("//input[@id='sum2']");

            public static By buttonGetTotal = By.xpath("//*[@id='gettotal']//button");
            public static By paragraphSumTotal = By.xpath("//*[@id='displayvalue']");
        }

        public static class CheckboxDemo {
            public static By inputSingleCheckbox = By.xpath("//input[@id='isAgeSelected']");
            public static By divMessageText = By.xpath("//div[@id='txtAge']");

            public static By buttonCheckboxGroup = By.xpath("//*[@id='check1']");
            public static By inputMultipleCheckbox = By.xpath("//input[@class='cb1-element']");
        }

        public static class SelectDropdownDemo {
            public static By selectDayOfWeek = By.xpath("//select[@id='select-demo']");
            public static By paragraphDayOfWeek = By.xpath("//p[@class='selected-value']");
        }

        public static class RadioButtonDemo {
            public static By buttonCheckValue = By.xpath("//button[@id='buttoncheck']");
            public static By paragraphRadioButton = By.xpath("//p[@class='radiobutton']");
            public static By buttonGetValues = By.xpath("(//button)[3]");
            public static By paragraphGroupValue = By.xpath("//*[@class='groupradiobutton']");

            public static By inputByGender(String gender) {
                return By.xpath(String.format("//input[@value='%s' and @name='optradio']", gender));
            }

            public static By inputByGenderGroup(String gender) {
                return By.xpath(String.format("//*[@value='%s' and @name='gender']", gender));
            }

            public static By inputByAgeGroup(String ageGroup) {
                return By.xpath(String.format("//*[@value='%s' and @name='ageGroup']", ageGroup));
            }
        }

        public static class AlertBoxDemo {
            public static By buttonDisplayAlertBox = By.xpath("//button[@class='btn btn-default']");

            public static By buttonDisplayConfirmBox =
                    By.xpath("//button[@onclick='myConfirmFunction()']");
            public static By paragraphConfirmBox = By.xpath("//*[@id='confirm-demo']");

            public static By buttonOpenAlertBoxToAddText =
                    By.xpath("//button[@onclick='myPromptFunction()']");
            public static By paragraphAlertBox = By.xpath("//*[@id='prompt-demo']");
        }
    }
    public static class Tv3{
        public static class Home{
            public static By formPrivacyConfirmation = By.xpath("//div[@id='qc-cmp2=vi']");
            public static By buttonConfirmation = By.xpath("//div[@id='qc-cmp2-ui']//button[@mode='primary']");
            public static By menuLinkUzsienis = By.xpath
                    ("//div[@class='headerItems']//a[contains(text(),'Užsienis')]");
            public static By linkNewsHeaderUzsienis =
                    By.xpath("//div[@class='News-list-header']//a[contains(text(),'Užsienis')]");
        }

    }
}
