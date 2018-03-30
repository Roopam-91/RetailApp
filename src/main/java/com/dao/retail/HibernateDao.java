package com.dao.retail;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class HibernateDao<T,id extends Serializable> implements RetailDao<T,id> {
	protected Session session;
	SessionFactory factory;
	public HibernateDao(){
	    factory= HibernateSessionFactory.getSessionFactory();
		session=factory.openSession();
	}
	protected Session getSession(){
		return session;
	}
	protected Session createNewSession(){
		session=factory.openSession();
		return session;
	}
	protected void cleanup(){
		session.close();
	}
}
