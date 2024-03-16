package hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveProduct {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("megha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("enter id :");
		int id = sc.nextInt();
		
		System.out.println("Enter Brand :");
		String brand = sc.next();
		
		System.out.println("Enter type : ");
		String type = sc.next();
		
		System.out.println("Enter price : ");
		double price = sc.nextDouble();

		p.setId(id);
		p.setBrand(brand);
		p.setType(type);
		p.setPrice(price);

		et.begin();
		em.persist(p);
		et.commit();

		System.out.println("***Data saved successfully***");

	}

}
