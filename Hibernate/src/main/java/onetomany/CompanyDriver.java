package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("megha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Company company = new Company();
		company.setName("Google");
		company.setCeo("S.P");

		Employee employee1 = new Employee();
		employee1.setName("megha");
		employee1.setRole("dev");

		Employee employee2 = new Employee();
		employee2.setName("priya");
		employee2.setRole("dev");
		
		
		
		List<Employee> employees=new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		
		company.setEmployees(employees);
		
		et.begin();
		em.persist(company);
		em.persist(employee1);
		em.persist(employee2);
		et.commit();
		
		
		
		
		
		
		

	}

}
