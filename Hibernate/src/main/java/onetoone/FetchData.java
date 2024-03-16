package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("megha");
		EntityManager em = emf.createEntityManager();
		
		Citizen c=em.find(Citizen.class, 1);
		Pan p=c.getPan();
		System.out.println("PanId : "+p.getId());
		System.out.println("PanNumber : "+p.getPanNumber());
		System.out.println("Address : "+p.getAddress());
		
		
		Pan p1=em.find(Pan.class, 1);
		Citizen c1=p1.getCitizen();
		System.out.println("Citizen_id : "+c.getId());
		System.out.println("Citizen_name :"+c.getName());
		System.out.println("Citizen_age : "+c.getAge());
		
		
		
		
		
		
	}

}
