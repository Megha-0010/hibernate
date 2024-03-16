package queryInterface;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate.Student;
import onetoone.Persons;

public class FetchDataOfPerson {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("megha");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select p  from Persons p ");
		List<Persons> person = q.getResultList();

		for (Persons p : person) {
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getAge());

			System.out.println("*******************");

		}

	}
}
