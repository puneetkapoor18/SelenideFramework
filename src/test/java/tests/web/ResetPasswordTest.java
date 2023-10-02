package tests.web;

import org.selenide.pages.LoginPage;
import org.selenide.tags.suite.RegressionTest;
import org.selenide.tags.testtype.WebTest;
import tests.base.WebTestSetup;

@RegressionTest
public class ResetPasswordTest extends WebTestSetup {

    @WebTest
    void resetPasswordTest(){
        LoginPage.getInstance()
                .navigateToResetPasswordPage()
                .resetPassword()
                .checkWhetherPasswordResetMessageIsDisplayed();
    }
}
