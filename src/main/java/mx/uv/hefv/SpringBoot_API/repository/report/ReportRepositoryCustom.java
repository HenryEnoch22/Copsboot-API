package mx.uv.hefv.SpringBoot_API.repository.report;

import mx.uv.hefv.SpringBoot_API.model.report.Report;
import mx.uv.hefv.SpringBoot_API.model.report.ReportId;

public interface ReportRepositoryCustom {
    Report findCustomById(ReportId id);
    void saveCustom(Report report);
}
