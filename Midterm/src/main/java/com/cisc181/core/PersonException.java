package com.cisc181.core;

public class PersonException extends Exception {
	
	private Person person;
	
	public PersonException( Person p, String msg ) {
		
		super( msg );
		this.setPerson( p );
		
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person p) {
		this.person = p;
	}
	
}
