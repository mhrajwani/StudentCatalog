package com.fdmgroup.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.fdmgroup.model.Student;

public class StudentDao {

	private EntityManagerFactory emf;
	private EntityManager em;

	public StudentDao() {

		emf = Persistence.createEntityManagerFactory("users");
		em = emf.createEntityManager();
	}

	public boolean create(Student student) {

		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		return true;
	}

	public List<Student> readFirstName(String input) {

		Query query = em.createQuery("SELECT u FROM Student u WHERE u.firstName LIKE :firstName", Student.class);
		query.setParameter("firstName", input);
		List<Student> returnedStudents = query.getResultList();
		return returnedStudents;

	}

	public List<Student> readLastName(String input) {

		Query query = em.createQuery("SELECT u FROM Student u WHERE u.lastName LIKE :lastName", Student.class);
		query.setParameter("lastName", input);
		List<Student> returnedStudents = query.getResultList();
		return returnedStudents;

	}

	public List<Student> readSSN(String input) {

		Query query = em.createQuery("SELECT u FROM Student u WHERE u.ssn LIKE :ssn", Student.class);
		query.setParameter("ssn", input);
		List<Student> returnedStudents = query.getResultList();
		return returnedStudents;

	}

	public boolean delete(int id) {
		Student student = em.find(Student.class, id);
		em.getTransaction().begin();
		em.remove(student);
		em.getTransaction().commit();
		return true;

	}

	public List<Student> readAll() {

		Query query = em.createQuery("SELECT u FROM Student u", Student.class);
		List<Student> returnedStudents = query.getResultList();
		return returnedStudents;

	}

}
