package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("megha");
		EntityManager em = emf.createEntityManager();

		Student s = em.find(Student.class, 1);
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAge());
	}

}
