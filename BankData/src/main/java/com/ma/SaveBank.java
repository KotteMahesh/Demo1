package com.ma;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBank
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mahesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Bank bank = new Bank();
		bank.setName("Indian Overses Bank");
		bank.setWebsite("www.iob.com");
		bank.setPhno(1234567890l);
		bank.setIfscno("iob0003491");
		bank.setNobranch(200);
		bank.setAddress("sadum");
		
		Bank bank1 = new Bank();
		bank1.setName("AP Bank");
		bank1.setWebsite("www.apb.com");
		bank1.setPhno(2987654321l);
		bank1.setIfscno("apb0003541");
		bank1.setNobranch(200);
		bank1.setAddress("kalluru");
		
		Bank bank2 = new Bank();
		bank2.setName("Indian Bank");
		bank2.setWebsite("www.ioa.com");
		bank2.setPhno(1235557890l);
		bank2.setIfscno("ioa0003421");
		bank2.setNobranch(200);
		bank2.setAddress("sadum");
		
		Bank bank3 = new Bank();
		bank3.setName("Corporation Bank");
		bank3.setWebsite("www.cpb.com");
		bank3.setPhno(1235557822l);
		bank3.setIfscno("cpb0003942");
		bank3.setNobranch(200);
		bank3.setAddress("piler");
		
		entityTransaction.begin();
		entityManager.persist(bank);
		entityManager.persist(bank1);
		entityManager.persist(bank2);
		entityManager.persist(bank3);
		entityTransaction.commit();
	}

}
