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

        budget.addExpense(1250);

        long result = budget.totalInCents();

        assertThat(result).isEqualTo(1250);
    }
}
