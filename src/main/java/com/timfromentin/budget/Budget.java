package com.timfromentin.budget;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        if (expense < 1){
            throw new IllegalArgumentException("Une dépense ne peut pas être négative.");
        }
        Expense expenseWithCategory = new Expense(expense, category);
        expenses.add(expenseWithCategory);
    }

    public long totalInCentsByCategory(String category) {
        long total = 0;
        for (Expense expense : expenses){
            if (Objects.equals(expense.category(), category)){
                total += expense.amountInCents();
            }
        }
        return total;
    }
}
