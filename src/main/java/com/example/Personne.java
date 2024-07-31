package com.example;

public class Personne {
	private String fistName;
	private String lastName;
	
	
	public Personne(String fistName, String lastName) {
		this.fistName = fistName;
		this.lastName = lastName;
	}
	public Personne() {
		// TODO Auto-generated constructor stub
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Personne [fistName=" + fistName + ", lastName=" + lastName + "]";
	}

	public String convertToJson() {
		// TODO Auto-generated method stub
		return null;
	} 
	
}
