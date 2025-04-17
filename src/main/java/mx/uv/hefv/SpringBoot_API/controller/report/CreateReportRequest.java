package mx.uv.hefv.SpringBoot_API.controller.report;


import java.time.Instant;

import mx.uv.hefv.SpringBoot_API.jpa.UserId;
import mx.uv.hefv.SpringBoot_API.model.report.CreateReportParameters;

public record CreateReportRequest(Instant dateTime, String description) {

    public CreateReportParameters toParameters(UserId userId) {
        return new CreateReportParameters(userId, dateTime, description);
    }
}
