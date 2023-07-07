package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
@Id

private long id;
@Column(nullable = false)
private String marque;

private String description;
@Column(nullable = false)
private String cpu,carte;

private int ram;
@Column(nullable = false)
private double prix;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getCpu() {
	return cpu;
}
public void setCpu(String cpu) {
	this.cpu = cpu;
}
public String getCarte() {
	return carte;
}
public void setCarte(String carte) {
	this.carte = carte;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}

	
	
}
