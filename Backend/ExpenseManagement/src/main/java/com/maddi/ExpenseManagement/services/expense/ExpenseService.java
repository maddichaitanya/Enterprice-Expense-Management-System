package com.maddi.ExpenseManagement.services.expense;

import com.maddi.ExpenseManagement.dto.ExpenseDTO;
import com.maddi.ExpenseManagement.entity.Expense;

public interface ExpenseService {


    Expense postExpense(ExpenseDTO expenseDTO);
}
