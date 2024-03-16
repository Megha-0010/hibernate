package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CountryDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("megha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		
		Country c1=new Country();
		c1.setId(1);
		c1.setName("India");
		c1.setPopulation("145 crore");

		PrimeMinister primeMinister =new PrimeMinister();
		primeMinister.setId(1);
		primeMinister.setName("Narendra Modi");
		primeMinister.setAge(72);
		
		c1.setP(primeMinister);
		
		et.begin();
		em.persist(primeMinister);
		em.persist(c1);
		et.commit();
	}

}
