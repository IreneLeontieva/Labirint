package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    // locators
    private SelenideElement
            mainSearchField = $("input[placeholder='Поиск по Лабиринту']"),
            uchebniki = $("[data-toggle='header-school']"),
            cabinet = $(".b-header-b-personal-e-list-item_cabinet"),
            help = $(byText("Доставка и оплата"));


    // actions

    public void openMainPage() {
        open("https://www.labirint.ru/");
    }

    public void searchBook(String book) {
        mainSearchField.setValue(book).pressEnter();
    }

    public void goToUchebniki() {
        uchebniki.click();
    }

    public void goToCabinet() {
        cabinet.click();
    }

    public void goToHelp() {
        help.click();
    }
}
