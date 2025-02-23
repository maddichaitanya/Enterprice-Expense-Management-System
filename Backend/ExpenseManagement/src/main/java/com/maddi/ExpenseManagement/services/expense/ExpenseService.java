package com.maddi.ExpenseManagement.services.expense;

import com.maddi.ExpenseManagement.dto.ExpenseDTO;
import com.maddi.ExpenseManagement.entity.Expense;

import java.util.List;

public interface ExpenseService {


    Expense postExpense(ExpenseDTO expenseDTO);

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);

    Expense updateExpense(Long id,ExpenseDTO expenseDTO);
}
