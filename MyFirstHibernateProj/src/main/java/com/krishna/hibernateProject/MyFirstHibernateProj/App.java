package com.krishna.hibernateProject.MyFirstHibernateProj;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	private static SessionFactory factory;

	public static void main(String[] args) {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		App catspet = new App();

		/* Add few Cat records in database */
		Integer cat1 = catspet.addCat(1,"Zara", "Ali");
		Integer cat2 = catspet.addCat(2,"Daisy", "Das");
		Integer cat3 = catspet.addCat(3,"John", "Paul");

		/* List down all the Cats */
		catspet.listCats();

		/* Update Cat's records */
		catspet.updateCat(cat1, "tina");

		/* Delete an Cat from the database */
		catspet.deleteCat(cat2);

		/* List down new list of the Cats */
		catspet.listCats();
	}

	/* Method to CREATE an Cat in the database */
	public Integer addCat(int ID,String name, String owner) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer CatID = null;

		try {
			tx = session.beginTransaction();
			Cats Cat = new Cats(ID,name, owner);
			CatID = (Integer) session.save(Cat);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return CatID;
	}

	/* Method to READ all the Cats */
	public void listCats() {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			List Cats = session.createQuery("FROM Cats").list();
			for (Iterator iterator = Cats.iterator(); iterator.hasNext();) {
				Cats Cat = (Cats) iterator.next();
				System.out.print(" ID: " + Cat.getId());
				System.out.print("  Name: " + Cat.getName());
				System.out.println("  Owner: " + Cat.getOwner());
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* Method to UPDATE salary for an Cat */
	public void updateCat(Integer CatID, String owner) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Cats Cat = (Cats) session.get(Cats.class, CatID);
			Cat.setOwner(owner);
			session.update(Cat);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* Method to DELETE an Cat from the records */
	public void deleteCat(Integer CatID) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Cats Cat = (Cats) session.get(Cats.class, CatID);
			session.delete(Cat);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
