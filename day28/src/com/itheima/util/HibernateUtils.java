package com.itheima.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private  static final Configuration CONFIG;
	private  static final SessionFactory FACTORY;
	
	static {
		CONFIG = new Configuration().configure();
		FACTORY = CONFIG.buildSessionFactory();
	}
	
	public Session getSession() {
		return FACTORY.openSession();
	}

}
