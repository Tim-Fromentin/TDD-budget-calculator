package com.timfromentin.budget;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BudgetTest {

    @Test
    void shouldReturnZero_whenNoExpense(){

        Budget budget = new Budget();

        long result = budget.totalInCents();

        assertThat(result).isZero();
    }
}
