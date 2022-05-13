package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CabinetPage {
    //locators
    private SelenideElement socBlock = $(".new-auth__show-soc");

    // actions
    public void checkSocAuthBlock() {
        socBlock.shouldHave(Condition.text("Другие способы входа"));
    }

}
