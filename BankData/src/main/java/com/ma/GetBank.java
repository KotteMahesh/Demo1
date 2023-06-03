package com.ma;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetBank 
{
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("mahesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Bank bank = entityManager.find(Bank.class,1);
		System.out.println("Bank Id is : "+bank.getId());
		System.out.println("Bank Name is : "+bank.getName());
		System.out.println("Bank WebSite is : "+bank.getWebsite());
		System.out.println("Bank Phno is : "+bank.getPhno());
		System.out.println("Bank IFSC.NO is : "+bank.getIfscno());
		System.out.println("Bank NO.of Branches is : "+bank.getNobranch());
		System.out.println("BAnk Address : "+bank.getAddress());
		System.out.println("\n***********************************************\n");
		
		Bank bank1 = entityManager.find(Bank.class,3);
		System.out.println("Bank Id is : "+bank1.getId());
		System.out.println("Bank Name is : "+bank1.getName());
		System.out.println("Bank WebSite is : "+bank1.getWebsite());
		System.out.println("Bank Phno is : "+bank1.getPhno());
		System.out.println("Bank IFSC.NO is : "+bank1.getIfscno());
		System.out.println("Bank NO.of Branches is : "+bank1.getNobranch());
		System.out.println("BAnk Address : "+bank1.getAddress());
		System.out.println("\n***********************************************\n");
		
		Bank bank2 = entityManager.find(Bank.class,2);
		System.out.println("Bank Id is : "+bank2.getId());
		System.out.println("Bank Name is : "+bank2.getName());
		System.out.println("Bank WebSite is : "+bank2.getWebsite());
		System.out.println("Bank Phno is : "+bank2.getPhno());
		System.out.println("Bank IFSC.NO is : "+bank2.getIfscno());
		System.out.println("Bank NO.of Branches is : "+bank2.getNobranch());
		System.out.println("BAnk Address : "+bank2.getAddress());
		System.out.println("\n***********************************************\n");
	}
}
