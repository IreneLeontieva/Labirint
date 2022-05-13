package tests;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.Credentials;
import helpers.Attach;
import helpers.DriverSettings;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static io.qameta.allure.Allure.step;

public class TestBase {

    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    CabinetPage cabinetPage = new CabinetPage();
    HelpPage helpPage = new HelpPage();
    BasketPage basketPage = new BasketPage();
    UchebnikiPage uchebnikiPage = new UchebnikiPage();

    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DriverSettings.configure();
    }

    @BeforeEach
    void openLabirint() {
        step("open labirint", () -> {
            open("https://www.labirint.ru/");
        });
    }

    @AfterEach
    void addAttachments() {
        Attach.takeScreenshot("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}
