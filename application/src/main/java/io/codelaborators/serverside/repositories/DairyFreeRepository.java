package io.codelaborators.serverside.repositories;

import io.codelaborators.serverside.models.DairyFree;
import io.codelaborators.serverside.models.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DairyFreeRepository extends CrudRepository<DairyFree, Long> {
    List<DairyFree> findByMealType(String mealType);
}
