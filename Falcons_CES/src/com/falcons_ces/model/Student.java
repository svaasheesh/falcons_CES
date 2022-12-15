package com.falcons_ces.model;

public class Student {
	
	private int id;
    private String name;
    private String password;
    private String number;

      Student(int id, String name, String password, String number){
    	this.id = id;
    	this.name = name;
    	this.number = number;
    }
    
    public Student(String name, String password, String number) {
    	this.name = name;
    	this.password = password;
    	this.number = number;
    }
    
    public int getId() {
    	return id;
    }
    
    public String getName() {
    	return name;
    }
    
    public String getNumber() {
    	return number;
    }
    
    void setName(String name) {
    	this.name = name;
    }

    void setPassword(String password) {
    	this.password = password;   
    }
    
    void setNumber(String number) {
    	this.number = number;
    }
    
}
