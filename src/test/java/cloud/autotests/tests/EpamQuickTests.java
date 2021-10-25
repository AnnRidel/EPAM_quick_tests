package cloud.autotests.tests;

import cloud.autotests.annotations.JiraIssue;
import cloud.autotests.annotations.JiraIssues;
import cloud.autotests.annotations.Tester;
import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

@Owner("AKuznetsova")
@DisplayName("EpamUITests")

public class EpamQuickTests extends TestBase {
    public static final String BASE_URL = "https://www.epam-group.ru/";

    @Test
    @Feature("Localization")
    @Tag("UI")
    @Tester("AKuznetsova")
    @JiraIssues({@JiraIssue("HOMEWORK-262")})
    @DisplayName("Search for the text 'Создаем будущее сегодня' on the main page of the Russian version of the site")
    void foundTextCreateFutureTest() {
        step("Open page " + BASE_URL, () ->
                open(BASE_URL));

        step("Check that the page has the text 'Создаем будущее сегодня'", () -> {
            $$(".title-slider__slide-row").shouldHave(CollectionCondition.itemWithText("Создаем будущее сегодня"));
        });
    }

    @Test
    @Feature("Localization")
    @Tag("UI")
    @Tester("AKuznetsova")
    @JiraIssues({@JiraIssue("HOMEWORK-262")})
    @DisplayName("Search for the text 'Engineering the Future' on the main page when changing the language (Global English)")
    void changeLanguageAndFoundTextTest() {
        step("Open page " + BASE_URL, () ->
                open(BASE_URL));

        step("Open language selection window", () -> $(".location-selector__button").click());

        step("Select 'Global (English)'", () -> $$(".location-selector__link").find(text("Global")).click());

        step("Check that the page contains the text 'Engineering the Future'", () -> {
            $$(".title-slider__slide-row").shouldHave(CollectionCondition.itemWithText("Engineering the Future"));
        });
    }

    @Test
    @Feature("Page title")
    @Tag("UI")
    @Tester("AKuznetsova")
    @JiraIssues({@JiraIssue("HOMEWORK-262")})
    @DisplayName("Checking the title of the main page")
    void checkMainPageTitleTest() {
        step("Open page " + BASE_URL, () ->
                open(BASE_URL));

        step("Check that the title = 'EPAM | Разработка ПО'", () -> {
            String expectedTitle = "EPAM | Разработка ПО";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Feature("Page title")
    @Tag("UI")
    @Tester("AKuznetsova")
    @JiraIssues({@JiraIssue("HOMEWORK-262")})
    @DisplayName("Checking the title when going to the page 'Услуги'")
    void openAndCheckUslugiPageTitleTest() {
        step("Open page " + BASE_URL, () ->
                open(BASE_URL));

        step("Click the button 'Услуги'", () -> $(byText("Услуги")).click());

        step("Check that the title = 'Услуги'", () -> {
            String expectedTitle = "Услуги";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Feature("Page title")
    @Tag("UI")
    @Tester("AKuznetsova")
    @JiraIssues({@JiraIssue("HOMEWORK-262")})
    @DisplayName("Checking the title when going to the page 'Решения и проекты'")
    void openAndCheckOurWorkPageTitleTest() {
        step("Open page " + BASE_URL, () ->
                open(BASE_URL));

        step("Click the button 'Решения и проекты'", () -> $(byText("Решения и проекты")).click());

        step("Check that the title = 'Решения и проекты'", () -> {
            String expectedTitle = "Решения и проекты";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Feature("Page title")
    @Tag("UI")
    @Tester("AKuznetsova")
    @JiraIssues({@JiraIssue("HOMEWORK-262")})
    @DisplayName("Checking the title when going to the page 'Подходы'")
    void openAndCheckHowWeDoItPageTitleTest() {
        step("Open page " + BASE_URL, () ->
                open(BASE_URL));

        step("Click the button 'Подходы'", () -> $(byText("Подходы")).click());

        step("Check that the title = 'Подходы'", () -> {
            String expectedTitle = "Подходы";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Feature("Page title")
    @Tag("UI")
    @Tester("AKuznetsova")
    @JiraIssues({@JiraIssue("HOMEWORK-262")})
    @DisplayName("Checking the title when going to the page 'Идеи'")
    void openAndCheckInsightsPageTitleTest() {
        step("Open page " + BASE_URL, () ->
                open(BASE_URL));

        step("Click the button 'Идеи'", () -> $(byText("Идеи")).click());

        step("Check that the title = 'Идеи'", () -> {
            String expectedTitle = "Идеи";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Feature("Page title")
    @Tag("UI")
    @Tester("AKuznetsova")
    @JiraIssues({@JiraIssue("HOMEWORK-262")})
    @DisplayName("Checking the title when going to the page 'О нас'")
    void openAndCheckAboutPageTitleTest() {
        step("Open page " + BASE_URL, () ->
                open(BASE_URL));

        step("Click the button 'О нас'", () -> $(byText("О нас")).click());

        step("Check that the title = 'О нас'", () -> {
            String expectedTitle = "О нас";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Feature("Page title")
    @Tag("UI")
    @Tester("AKuznetsova")
    @JiraIssues({@JiraIssue("HOMEWORK-262")})
    @DisplayName("Checking the title when going to the page 'Карьера в EPAM'")
    void openAndCheckCareersPageTitleTest() {
        step("Open page " + BASE_URL, () ->
                open(BASE_URL));

        step("Click the button 'Карьера в EPAM'", () -> $(byText("Карьера в EPAM")).click());

        step("Check that the title ='EPAM | Перспективная работа для ИТ-специалистов'", () -> {
            String expectedTitle = "EPAM | Перспективная работа для ИТ-специалистов";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}