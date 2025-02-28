package com.maddi.ExpenseManagement.dto;

import com.maddi.ExpenseManagement.entity.Expense;
import com.maddi.ExpenseManagement.entity.Income;
import lombok.Data;

import java.util.List;

@Data
public class GraphDTO {

    private List<Expense> expenseList;

    private List<Income> incomeList;

}
