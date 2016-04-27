package br.com.cidade.lazystack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.cidade.lazystack.entity.PostEntity;

@RepositoryRestResource(path="post")
public interface PostRepository extends JpaRepository<PostEntity, Integer>{

}
