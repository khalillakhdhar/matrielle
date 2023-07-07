package com.demo.model.factory;

import java.util.Date;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@MappedSuperclass
public abstract class AuditModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Temporal(TemporalType.TIMESTAMP) // format date+ heure
@Column(updatable = false,insertable = false)
@CreatedDate
private Date createdAt;
@Temporal(TemporalType.TIMESTAMP)
@UpdateTimestamp

private Date updatedAt;
	
}
