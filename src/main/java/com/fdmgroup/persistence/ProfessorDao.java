package com.fdmgroup.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.fdmgroup.model.Professor;

public class ProfessorDao {

	private EntityManagerFactory emf;
	private EntityManager em;

	public ProfessorDao() {
		emf = Persistence.createEntityManagerFactory("users");
		em = emf.createEntityManager();
	}

	public boolean create(Professor professor) {

		em.getTransaction().begin();
		em.persist(professor);
		em.getTransaction().commit();
		return true;
	}

	public Professor read(String input) {

		Query query = em.createQuery("SELECT u FROM Professor u WHERE u.professorName LIKE :professorName",
				Professor.class);
		query.setParameter("professorName", input);
		List<Professor> returned = query.getResultList();

		if (returned.size() == 1) {
			Professor lastMatched = null;
			for (Professor professor : returned) {
				lastMatched = professor;
			}
			return lastMatched;
		}
		return null;
	}

	public boolean delete(int input) {
		Professor prof = em.find(Professor.class, input);
		em.getTransaction().begin();
		em.remove(prof);
		em.getTransaction().commit();
		return true;

	}

}
