package no.ntnu.idatt1002.demo.data;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BudgetTest {

  @Test
  void add() {
    Budget budget = new Budget();

    budget.add(ExpenseType.TYPE6, BigDecimal.valueOf(123));
    assertEquals(BigDecimal.valueOf(123),budget.getAmount(ExpenseType.TYPE6));
  }
}