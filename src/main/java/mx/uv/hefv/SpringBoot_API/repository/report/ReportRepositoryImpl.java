package mx.uv.hefv.SpringBoot_API.repository.report;

import mx.uv.hefv.SpringBoot_API.jpa.UniqueIdGenerator;
import mx.uv.hefv.SpringBoot_API.model.report.ReportId;

import java.util.UUID;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ReportRepositoryImpl implements ReportRepositoryCustom {

     private final UniqueIdGenerator<UUID> generator;

    public ReportRepositoryImpl(UniqueIdGenerator<UUID> generator) {
        this.generator = generator;
    }

    @Override
    public ReportId nextId() {
        return new ReportId(generator.getNextUniqueId());
    }
}