package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	
	static ArrayList<Staff> staffList = new ArrayList<Staff>();

	@BeforeClass
	public static void setup() {
		
		Staff a = new Staff( eTitle.MR );
		Staff b = new Staff( eTitle.MRS );
		Staff c = new Staff( eTitle.MS );
		Staff d = new Staff( eTitle.MR );
		Staff e = new Staff( eTitle.MRS );
		
		a.setSalary( 5000 );
		b.setSalary( 10000 );
		c.setSalary( 15000 );
		d.setSalary( 20000 );
		e.setSalary( 25000 );
		
		staffList.add( a );
		staffList.add( b );
		staffList.add( c );
		staffList.add( d );
		staffList.add( e );
		
	}
	
	@Test
	public void test() {
		double avg = 0;
		for ( Staff s : staffList ) {
			avg += s.getSalary();
		}
		
		avg /= staffList.size();
		assertEquals(avg, 15000, 1 );
	}	

}
