package com.fdmgroup.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int professorID;
	private String professorName;
	private String professorPassword;

	public Professor() {
		super();
	}

	public Professor(String professorName, String professorPassword) {
		super();
		this.professorName = professorName;
		this.professorPassword = professorPassword;
	}

	public int getProfessorID() {
		return professorID;
	}

	public void setProfessorID(int professorID) {
		this.professorID = professorID;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public String getProfessorPassword() {
		return professorPassword;
	}

	public void setProfessorPassword(String professorPassword) {
		this.professorPassword = professorPassword;
	}

	@Override
	public String toString() {
		return "Professor [professorID=" + professorID + ", professorName=" + professorName + ", professorPassword="
				+ professorPassword + "]";
	}

}
