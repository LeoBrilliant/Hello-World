package com.tocarrot.service;

import com.tocarrot.domain.News;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.type.StandardBasicTypes;

public class NewsManager {

	public void QueryNews()
	{
		Configuration conf = new Configuration().configure();
		
//		ServiceRegistryBuilder srb = new ServiceRegistryBuilder();
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
//		Session session = conf.buildSessionFactory(srb.buildServiceRegistry()).openSession();
		
		Transaction tx = session.beginTransaction();
		
		String sqlString = "select * from news_table ";
		
		List l = session.createSQLQuery(sqlString)
				.addScalar("id", StandardBasicTypes.STRING)
				.addScalar("title").addScalar("content").list();
		
		for( Iterator it = l.iterator(); it.hasNext(); )
		{
			Object[] row = (Object[])it.next();
			System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] );
		}
		
		tx.commit();
		
		session.close();
	} 
	
	public List EntityQuery()
	{
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		
		String sqlString = "select * from news_table ";
		
		List l = session.createSQLQuery(sqlString)
				.addEntity(News.class).list();

/*
		for( Iterator it = l.iterator(); it.hasNext(); )
		{
			News row = (News)it.next();
			System.out.println( row.getId() + "\t" + row.getTitle() + "\t" + row.getContent() );
		}
*/		
		tx.commit();
		
		session.close();
		
		return l;
	}
}
