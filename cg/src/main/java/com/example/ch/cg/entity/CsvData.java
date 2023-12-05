package com.example.ch.cg.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CsvData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String column1;
    private String column2;
    // Add more columns as needed

    // Constructors

    public CsvData() {
        // Default constructor
    }

    public CsvData(String column1, String column2) {
        this.column1 = column1;
        this.column2 = column2;
        // Initialize other columns as needed
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    // Add getters and setters for other columns as needed
}