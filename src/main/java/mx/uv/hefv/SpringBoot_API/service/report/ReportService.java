package mx.uv.hefv.SpringBoot_API.service.report;

import mx.uv.hefv.SpringBoot_API.model.report.CreateReportParameters;
import mx.uv.hefv.SpringBoot_API.model.report.Report;
import mx.uv.hefv.SpringBoot_API.model.report.ReportId;
import mx.uv.hefv.SpringBoot_API.repository.report.ReportRepository;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class ReportService {

    private final ReportRepository reportRepository;

    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    public Report createReport(CreateReportParameters parameters) {
        Report report = new Report(
                new ReportId(UUID.randomUUID().toString()),
                parameters.getReporterId(),
                parameters.getDateTime(),
                parameters.getDescription()
        );
        reportRepository.save(report);
        return report;
    }
    
   
}