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
}
