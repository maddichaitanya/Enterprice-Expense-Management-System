package com.maddi.ExpenseManagement.dto;


import com.maddi.ExpenseManagement.entity.Expense;
import com.maddi.ExpenseManagement.entity.Income;
import lombok.Data;

@Data
public class StatsDTO {

    private Double income;

    private Double expense;

    private Income latestincome;

    private Expense latestexpense;


}
