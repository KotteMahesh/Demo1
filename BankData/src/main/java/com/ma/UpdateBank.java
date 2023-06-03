package com.ma;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateBank 
{
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mahesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Bank bank = entityManager.find(Bank.class,3);
		
		bank.setName("ICICI Bank");
		bank.setWebsite("www.icici.com");
		bank.setPhno(1235467890l);
		bank.setIfscno("ici0003421");
		bank.setNobranch(200);
		bank.setAddress("chittoor");
		
		entityTransaction.begin();
		entityManager.persist(bank);
		entityTransaction.commit();
	}
}
