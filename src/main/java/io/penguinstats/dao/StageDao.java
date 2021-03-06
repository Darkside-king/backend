package io.penguinstats.dao;

import io.penguinstats.model.Stage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StageDao extends MongoRepository<Stage, String> {

	Stage findByStageId(String stageId);

	List<Stage> findStagesByZoneId(String zoneId);

}
