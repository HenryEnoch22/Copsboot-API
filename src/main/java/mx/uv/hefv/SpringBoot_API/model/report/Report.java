package mx.uv.hefv.SpringBoot_API.model.report;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import mx.uv.hefv.SpringBoot_API.jpa.AbstractEntity;
import mx.uv.hefv.SpringBoot_API.jpa.ArtifactForFramework;
import mx.uv.hefv.SpringBoot_API.jpa.UserId;

@Entity
@Table(name = "report")
public class Report extends AbstractEntity<ReportId> {
    private UserId reporterId;
    private Instant dateTime;
    private String description;

     @ArtifactForFramework
    protected Report() {
    }
    
    public Report(ReportId id, UserId reporterId, Instant dateTime, String description) {
        super(id);
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
