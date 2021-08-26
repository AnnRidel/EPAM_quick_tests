package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class EpamQuickTests extends TestBase {
    public static final String BASE_URL = "https://www.epam-group.ru/";

    @Test
    @DisplayName("Поиск текста 'Создаем будущее сегодня' на главной странице рус.версии сайта")
    void foundTextCreateFutureTest() {
        step("Открыть страницу " + BASE_URL, () ->
                open(BASE_URL));

        step("Проверить, что на странице есть текст 'Создаем будущее сегодня'", () -> {
            $$(".title-slider__slide-row").shouldHave(CollectionCondition.itemWithText("Создаем будущее сегодня"));
        });
    }

    @Test
    @DisplayName("Поиск текста 'Engineering the Future' на главной странице при смене языка (Global English)")
    void changeLanguageAndFoundTextTest() {
        step("Открыть страницу " + BASE_URL, () ->
                open(BASE_URL));

        step("Открыть окно выбора языка", () -> {
            $(".location-selector__button").click();
        });

        step("Выбрать вариант 'Global (English)'", () -> {
            $$(".location-selector__link").find(text("Global")).click();
        });

        step("Проверить, что на странице есть текст 'Engineering the Future'", () -> {
            $$(".title-slider__slide-row").shouldHave(CollectionCondition.itemWithText("Engineering the Future"));
        });
    }

    @Test
    @DisplayName("Проверка title главной страницы")
    void checkMainPageTitleTest() {
        step("Открыть страницу " + BASE_URL, () ->
                open(BASE_URL));

        step("Проверить, что title = 'EPAM | Разработка ПО'", () -> {
            String expectedTitle = "EPAM | Разработка ПО";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Проверка title при переходе на страницу 'Услуги'")
    void openAndCheckUslugiPageTitleTest() {
        step("Открыть страницу " + BASE_URL, () ->
                open(BASE_URL));

        step("Кликнуть по кнопке 'Услуги'", () -> {
            $(byText("Услуги")).click();
        });

        step("Проверить, что title = 'Услуги'", () -> {
            String expectedTitle = "Услуги";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Проверка title при переходе на страницу 'Решения и проекты'")
    void openAndCheckOurWorkPageTitleTest() {
        step("Открыть страницу " + BASE_URL, () ->
                open(BASE_URL));

        step("Кликнуть по кнопке 'Решения и проекты'", () -> {
            $(byText("Решения и проекты")).click();
        });

        step("Проверить, что title = 'Решения и проекты'", () -> {
            String expectedTitle = "Решения и проекты";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Проверка title при переходе на страницу 'Подходы'")
    void openAndCheckHowWeDoItPageTitleTest() {
        step("Открыть страницу " + BASE_URL, () ->
                open(BASE_URL));

        step("Кликнуть по кнопке 'Подходы'", () -> {
            $(byText("Подходы")).click();
        });

        step("Проверить, что title = 'Подходы'", () -> {
            String expectedTitle = "Подходы";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Проверка title при переходе на страницу 'Идеи'")
    void openAndCheckInsightsPageTitleTest() {
        step("Открыть страницу " + BASE_URL, () ->
                open(BASE_URL));

        step("Кликнуть по кнопке 'Идеи'", () -> {
            $(byText("Идеи")).click();
        });

        step("Проверить, что title = 'Идеи'", () -> {
            String expectedTitle = "Идеи";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Проверка title при переходе на страницу 'О нас'")
    void openAndCheckAboutPageTitleTest() {
        step("Открыть страницу " + BASE_URL, () ->
                open(BASE_URL));

        step("Кликнуть по кнопке 'О нас'", () -> {
            $(byText("О нас")).click();
        });

        step("Проверить, что title = 'О нас'", () -> {
            String expectedTitle = "О нас";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Проверка title при переходе на страницу 'Карьера в EPAM'")
    void openAndCheckCareersPageTitleTest() {
        step("Открыть страницу " + BASE_URL, () ->
                open(BASE_URL));

        step("Кликнуть по кнопке 'Карьера в EPAM'", () -> {
            $(byText("Карьера в EPAM")).click();
        });

        step("Проверить, что title = 'EPAM | Перспективная работа для ИТ-специалистов'", () -> {
            String expectedTitle = "EPAM | Перспективная работа для ИТ-специалистов";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}