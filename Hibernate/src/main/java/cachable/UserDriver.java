package cachable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("megha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		User u= new User();
		u.setName("Max");
		u.setEmail("max@gmail.com");
		u.setPassword("1234");
		
		et.begin();
		em.persist(u);
		et.commit();

	}

}
