package mx.uv.hefv.SpringBoot_API.repository.report;


import org.springframework.data.repository.CrudRepository;

import mx.uv.hefv.SpringBoot_API.model.report.Report;
import mx.uv.hefv.SpringBoot_API.model.report.ReportId;

public interface ReportRepository extends CrudRepository<Report, ReportId>, ReportRepositoryCustom {
}