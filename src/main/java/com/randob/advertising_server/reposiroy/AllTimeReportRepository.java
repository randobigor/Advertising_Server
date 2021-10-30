package com.randob.advertising_server.reposiroy;

import com.randob.advertising_server.model.AllTimeReport;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author randobigor
 **/

public interface AllTimeReportRepository extends JpaRepository<AllTimeReport, Long> {
}
