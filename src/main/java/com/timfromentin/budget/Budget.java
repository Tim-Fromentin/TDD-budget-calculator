package com.timfromentin.budget;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private final List<Long> expenses = new ArrayList<>();

    public long totalInCents() {
        return 0;
    }

    public void addExpense(long expense) {
        expenses.add(expense);
    }
}
