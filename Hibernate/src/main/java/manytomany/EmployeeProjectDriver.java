package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeProjectDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("megha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee emp1=new Employee();
		emp1.setId(1);
		emp1.setName("Rohan");
		emp1.setRole("Tester");
		
		Employee emp2=new Employee();
		emp2.setId(2);
		emp2.setName("Ragini");
		emp2.setRole("Dev");
		
		Project project1= new Project();
		project1.setId(1);
		project1.setName("Foodapp");
		project1.setDuration("2 months");
		project1.setGroupsize(2);
		
		Project project2= new Project();
		project2.setId(2);
		project2.setName("Rapido");
		project2.setDuration("3 months");
		project2.setGroupsize(2);
		
		List<Project> project=new ArrayList<Project>();
		project.add(project1);
		project.add(project2);
		
		List<Employee> employee=new ArrayList<Employee>();
		employee.add(emp1);
		employee.add(emp2);
		
		emp1.setProject(project);
		emp2.setProject(project);
		
		project1.setEmployee(employee);
		project2.setEmployee(employee);
		
		et.begin();
		em.persist(emp1);
		em.persist(emp2);
		em.persist(project1);
		em.persist(project2);
		et.commit();
		
		
		
	}

}
