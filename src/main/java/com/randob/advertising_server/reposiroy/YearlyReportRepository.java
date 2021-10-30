package com.randob.advertising_server.reposiroy;

import com.randob.advertising_server.model.YearlyReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YearlyReportRepository extends JpaRepository<YearlyReport, Long> {
}
