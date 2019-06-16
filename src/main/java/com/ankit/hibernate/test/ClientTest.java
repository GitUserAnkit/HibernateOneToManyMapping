package com.ankit.hibernate.test;

import java.util.HashSet;
import java.util.Set;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ankit.hibernate.pojo.Actor;
import com.ankit.hibernate.pojo.Movies;

public class ClientTest {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("com/ankit/hibernate/cfg/hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Actor actor = new Actor();
		actor.setActorId(101);
		actor.setActorName("Aamir");
	    //create movies 1
		Movies movies=new Movies();
		movies.setMovieId(101);
		movies.setMovieName("lagan");
		//create movies 2
		Movies movies1=new Movies();
		movies1.setMovieId(102);
		movies1.setMovieName("pk");
		Set<Movies> set=new HashSet<>();
		set.add(movies);
		set.add(movies1);
		//add the set in actor
		actor.setMovie(set);
		session.save(movies);
		session.save(movies1);
		//create actor
		actor.setActorName("Aamir");
		session.save(movies);
		session.save(movies1);
		session.save(actor);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
