package io.codelaborators.serverside.repositories;

import io.codelaborators.serverside.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
