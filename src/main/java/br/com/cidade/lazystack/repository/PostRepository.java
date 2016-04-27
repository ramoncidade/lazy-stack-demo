package br.com.cidade.lazystack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cidade.lazystack.entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Integer>{

}
