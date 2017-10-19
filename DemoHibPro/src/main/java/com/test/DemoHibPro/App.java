package com.test.DemoHibPro;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AlienBeen alienObj = new AlienBeen();
        alienObj.setFName("sudesh");
        alienObj.setLName("madushanka");
        alienObj.setAge(24);
        alienObj.setAddress("Matara");
        alienObj.setNic("922252025V");
        alienObj.setId(1);

        
        Configuration conf = new Configuration().configure().addAnnotatedClass(AlienBeen.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();// open session method give us session obj
        Transaction tx = (Transaction) session.beginTransaction();
        session.save(alienObj);
        tx.commit();
    }
}
