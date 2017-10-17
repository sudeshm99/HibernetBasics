package com.test.DemoHibPro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien alienObj = new Alien();
        alienObj.setFName("sudesh");
        alienObj.setLName("madushanka");
        alienObj.setAge(24);
        alienObj.setAddress("Matara");
        alienObj.setNic("922252025V");
        alienObj.setId(1);

        
        Configuration conf = new Configuration();
        
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();// open session method give us session obj
        session.save(alienObj);
    }
}
