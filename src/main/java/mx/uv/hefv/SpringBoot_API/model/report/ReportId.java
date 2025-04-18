package mx.uv.hefv.SpringBoot_API.model.report;

import java.util.UUID;

import mx.uv.hefv.SpringBoot_API.jpa.AbstractEntityId;

public class ReportId extends AbstractEntityId<UUID> {
    protected ReportId() {
    }

    public ReportId(UUID id) {
        super(id);
    }
}