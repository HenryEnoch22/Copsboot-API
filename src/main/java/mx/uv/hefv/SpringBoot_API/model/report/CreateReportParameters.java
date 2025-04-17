package mx.uv.hefv.SpringBoot_API.model.report;

import java.time.Instant;

import mx.uv.hefv.SpringBoot_API.jpa.UserId;

public class CreateReportParameters {

    private final UserId reporterId;
    private final Instant dateTime;
    private final String description;

    public CreateReportParameters(UserId reporterId, Instant dateTime, String description) {
        this.reporterId = reporterId;
        this.dateTime = dateTime;
        this.description = description;
    }

    public UserId getReporterId() {
        return reporterId;
    }

    public Instant getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }
}