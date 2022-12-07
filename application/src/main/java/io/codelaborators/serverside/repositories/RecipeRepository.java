package io.codelaborators.serverside.repositories;

import io.codelaborators.serverside.models.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    List<Recipe> findByMealType(String mealType);
}
