package com.demo.model.factory;

import jakarta.persistence.Entity;

@Entity
public class Bill extends AuditModel {
private String titre;
private String client;
}
