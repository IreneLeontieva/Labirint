package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    // locators
    private SelenideElement
            tolstoiElement = $("[href=\"/authors/12899/\"]");

    // actions
    public void checkAuthorCorrect(String author) {
        tolstoiElement.shouldHave(Condition.text(author));
    }
}
