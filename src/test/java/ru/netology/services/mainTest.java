package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class mainTest {
    @Test
    public void freelancetest1() {
        main main = new main();

        int expected = 3;
        int actual = main.calculate(10000, 3000, 20000);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void freelancetest2() {
        main main = new main();

        int expected = 2;
        int actual = main.calculate(100000, 60000, 150000);

        Assertions.assertEquals(actual, expected);

    }
}