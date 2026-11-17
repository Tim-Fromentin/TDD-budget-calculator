package com.timfromentin.budget;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private final List<Long> expenses = new ArrayList<>();

    public long totalInCents() {
        long total = 0;
        for (long expense : expenses) {
            total += expense;
        }
        return total;
    }

    public void addExpense(long expense) {
        expenses.add(expense);
    }
}
