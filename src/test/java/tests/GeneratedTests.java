package tests;

import helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static tests.TestData.*;


public class GeneratedTests extends TestBase {

    @Test
    @Description("Search book")
    @DisplayName("Check that search works")
    void searchBook() {
        step("Search book", () -> {
            mainPage.searchBook(RANDOM_BOOK);
        });
        step("Check that book is found", () -> {
            searchPage.resultofSearch(RANDOM_BOOK);
        });
    }

    @Test
    @Description("Adding book to basket")
    @DisplayName("Check basket")
    void generatedTest() {
        step("Search war and piece book", () -> {
            mainPage.searchBook(WAR_AND_PIECE_TITLE);
        });
        step("Adding book to basket", () -> {
            searchPage.addBooktoBasketAndGoThere();
        });
        step("Check that author is correct", () -> {
            basketPage.checkAuthorCorrect(WAR_AND_PIECE_AUTHOR);
        });
    }

    @Test
    @Description("Opening school")
    @DisplayName("Check school")
    void checkSchool() {
        step("Go to uchebniki", () -> {
            mainPage.goToUchebniki();
        });
        step("Check that uchebniki is opened", () -> {
            uchebnikiPage.checkHeaderUchebniki();
        });
    }

    @Test
    @Description("Opening cabinet")
    @DisplayName("Check cabinet")
    void checkCabinet() {
        step("Go to cabinet", () -> {
            mainPage.goToCabinet();
        });
        step("Check that cabinet is opened", () -> {
            cabinetPage.checkSocAuthBlock();
        });
    }

    @Test
    @Description("Check title")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Page title should have text 'Лабиринт | Книжный интернет-магазин: купить книги, новинки, бестселлеры'", () -> {
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(EXPECTED_TITLE);
        });
    }

    @Test
    @Description("Check logs")
    @DisplayName("Check browser logs should not have severe errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Проверяем что консоль логов не содержит ошибок 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            assertThat(consoleLogs).doesNotContain(ERROR_TEXT);
        });
    }

    @Test
    @Description("Check search")
    @DisplayName("Check help search works correct")
    void checkSearchHelp() {
        step("Go to help", () -> {
            mainPage.goToHelp();
        });
        step("Search cash pay", () -> {
            helpPage.checkCashPay();
        });
        step("Press search button", () -> {
            helpPage.clickButtonSearch();
        });
        step("Check help search works for cash pay", () -> {
            helpPage.helpSearchWorks();
        });
    }
}
