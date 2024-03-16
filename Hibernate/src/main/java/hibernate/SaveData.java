package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveData {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("megha");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s=new Student();
		s.setId(1);
		s.setName("Deep");
		s.setAge(27);
		
		et.begin();
		em.persist(s);
		et.commit();
		
	}

}
