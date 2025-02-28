package com.maddi.ExpenseManagement.services.income;

import com.maddi.ExpenseManagement.dto.IncomeDTO;
import com.maddi.ExpenseManagement.entity.Income;

import java.util.List;

public interface IncomeService {

    Income postIncome(IncomeDTO incomeDTO);

    public List<IncomeDTO> getAllIncomes();

    Income updateIncome(Long id,IncomeDTO incomeDTO);
}
