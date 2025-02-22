package com.maddi.ExpenseManagement.Controller;


import com.maddi.ExpenseManagement.dto.IncomeDTO;
import com.maddi.ExpenseManagement.entity.Income;
import com.maddi.ExpenseManagement.services.income.IncomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/income")
@RequiredArgsConstructor
@CrossOrigin("*")
public class IncomeController {

    private final IncomeService incomeService;

    @PostMapping
    public ResponseEntity<?> postIncome(@RequestBody IncomeDTO incomeDTO){

        Income createIncome=incomeService.postIncome(incomeDTO);

        if(createIncome != null){
            return ResponseEntity.status(HttpStatus.CREATED).body(createIncome);
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @GetMapping("/all")
    public ResponseEntity<?> getAllIncomes(){
        return ResponseEntity.ok(incomeService.getAllIncomes());
    }

}
