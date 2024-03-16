package cachable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("megha");
		EntityManager em = emf.createEntityManager();
		EntityManager em1 = emf.createEntityManager();
		
		em.find(User.class, 1);
		em.find(User.class, 2);
		
		em1.find(User.class,1);
		em1.find(User.class, 2);
		em1.find(User.class, 2);

	}

}
