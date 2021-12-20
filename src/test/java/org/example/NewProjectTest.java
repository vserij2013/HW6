package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewProjectTest extends AbstractTest {

    @Test
    void CreateProject() {
        new DiaryMainPage(getDriver()).goToNewProjectPage();
        Assertions.assertTrue(driver.getTitle().equals("Создание записи — @дневники: асоциальная сеть"), "страница опубликования недоступна");
        new NewProjectPage(getDriver()).setSubject("453353453").setTheme().CreateProject();
    }

}
