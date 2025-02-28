package com.maddi.ExpenseManagement.services.stats;


import com.maddi.ExpenseManagement.dto.GraphDTO;
import com.maddi.ExpenseManagement.repository.ExpenseRepository;
import com.maddi.ExpenseManagement.repository.IncomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

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
}
