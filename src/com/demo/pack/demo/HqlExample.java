package com.demo.pack.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.pack.entity.Student;

public class HqlExample {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();	
		// create session 
		Session session = factory.getCurrentSession();
		//Session session2 = factory.getCurrentSession();
		
		try{
			System.out.println("starting transaction");
			// start a transaction 
			session.beginTransaction();
			//List<Student> stud1 = session.createQuery("from Student where id=1").getResultList();
			
			System.out.println("----------------------------");
					
			System.out.println("----------------------------");
			// commit transaction
			System.out.println("commit");
			session.getTransaction().commit();
			
			/*System.out.println("+++++++++++++++++++++++++++++");
			session2.beginTransaction();
			session2.createQuery("update Student set first_name=aaaa where id=1");
			session2.getTransaction().commit();
			System.out.println("+++++++++++++++++++++++++++++");*/
			System.out.println("done");
		}catch(Exception ex){
			System.out.println("exception: "+ex);
		}finally{
			factory.close();
		}

	}	

}
