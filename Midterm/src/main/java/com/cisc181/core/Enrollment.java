package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	
	private double Grade;
	
	private Enrollment() { }
	public Enrollment( UUID uStuID, UUID uSecID ) {
		
		this.StudentID = uStuID;
		this.SectionID = uSecID;
		
		// There was not provided method for obtaining the Enrollment UUID.
		this.EnrollmentID = UUID.randomUUID(); 
		
	}
	
	public void setGrade( double grade ) {
	
		this.Grade = grade;
		
	}

}
