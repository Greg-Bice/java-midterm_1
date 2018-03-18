package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Student_Test {
	
	static ArrayList<Course> courseList = new ArrayList<Course>();
	static ArrayList<Semester> semesterList = new ArrayList<Semester>();

	@BeforeClass
	public static void setup() {	
		
		
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}