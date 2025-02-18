package org.example;

import org.example.Entity.Mobile;
import org.example.Entity.Model;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class App 
{
    public static void main( String[] args )
    {
        try {
            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
            SessionFactory factory = cfg.buildSessionFactory();


            //here model are created i.e child objects
            Model model1=new Model("Note 23",98000.0,"Andriod 15",6000);
            Model model2=new Model("GT6102",9000.0,"Andriod 12",3000);
            Model model3= new Model("S23",45000.0,"Andriod 14",5000);

            //hashset creation
            Set<Model> modelSet=new HashSet<>();

            // here creating mobile i,e parent
            Mobile mobile=new Mobile();
            //setting values to mobile
            mobile.setBrand("SAMSUNG");

            model1.setMobile(mobile);
            model2.setMobile(mobile);
            model3.setMobile(mobile);

            //adding objects into set
            modelSet.add(model1);
            modelSet.add(model2);
            modelSet.add(model3);
            mobile.setModelList(modelSet);

            Session session =factory.openSession();
            Transaction tx=session.beginTransaction();
            session.persist(mobile);
            System.out.println("Mobile is saved successfully!!!!!");
            tx.commit();
            session.close();
            factory.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
