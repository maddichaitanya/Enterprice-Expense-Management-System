package com.maddi.ExpenseManagement.services.income;

import com.maddi.ExpenseManagement.dto.IncomeDTO;
import com.maddi.ExpenseManagement.entity.Income;
import com.maddi.ExpenseManagement.repository.IncomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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


    public List<IncomeDTO> getAllIncomes(){
        return incomeRepository.findAll().stream()
                .sorted(Comparator.comparing(Income::getDate).reversed())
                .map(Income::getIncomeDto)
                .collect(Collectors.toList());

    }
}
