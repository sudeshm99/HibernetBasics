package com.demo.pack.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.pack.entity.Student;

public class CreateStudentDemo {

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
			// create a student object
			Student studentOne = new Student("sud","madushanka","sud@gmail.com");
			System.out.println("starting transaction");
			// start a transaction 
			session.beginTransaction();
			// save the student object
			System.out.println("save student");
			session.save(studentOne);
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
