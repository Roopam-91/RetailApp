package com.dao.retail;

import java.util.List;



import org.hibernate.query.Query;

import com.bean.retail.User;

public class HibernateUserDao extends HibernateDao<User, Integer>{

	@Override
	public void persist(User entity) {
		session.saveOrUpdate(entity);

	}

	@Override
	public User findById(Integer id) {
		User user=session.get(User.class, 1);
		return user;
	}

	@Override
	public List<User> findAll() {
		Query query = session.createQuery("from User");
        return (List<User>) query.getResultList();
	}

	@Override
	public User findByName(String name) {
		Query query = session.createQuery("from User where userName=:userName");
		query.setParameter("userName", "Roopam");
        return (User) query.uniqueResult();
	}

}
