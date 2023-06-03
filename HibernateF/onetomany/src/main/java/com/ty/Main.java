package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mahesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Mobile mobile = new Mobile();
				mobile.setName("Iphno");
				mobile.setColor("black");
				mobile.setRam("8gb");
				mobile.setCost(90000);
			
				Mobile mobile1 = new Mobile();
				mobile1.setName("oppo");
				mobile1.setColor("black");
				mobile1.setRam("6gb");
				mobile1.setCost(19000);
				
				Sim sim =new Sim();
				sim.setName("jio");
				sim.setType("4g");
				
				Sim sim1 =new Sim();
				sim1.setName("jio");
				sim1.setType("4g");
				
				Sim sim2 =new Sim();
				sim2.setName("jio");
				sim2.setType("4g");
				
				Sim sim3 =new Sim();
				sim3.setName("jio");
				sim3.setType("4g");
				
				List<Sim> list =new ArrayList<Sim>();
				list.add(sim3);
				list.add(sim2);
				
				List<Sim> list1 =new ArrayList<Sim>();
				list.add(sim);
				list.add(sim1);
				
				
				
			entityTransaction.begin();
			entityManager.persist(mobile);
			entityManager.persist(mobile1);
			entityManager.persist(sim);
			entityManager.persist(sim1);
			entityManager.persist(sim2);
			entityManager.persist(sim3);
			entityTransaction.commit();
	}
}
