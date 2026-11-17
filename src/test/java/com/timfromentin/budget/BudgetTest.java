package com.timfromentin.budget;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BudgetTest {

    private Budget budget = new Budget();

    @Test
    void shouldReturnZero_whenNoExpense() {

        long result = budget.totalInCents();

        assertThat(result).isZero();
    }

    @Test
    void shouldReturnTotal_whenOneExpense() {

        budget.addExpense(1250, "food");

        long result = budget.totalInCents();

        assertThat(result).isEqualTo(1250);
    }

    @Test
    void shouldSumTwoExpenses(){

        budget.addExpense(1250, "food");
        budget.addExpense(750, "car");

        long result = budget.totalInCents();

        assertThat(result).isEqualTo(2000);
    }

    @Test
    void shouldReturnTotalByCategory_whenNoExpense(){

        long result = budget.totalInCentsByCategory("food");

        assertThat(result).isEqualTo(0);
    }
}
