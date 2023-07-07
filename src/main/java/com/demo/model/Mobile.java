package com.demo.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.validation.constraints.Min;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Mobile {
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(unique = true)
	private String serie;

private int resolution,ram;
private String cpu;
@Min(value = 64)
private int ecran;

private double prix;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getSerie() {
	return serie;
}
public void setSerie(String serie) {
	this.serie = serie;
}
public int getResolution() {
	return resolution;
}
public void setResolution(int resolution) {
	this.resolution = resolution;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public String getCpu() {
	return cpu;
}
public void setCpu(String cpu) {
	this.cpu = cpu;
}
public int getEcran() {
	return ecran;
}
public void setEcran(int ecran) {
	this.ecran = ecran;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}

}
