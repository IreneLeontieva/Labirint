package tests;

import com.github.javafaker.Faker;

public class TestData {
    //test data
    public static Faker faker = new Faker();
    public static final String RANDOM_BOOK = faker.book().title();

    public static final String WAR_AND_PIECE_TITLE = "Война и мир";
    public static final String WAR_AND_PIECE_AUTHOR = "Толстой Лев Николаевич";

    public static final String EXPECTED_TITLE = "Лабиринт | Книжный интернет-магазин: купить книги, новинки, бестселлеры";

    public static final String ERROR_TEXT = "SEVERE";
}
