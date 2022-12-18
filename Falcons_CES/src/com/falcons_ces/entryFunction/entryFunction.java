package com.falcons_ces.entryFunction;
import java.util.ArrayList;
import java.util.List;
import com.falcons_ces.*;

public class entryFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Student s1 = new Student("John", "Doe", 123456, "Computer Science");
		        Student s2 = new Student("Jane", "Doe", 123457, "Computer Science");
		        Student s3 = new Student("Bob", "Smith", 123458, "Electrical Engineering");

		        Professor p1 = new Professor("Dr. Smith", "Computer Science");
		        Professor p2 = new Professor("Dr. Johnson", "Electrical Engineering");

		        Admin a1 = new Admin("Sally", "Jones");

		        Test t1 = new Test("Midterm", "Computer Science 101", p1);
		        Test t2 = new Test("Final", "Computer Science 101", p1);
		        Test t3 = new Test("Midterm", "Electrical Engineering 101", p2);
		        Test t4 = new Test("Final", "Electrical Engineering 101", p2);

		        Course c1 = new Course("Computer Science 101", p1, 3);
		        Course c2 = new Course("Electrical Engineering 101", p2, 4);

		        Program program = new Program("Computer Science");
		        program.addCourse(c1);
		        program.addCourse(c2);
				class Test {
				    private String name;
				    private


			}

		        s1.addTest(t1);
		        s1.addTest(t2);
		        s2.addTest(t1);
		        s2.addTest(t2);
		        s3.addTest(t3);
		        s3.addTest(t4);

		        a1.enrollStudent(s1, program);
		        a1.enrollStudent(s2, program);
		        a1.enrollStudent(s3, program);
		    }
		}

}
