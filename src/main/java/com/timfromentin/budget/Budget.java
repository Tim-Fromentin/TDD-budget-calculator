package com.timfromentin.budget;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private final List<Expense> expenses = new ArrayList<>();

    public long totalInCents() {
        long total = 0;
        for (Expense expense : expenses) {
            total += expense.amountInCents();
        }
        return total;
    }

    public void addExpense(long expense, String category) {
        Expense expenseWithCategory = new Expense(expense, category);
        expenses.add(expenseWithCategory);
    }

    public long totalInCentsByCategory(String category) {
        return 0;
    }
}
