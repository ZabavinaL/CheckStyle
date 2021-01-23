package ru.netology.checks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckStyleTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        CheckStyle service = new CheckStyle(); // создаем объект service


        // подготавливаем данные:
        long amount = 2000_80;
        boolean registered = true;
        long expected = 60;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredAndOverLimit() {
        CheckStyle service = new CheckStyle(); // создаем объект service


        // подготавливаем данные:
        long amount = 26_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredAndUnderLimit() {
        CheckStyle service = new CheckStyle(); // создаем объект service


        // подготавливаем данные:
        long amount = 2000_80;
        boolean registered = false;
        long expected = 20;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredAndOverLimit() {
        CheckStyle service = new CheckStyle(); // создаем объект service


        // подготавливаем данные:
        long amount = 52_000_20;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredZero() {
        CheckStyle service = new CheckStyle(); // создаем объект service


        // подготавливаем данные:
        long amount = 0;
        boolean registered = false;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}
