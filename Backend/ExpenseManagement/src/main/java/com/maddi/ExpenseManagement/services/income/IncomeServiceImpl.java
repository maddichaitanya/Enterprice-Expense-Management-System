package com.maddi.ExpenseManagement.services.income;


import com.maddi.ExpenseManagement.dto.ExpenseDTO;
import com.maddi.ExpenseManagement.dto.IncomeDTO;
import com.maddi.ExpenseManagement.entity.Expense;
import com.maddi.ExpenseManagement.entity.Income;
import com.maddi.ExpenseManagement.repository.IncomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IncomeServiceImpl  implements IncomeService{

    private final IncomeRepository incomeRepository;

    public Income postIncome(IncomeDTO incomeDTO){
        return saveorUpdateIncome(new Income(),incomeDTO);
    }

    private Income saveorUpdateIncome(Income income, IncomeDTO incomeDTO) {
        income.setTitle(incomeDTO.getTitle());
        income.setDate(incomeDTO.getDate());
        income.setAmount(incomeDTO.getAmount());
        income.setCategory(incomeDTO.getCategory());
        income.setDescription(incomeDTO.getDescription());

        return incomeRepository.save(income);
    }
}
