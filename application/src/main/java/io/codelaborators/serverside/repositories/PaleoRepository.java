package io.codelaborators.serverside.repositories;

import io.codelaborators.serverside.models.Paleo;
import io.codelaborators.serverside.models.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaleoRepository extends CrudRepository<Paleo, Long> {
    List<Paleo> findByDifficultyLevel(String difficultyLevel);
}
