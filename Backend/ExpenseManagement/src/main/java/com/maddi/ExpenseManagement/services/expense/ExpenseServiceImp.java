package com.maddi.ExpenseManagement.services.expense;


import com.maddi.ExpenseManagement.dto.ExpenseDTO;
import com.maddi.ExpenseManagement.entity.Expense;
import com.maddi.ExpenseManagement.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ExpenseServiceImp implements ExpenseService{

    private final ExpenseRepository expenseRepository;

    public Expense postExpense(ExpenseDTO expenseDTO){
        return saveorUpdateExpense(new Expense(),expenseDTO);
    }

    private Expense saveorUpdateExpense(Expense expense, ExpenseDTO expenseDTO){

        expense.setTitle(expenseDTO.getTitle());
        expense.setDate(expenseDTO.getDate());
        expense.setAmount(expenseDTO.getAmount());
        expense.setCategory(expenseDTO.getCategory());
        expense.setDescription(expenseDTO.getDescription());

        return expenseRepository.save(expense);
    }


    public List<Expense> getAllExpenses(){
        return expenseRepository.findAll().stream().
                sorted(Comparator.comparing(Expense::getDate).reversed())
                .collect(Collectors.toList());
    }


}
