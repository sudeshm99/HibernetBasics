package com.demo.pack.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.pack.entity.Student;

public class RetrivingRecod {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();	
		// create session 
		Session session = factory.getCurrentSession();
		
		try{
			System.out.println("starting transaction");
			// start a transaction 
			session.beginTransaction();
			// save the student object
			System.out.println("save student");
			Student myStd = session.get(Student.class, 1);
			System.out.println("-------------------------------");
			System.out.println(myStd);
			System.out.println(myStd.getFirstName());
			System.out.println("-------------------------------");
			// commit transaction
			System.out.println("commit");
			session.getTransaction().commit();
			System.out.println("done");
		}catch(Exception ex){
			System.out.println("exception: "+ex);
		}finally{
			factory.close();
		}

	}

}
