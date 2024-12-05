package com.generation.storegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.storegames.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	public List<Product> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}
