package hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDataDynamically {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("megha");
		EntityManager em = emf.createEntityManager();

		Scanner  sc= new Scanner(System.in);
		
		System.out.println("Enter id : ");
		int id= sc.nextInt();
		
		Student s = em.find(Student.class, id);
		
		if(s==null) {
			System.out.println("Data not available");
		}
		else {
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAge());
	
		}
	}

}
