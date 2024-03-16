package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StateDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("megha");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		State state=new State();
		state.setName("Nitish kumar");
		state.setCm("Bihar");
		
		MLA mla1=new MLA();
		mla1.setName("Nand kishor yadav");
		mla1.setAge(65);
		
		MLA mla2=new MLA();
		mla2.setName("Tej pratap yadav");
		mla2.setAge(35);
		
		List<MLA> mla=new ArrayList();
		mla.add(mla1);
		mla.add(mla2);
		
		state.setMla(mla);
		
		et.begin();
		em.persist(state);
		em.persist(mla1);
		em.persist(mla2);
		et.commit();
		
		
	}

}
