package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CitizenDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("megha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Citizen citizen = new Citizen();
		citizen.setName("Megha");
		citizen.setAge(26);

		Pan pan = new Pan();
		pan.setPanNumber("MFDs56987");
		pan.setAddress("HAL");

		citizen.setPan(pan);
		pan.setCitizen(citizen);

		et.begin();
		em.persist(pan);
		em.persist(citizen);
		et.commit();

	}

}
