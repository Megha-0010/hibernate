package compositeKey;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AccountDriver {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("megha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		AccountComposite ac = new AccountComposite(12345, 456);
		AccountComposite ac1 = new AccountComposite(123456, 456);

		Account a = new Account();
		a.setId(1);
		a.setAc(ac);
		a.setBalance(1000);

		Account a1 = new Account();
		a1.setId(2);
		a1.setAc(ac1);
		a1.setBalance(2000);

		et.begin();
		em.persist(a);
		em.persist(a1);
		et.commit();

	}

}
