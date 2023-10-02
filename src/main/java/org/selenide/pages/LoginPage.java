package org.selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.selenide.entity.LoginDetails;

import java.time.Duration;

import static com.codeborne.selenide.ClickOptions.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private LoginPage(){}

    public static LoginPage getInstance(){
        return new LoginPage();
    }

    private static final SelenideElement FORGOT_YOUR_PASSWORD = $(withText("Forgot your"));

    public ResetPasswordPage navigateToResetPasswordPage(){
        FORGOT_YOUR_PASSWORD.shouldBe(interactable, Duration.ofSeconds(30)).click(usingJavaScript());
        return new ResetPasswordPage();
    }
}
