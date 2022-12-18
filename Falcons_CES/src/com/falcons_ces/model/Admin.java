package com.falcons_ces.model;
import com.falcons_ces.model.Student;

public class  Admin {
    private String firstName;
    private String lastName;

    public Admin(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void enrollStudent(Student student, Program program) {
        program.addStudent(student);
        System.out.println(student.getFirstName() + " " + student.getLastName() + " has been enrolled in the " + program.getName() + " program.");
    }
}

    

   


