# Проект по автоматизации тестирования интернет-магазина Лабиринт
## <a target="_blank" href="https://www.labirint.ru/">Интернет-магазин Лабиринт</a>

## :floppy_disk: Содержание:

- <a href="#computer-технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#notebook_with_decorative_cover-реализованные-проверки">Реализованные проверки</a>
- <a href="#electric_plug-сборка-в-Jenkins">Сборка в Jenkins</a>
- <a href="#arrow_forward-запуск-из-терминала">Запуск из терминала</a>
- <a href="#open_book-allure-отчет">Allure отчет</a>
- <a href="#hammer-allure-test-ops-отчет">Allure Test Ops отчет</a>
- <a href="#wrench-интеграция-с-jira">Интеграция с Jira</a>
- <a href="#robot-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#film_projector-видео-примеры-прохождения-тестов">Видео примеры прохождения тестов</a>

## :computer: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

## :notebook_with_decorative_cover: Реализованные проверки
- Проверка наличия надписи Лабиринт | Книжный интернет-магазин: купить книги, новинки, бестселлеры
- Переход в раздел Школа
- Проверка поиска
- Проверка перехода в кабинет
- Добавление товара в корзину
- Проверка отсутствия ошибок в консоли бразуера
- Проверка работы поиска в разделе помощь

## :electric_plug: Сборка в Jenkins
### <a target="_blank" href="https://jenkins.autotests.cloud/job/irinaleonteva_qaguru_11_13_jenkins/">Сборка в Jenkins</a>
<p align="center">
<img title="Jenkins Dashboard" src="images/screenshots/jenkins-dashboard.png">
</p>  

## :arrow_forward: Запуск из терминала
Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
clean
test
-Dremote=${REMOTE}
-Dbrowser=${BROWSER}
```

## :open_book: Allure отчет
- ### Главный экран отчета
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure-main-page.png">
</p>

- ### Страница с проведенными тестами
<p align="center">
<img title="Allure Test Page" src="images/screenshots/allure-test-page.png">
</p>

## :hammer: Allure Test Ops отчет
<p align="center">
<img title="Allure Test Ops Launch" src="images/screenshots/allure-test-ops-page.png">
</p>

## :wrench: Интеграция с Jira
<p align="center">
<img title="Jira Issue Dashboard" src="images/screenshots/jira-issue-page.png">
</p>

## :robot: Отчет в Telegram
<p align="center">
<img title="Telegram notification message" src="images/screenshots/telegram-bot.png">
</p>

## :film_projector: Видео примеры прохождения тестов
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gif/test-run.gif">
</p>