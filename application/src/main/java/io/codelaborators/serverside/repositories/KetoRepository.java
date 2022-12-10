package io.codelaborators.serverside.repositories;

import io.codelaborators.serverside.models.Keto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface KetoRepository extends CrudRepository<Keto, Long> {
    List<Keto> findByDifficultyLevel(String difficultyLevel);
}
