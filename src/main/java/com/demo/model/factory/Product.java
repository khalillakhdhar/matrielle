package com.demo.model.factory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Product extends AuditModel {

	@Column(nullable = false)
	private String marque,description;
	
}
