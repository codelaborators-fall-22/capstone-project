package io.codelaborators.serverside.repositories;


import io.codelaborators.serverside.models.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {
}
