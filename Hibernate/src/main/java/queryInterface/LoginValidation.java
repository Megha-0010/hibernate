package queryInterface;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cachable.User;

public class LoginValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email : ");
		String email=sc.next();
		
		System.out.println("Enter password : ");
		String password=sc.next();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("megha");
		EntityManager em = emf.createEntityManager();
		Query q=em.createQuery("select u from User u where u.email=?1 and u.password=?2"); 
		q.setParameter(1, email);
		q.setParameter(2, password);
		
		try {
			User u=(User)q.getSingleResult();
			System.out.println("Login SuccessFull---- WELCOME");
		}
		catch(NoResultException e){
			System.out.println("invalid credential");
			
		}
		
	}

}
