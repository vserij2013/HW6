package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SignInTest extends AbstractTest {

    @Test
    void SignUp() {
        new DiaryMainPage(getDriver()).goToSignInPage();
        Assertions.assertTrue(driver.getTitle().equals("Регистрация — @дневники: асоциальная сеть"), "страница входа недоступна");
        new SignInPage(getDriver()).setUsername("Applanatest1").setPassword("Student2020!").setEmail("vs346751@gmail.com").setIcon().SignUp();
    }

}