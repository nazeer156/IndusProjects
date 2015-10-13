package com.indus.persistance.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory = sessionFactory();

	public static SessionFactory sessionFactory() {
		try {
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			return sessionFactory;
		} catch (Throwable e) {

			System.out.println("SEESION FACTORY FAILED TO INITIALIZE" + e);

			throw new ExceptionInInitializerError(e);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
