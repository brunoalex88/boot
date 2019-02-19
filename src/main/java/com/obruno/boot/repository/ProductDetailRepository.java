package com.obruno.boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.obruno.boot.entity.ProductDetail;

@Repository
public interface ProductDetailRepository extends CrudRepository<ProductDetail, Long> {
	
}
