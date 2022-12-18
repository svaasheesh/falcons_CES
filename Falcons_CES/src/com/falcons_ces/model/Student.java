package com.falcons_ces.model;

import java.util.ArrayList;
import java.util.List;
import com.falcons_ces.model.*;

public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private String major;
    private List<Test> tests;

    public Student(String firstName, String lastName, int id, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.major = major;
        this.tests = new ArrayList<>();
    }

    public void addTest(Test test) {
        this.tests.add(test);
    }
    
    
}
