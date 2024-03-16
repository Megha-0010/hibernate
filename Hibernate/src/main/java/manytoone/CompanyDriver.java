package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("megha");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee employee1= new Employee();
		employee1.setName("Megha");
		employee1.setRole("dev");
		
		Employee employee2= new Employee();
		employee2.setName("Deepak");
		employee2.setRole("dev");
		
		Employee employee3= new Employee();
		employee3.setName("Maggie");
		employee3.setRole("dev");
		
		Company company =new Company();
		company.setName("Facebook");
		company.setCeo("Mark Zukarburg");
		
		employee1.setCompany(company);
		employee2.setCompany(company);
		employee3.setCompany(company);
		
		
		et.begin();
		em.persist(company);
		em.persist(employee1);
		em.persist(employee2);
		em.persist(employee3);
		et.commit();
		

	}

}
