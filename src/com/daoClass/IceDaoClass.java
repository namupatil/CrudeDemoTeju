package com.daoClass;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.daoInterface.IceDaoInterface;
import com.model.Icecreame;

@Repository
public class IceDaoClass implements IceDaoInterface{

	@Autowired
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveIcecreame(Icecreame icecreame) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(icecreame);
	}
}
