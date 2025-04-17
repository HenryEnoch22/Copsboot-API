package mx.uv.hefv.SpringBoot_API.model.report;

import mx.uv.hefv.SpringBoot_API.jpa.AbstractEntityId;

public class ReportId extends AbstractEntityId<String> {
    protected ReportId() {
    }

    public ReportId(String id) {
        super(id);
    }
}