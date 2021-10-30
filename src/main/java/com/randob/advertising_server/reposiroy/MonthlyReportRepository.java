package com.randob.advertising_server.reposiroy;

import com.randob.advertising_server.model.MonthlyReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthlyReportRepository extends JpaRepository<MonthlyReport, Long> {
}
