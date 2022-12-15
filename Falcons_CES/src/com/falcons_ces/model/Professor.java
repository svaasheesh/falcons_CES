package com.falcons_ces.model;

public class Professor {
	
	private int id;
    private String name;
    private String password;
    private String Number;
    
    Professor(int id, String name, String password){
    	this.id = id;
    	this.name = name;
    }
    
    public Professor(String name, String password) {
    	this.name = name;
    	this.password = password;
    }
    
    public int getId() {
    	return id;
    }
    
    public String getName() {
    	return name;
    }
    
    void setName(String name) {
    	this.name = name;
    }

    void setPassword(String password) {
    	this.password = password;   
    }
}
