package com.example.demo.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table (name="user")
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	
	@Column(name="email",length = 100,nullable = false,unique = false)
	private String email;
	
	@Column(name="password",length = 255,nullable = false,unique = false)
	private String password;
	
	

}

















