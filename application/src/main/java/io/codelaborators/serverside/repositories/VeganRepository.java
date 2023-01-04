package io.codelaborators.serverside.repositories;

import io.codelaborators.serverside.models.Vegan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VeganRepository extends CrudRepository<Vegan, Long> {

        List<Vegan> findByDifficultyLevel(String difficultyLevel);

        List<Vegan> findByMealType(String mealType);

    }

