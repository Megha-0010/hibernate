 package hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMultipleData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("megha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			
			Student s = new Student();

			
			System.out.println("Enter id :");
			int id = sc.nextInt();

			System.out.println("Enter name :");
			String name = sc.next();

			System.out.println("Enter Age :");
			int age = sc.nextInt();

			s.setId(id);
			s.setName(name);
			s.setAge(age);

			et.begin();
			em.persist(s);
			et.commit();
		}

		System.out.println("data saved successfully");
	}
}
