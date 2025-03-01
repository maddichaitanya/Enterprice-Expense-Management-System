package com.maddi.ExpenseManagement.services.stats;


import com.maddi.ExpenseManagement.dto.GraphDTO;
import com.maddi.ExpenseManagement.dto.StatsDTO;
import com.maddi.ExpenseManagement.entity.Expense;
import com.maddi.ExpenseManagement.entity.Income;
import com.maddi.ExpenseManagement.repository.ExpenseRepository;
import com.maddi.ExpenseManagement.repository.IncomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StatsServicesImp implements StatsServices {

    private final IncomeRepository incomeRepository;

    private final ExpenseRepository expenseRepository;


    public GraphDTO getChartData(){
        LocalDate endDate=LocalDate.now();
        LocalDate startDate=endDate.minusDays(27);

        GraphDTO graphDTO=new GraphDTO();
        graphDTO.setExpenseList(expenseRepository.findByDateBetween(startDate,endDate));
        graphDTO.setIncomeList(incomeRepository.findByDateBetween(startDate,endDate));

        return graphDTO;
    }

    public StatsDTO getStats(){
        Double totalIncome=incomeRepository.sumAllAmounts();
        Double totalExpense=incomeRepository.sumAllAmounts();

        Optional<Income> optionalIncome=incomeRepository.findFirstByOrderByDateDesc();
        Optional<Expense> optionalExpense=expenseRepository.findFirstByOrderByDateDesc();

        StatsDTO statsDTO=new StatsDTO();
        statsDTO.setExpense(totalExpense);
        statsDTO.setIncome(totalIncome);

        optionalIncome.ifPresent(statsDTO::setLatestincome);
        optionalExpense.ifPresent(statsDTO::setLatestexpense);

        return statsDTO;
    }
}
