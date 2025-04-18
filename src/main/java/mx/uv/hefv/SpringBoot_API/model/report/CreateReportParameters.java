package mx.uv.hefv.SpringBoot_API.model.report;

import java.time.Instant;

import mx.uv.hefv.SpringBoot_API.jpa.UserId;

public record CreateReportParameters(UserId userId, Instant dateTime, String description) {
}