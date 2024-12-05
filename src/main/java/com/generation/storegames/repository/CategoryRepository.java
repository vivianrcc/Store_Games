package com.generation.storegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.storegames.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	public List<Category> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}
