package com.itheima.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.SessionFactoryImpl;
import org.junit.Test;

import com.itheima.domain.Customer;


/**
 * ���Ա���һ���ͻ�
 * @author SiVan
 *
 */
public class Demo1 {
	
	@Test
	public void testSave() {
		
		/*1.�����������ļ�:Ĭ�ϼ���srcĿ¼�µ�hibernate.cfg.xml�ļ�*/
		Configuration configuration = new Configuration().configure();
		/*2.����SessionFactory������������Session����*/
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		/*3.����Session����(�־û�����)*/
		Session session = sessionFactory.openSession();
		/*4.��������*/
		Transaction transaction = session.beginTransaction();
		/*5.��д�������*/
		Customer customer = new Customer();
		customer.setCust_name("����4");
		customer.setCust_level("2");
		customer.setCust_phone("110");
		/*����ͻ�*/
		session.save(customer);
		/*6.�ύ����*/
		transaction.commit();
		/*7.�ͷ���Դ*/
		session.close();
		sessionFactory.close();/*����ֻ�ǲ��ԣ�����ͷ�sessionFactory*/
	}

}
