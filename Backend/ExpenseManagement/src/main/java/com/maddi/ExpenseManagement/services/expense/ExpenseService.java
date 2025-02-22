package com.maddi.ExpenseManagement.services.expense;

import com.maddi.ExpenseManagement.dto.ExpenseDTO;
import com.maddi.ExpenseManagement.entity.Expense;

import java.util.List;

public interface ExpenseService {


    Expense postExpense(ExpenseDTO expenseDTO);

    List<Expense> getAllExpenses();
}
