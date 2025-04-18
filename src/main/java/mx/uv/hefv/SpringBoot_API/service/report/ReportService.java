package mx.uv.hefv.SpringBoot_API.service.report;

import mx.uv.hefv.SpringBoot_API.model.report.CreateReportParameters;
import mx.uv.hefv.SpringBoot_API.model.report.Report;

import mx.uv.hefv.SpringBoot_API.repository.report.ReportRepository;


import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ReportService {

    private final ReportRepository repository;

    public ReportService(ReportRepository reportRepository) {
        this.repository = reportRepository;
    }

    public Report createReport(CreateReportParameters parameters) {
        return repository.save(new Report(repository.nextId(),
                parameters.userId(),
                parameters.dateTime(),
                parameters.description()));
    }
    
   
}