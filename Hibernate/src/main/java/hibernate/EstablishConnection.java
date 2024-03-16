package hibernate;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EstablishConnection {
	public static void main(String[] args) {
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("megha");
		System.out.println("connection established");
	}

}
