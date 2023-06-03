package com.ma;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAll 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mahesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select s from Bank s");
	
		
		List<Bank> banks = query.getResultList();
				
		for(Bank bank : banks)
		{
			System.out.println("Bank Id is : "+bank.getId());
			System.out.println("Bank Name is : "+bank.getName());
			System.out.println("Bank WebSite is : "+bank.getWebsite());
			System.out.println("Bank Phno is : "+bank.getPhno());
			System.out.println("Bank IFSC.NO is : "+bank.getIfscno());
			System.out.println("Bank NO.of Branches is : "+bank.getNobranch());
			System.out.println("BAnk Address : "+bank.getAddress());
			System.out.println("\n***********************************************\n");
		}
	}
}
