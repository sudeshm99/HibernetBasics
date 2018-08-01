package com.demo.pack.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.pack.entity.Student;

public class PrimaryKeyDemo {
	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();	
		// create session 
		Session session = factory.getCurrentSession();
		
		try{
			// save the data using session
			// create 3 student object
			Student studentOne = new Student("first","one","one@gmail.com");
			Student studentTwo = new Student("second","two","two@gmail.com");
			Student studentTree = new Student("therd","tree","tree@gmail.com");
			System.out.println("starting transaction");
			// start a transaction 
			session.beginTransaction();
			// save 3 student object
			System.out.println("save student");
			session.save(studentOne);
			session.save(studentTwo);
			session.save(studentTree);
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
