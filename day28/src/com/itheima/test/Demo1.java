package com.itheima.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.SessionFactoryImpl;
import org.junit.Test;

import com.itheima.domain.Customer;


/**
 * 测试保存一个客户
 * @author SiVan
 *
 */
public class Demo1 {
	
	@Test
	public void testSave() {
		
		/*1.加载总配置文件:默认加载src目录下的hibernate.cfg.xml文件*/
		Configuration configuration = new Configuration().configure();
		/*2.创建SessionFactory对象，用来生产Session对象*/
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		/*3.创建Session对象(持久化对象)*/
		Session session = sessionFactory.openSession();
		/*4.开启事务*/
		Transaction transaction = session.beginTransaction();
		/*5.编写保存代码*/
		Customer customer = new Customer();
		customer.setCust_name("测试4");
		customer.setCust_level("2");
		customer.setCust_phone("110");
		/*保存客户*/
		session.save(customer);
		/*6.提交事务*/
		transaction.commit();
		/*7.释放资源*/
		session.close();
		sessionFactory.close();/*这里只是测试，因此释放sessionFactory*/
	}

}
