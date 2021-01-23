package ru.netology.checks;

public class CheckStyle {
    public long calculate(long amount, boolean registered) {

        int percent = registered ? 3 : 1; // расчет процента, в зависимости от того, зареган юзер или нет
        long bonus = amount * percent / 100 / 100; // расчет бонуса
        long limit = 500; // лимит
        if (bonus > limit) {
            bonus = limit;
        }

        return bonus;
    }
}
