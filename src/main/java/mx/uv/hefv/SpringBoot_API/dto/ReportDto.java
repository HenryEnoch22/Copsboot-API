package mx.uv.hefv.SpringBoot_API.dto;

import java.time.Instant;

import mx.uv.hefv.SpringBoot_API.model.report.Report;
import mx.uv.hefv.SpringBoot_API.model.report.ReportId;
import mx.uv.hefv.SpringBoot_API.service.user.UserService;

public record ReportDto(ReportId id, String reporter, Instant dateTime, String description) {

    public static ReportDto fromReport(Report report, UserService userService) {
        String reporterEmail = userService.getUserById(report.getReporterId())
                .orElseThrow(() -> new IllegalArgumentException("User not found: " + report.getReporterId()))
                .getEmail();
    
        return new ReportDto(
                report.getId(),
                reporterEmail,
                report.getDateTime(),
                report.getDescription()
        );
    }
}