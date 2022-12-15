package com.falcons_ces.model;

public class Admin {
	
	private int id;
    private String name;
    private String password;
    
    Admin(int id, String name, String password){
    	this.id = id;
    	this.name = name;
    }
    
    public Admin(String name, String password) {
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


    

   


