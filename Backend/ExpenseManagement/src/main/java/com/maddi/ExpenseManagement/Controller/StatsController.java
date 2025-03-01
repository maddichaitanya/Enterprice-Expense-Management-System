package com.maddi.ExpenseManagement.Controller;


import com.maddi.ExpenseManagement.dto.GraphDTO;
import com.maddi.ExpenseManagement.services.stats.StatsServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stats")
@RequiredArgsConstructor
@CrossOrigin("*")
public class StatsController {

    private final StatsServices statsServices;

    @GetMapping("/chart")
    public ResponseEntity<GraphDTO> getChartDetails(){
        return ResponseEntity.ok(statsServices.getChartData());

    }

    @GetMapping
    private ResponseEntity<?> getStats(){
        return ResponseEntity.ok(statsServices.getStats());
    }
}
