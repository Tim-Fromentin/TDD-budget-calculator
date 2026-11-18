package com.timfromentin.budget;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @Test
    void shouldReturnAllExpenseByCategory(){
        budget.addExpense(500, "food");
        budget.addExpense(100, "food");

        long result = budget.totalInCentsByCategory("food");

        assertThat(result).isEqualTo(600);
    }

    @Test
    void shouldReturnAllExpenseByCategory_whenMultipleCategoryExpense(){
        budget.addExpense(300, "food");
        budget.addExpense(100, "travel");

        long result = budget.totalInCentsByCategory("travel");

        assertThat(result).isEqualTo(100);
    }

    @Test
    void shouldReturnIllegalArgumentException_whenAddNegativeExpense(){

        assertThatThrownBy(() -> budget.addExpense(-200, "travel"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Une dépense ne peut pas être négative.");

    }
}
