package br.com.cidade.lazystack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.cidade.lazystack.entity.CommentEntity;

@RepositoryRestResource(path="comment")
public interface CommentRepository extends JpaRepository<CommentEntity, Integer>{

}
