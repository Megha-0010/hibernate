package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("megha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hospital hospital=new Hospital();
		hospital.setName("Aster");
		hospital.setCeo("bbbbbb");
		hospital.setDateOfEstablishment("11-10-2001");
		
		Branch branch1=new Branch();
		branch1.setManager("Priya");
		branch1.setAddress("Marathalli");
		branch1.setPincode(560017);
		
		Branch branch2=new Branch();
		branch2.setManager("Anjali");
		branch2.setAddress("ACES layout");
		branch2.setPincode(560015);
		
		

		List<Branch> branch=new ArrayList<>();
		branch.add(branch1);
		branch.add(branch2);
		
		hospital.setBranch(branch);
		
		et.begin();
		em.persist(hospital);
		
		et.commit();
		
		

	}

}
