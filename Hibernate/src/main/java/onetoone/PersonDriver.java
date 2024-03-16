package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("megha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Persons p = new Persons();
		p.setName("megha");
		p.setAge(26);

		Aadhar a = new Aadhar();
		a.setAadharNum(63323);
		a.setAddress("Murgeshpallaya");

		p.setAadhar(a); // to establish relatioship between two table.

		et.begin();
		em.persist(a);
		em.persist(p);
		et.commit();
	}

}
