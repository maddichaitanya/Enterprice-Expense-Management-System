package com.maddi.ExpenseManagement.services.income;

import com.maddi.ExpenseManagement.dto.IncomeDTO;
import com.maddi.ExpenseManagement.entity.Income;

public interface IncomeService {

    Income postIncome(IncomeDTO incomeDTO);

}
