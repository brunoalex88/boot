package com.obruno.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obruno.boot.entity.ProductDetail;
import com.obruno.boot.repository.ProductDetailRepository;

@RestController
@RequestMapping("/products")
public class ProductDetailController {
	
	private final ProductDetailRepository repository;
	
	@Autowired
	public ProductDetailController(ProductDetailRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public Iterable<ProductDetail> findAll() {
		return repository.findAll();
	}
	
	@PostMapping
	public ProductDetail create(@RequestBody ProductDetail productDetail) {
		return repository.save(productDetail);
	}
	
}
