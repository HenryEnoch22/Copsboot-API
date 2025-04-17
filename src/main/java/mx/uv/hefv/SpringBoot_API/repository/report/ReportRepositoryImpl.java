package mx.uv.hefv.SpringBoot_API.repository.report;

import jakarta.persistence.EntityManager;
import mx.uv.hefv.SpringBoot_API.model.report.Report;
import mx.uv.hefv.SpringBoot_API.model.report.ReportId;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ReportRepositoryImpl implements ReportRepositoryCustom {

    private final EntityManager entityManager;

    public ReportRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Report findCustomById(ReportId id) {
        return entityManager.find(Report.class, id.getId());
    }

    @Override
    public void saveCustom(Report report) {
        entityManager.merge(report);
    }
}