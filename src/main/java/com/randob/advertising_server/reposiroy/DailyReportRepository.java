package com.randob.advertising_server.reposiroy;

import com.randob.advertising_server.model.Advert;
import com.randob.advertising_server.model.DailyReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DailyReportRepository extends JpaRepository<DailyReport, Long> {
}
