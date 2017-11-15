package com.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.itheima.domain.Customer;

public class Demo {

	
	@Test
	public void run( ) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCust_name("ÀîËÄ");
		session.save(customer);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
