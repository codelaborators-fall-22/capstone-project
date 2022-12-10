package io.codelaborators.serverside.repositories;

import io.codelaborators.serverside.models.GlutenFree;
import io.codelaborators.serverside.models.Recipe;
import org.springframework.data.repository.CrudRepository;


import java.util.Collection;
import java.util.List;

public interface GlutenFreeRepository extends CrudRepository<GlutenFree, Long> {
    List<GlutenFree> findByMealType(String mealType);
}
