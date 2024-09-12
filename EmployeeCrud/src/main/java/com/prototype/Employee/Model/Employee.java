package com.prototype.Employee.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String position;
    private Double salary;
	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}
    
    // Getters and Setters
}
