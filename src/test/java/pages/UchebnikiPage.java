package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class UchebnikiPage {
    //locators
    private SelenideElement headerUchebniki = $(".school-cap__header");

    //actions
    public void checkHeaderUchebniki() {
        headerUchebniki.shouldHave(Condition.text("Все учебники в Лабиринте"));
    }
}
