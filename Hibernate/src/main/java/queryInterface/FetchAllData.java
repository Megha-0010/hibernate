package queryInterface;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate.Student;

public class FetchAllData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("megha");
		EntityManager em=emf.createEntityManager();
	
		Query q =em.createQuery("select u  from Student u ");
		List<Student> user=q.getResultList();
		
		for(Student u: user) {
			System.out.println(u.getId());
			System.out.println(u.getName());
			System.out.println(u.getAge());
			//System.out.println(u.getPassowrd());
			
			System.out.println("*******************");
		}
		
		
		
		
	}

}
