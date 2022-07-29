package com.example.dao;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@Builder
@Entity
@Table(name = "user")
@Getter
@Setter

public class User {

	@Column(name = "name")
	private String name;
	@Column(name = "contact_number")
	private String contactNumber;
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	




}
