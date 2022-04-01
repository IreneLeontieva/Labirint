package tests;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {

    Faker faker = new Faker();
    String book = faker.book().title();

    @Test
    @Description("Search book")
    @DisplayName("Check that search works")
    void searchBook() {
        step("Search book", () -> {
            $("input[placeholder='Поиск по Лабиринту']").setValue(book).pressEnter();
        });
        step("Check that book is found", () -> {
            $(".index-top-title").shouldHave(Condition.text("Все, что мы нашли в Лабиринте\n" +
                    "            по запросу «" + book + "»"));
        });
    }

    @Test
    @Description("Adding book to card")
    @DisplayName("Check card")
    void generatedTest() {
        step("Search war and piece book", () -> {
            $("input[placeholder='Поиск по Лабиринту']").setValue("Война и мир").pressEnter();
        });
        step("Adding book to card", () -> {
            $("[data-name='Война и мир']").click();
            $(".btn-primary.btn-buy").click();
            $(".btn.btn-small.btn-more.tobasket ").click();
        });
        step("Check that author is correct", () -> {
            $("[href=\"/authors/12899/\"]").shouldHave(Condition.text("Толстой Лев Николаевич"));
        });
    }

    @Test
    @Description("Opening school")
    @DisplayName("Check school")
    void checkSchool() {
        step("Go to uchebniki", () -> {
            $("[data-toggle='header-school']").click();
        });
        step("Check that uchebniki is opened", () -> {
            $(".school-cap__header").shouldHave(Condition.text("Все учебники в Лабиринте"));
        });
    }

    @Test
    @Description("Opening cabinet")
    @DisplayName("Check cabinet")
    void checkCabinet() {
        step("Go to cabinet", () -> {
            $(".b-header-b-personal-e-list-item_cabinet").click();
        });
        step("Check that cabinet is opened", () -> {
            $(".new-auth__show-soc").shouldHave(Condition.text("Другие способы входа"));
        });
    }

    @Test
    @Description("Check title")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.labirint.ru/'", () ->
                open("https://www.labirint.ru/"));

        step("Page title should have text 'Лабиринт | Книжный интернет-магазин: купить книги, новинки, бестселлеры'", () -> {
            String expectedTitle = "Лабиринт | Книжный интернет-магазин: купить книги, новинки, бестселлеры";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

}