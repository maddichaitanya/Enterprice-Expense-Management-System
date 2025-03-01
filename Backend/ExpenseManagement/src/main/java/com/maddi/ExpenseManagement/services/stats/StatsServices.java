package com.maddi.ExpenseManagement.services.stats;

import com.maddi.ExpenseManagement.dto.GraphDTO;
import com.maddi.ExpenseManagement.dto.StatsDTO;

public interface StatsServices {


    GraphDTO getChartData();

    StatsDTO getStats();
}
