package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentCourseDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("megha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Divya");
		s1.setAge(20);
		s1.setYop(2022);

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Deep");
		s2.setAge(20);
		s2.setYop(2023);

		Course c1 = new Course();
		c1.setId(1);
		c1.setName("java");
		c1.setDuration("6 month");

		Course c2 = new Course();
		c2.setId(2);
		c2.setName("j2ee");
		c2.setDuration("2 month");
		
		List<Course> course=new ArrayList<Course>();
		course.add(c1);
		course.add(c2);
		
		List<Student> student= new ArrayList<Student>();
		student.add(s1);
		student.add(s2);
		
		s1.setCourse(course);
		s1.setCourse(course);
		
		c1.setStudents(student);
		c2.setStudents(student);
		
		et.begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(s1);
		em.persist(s2);
		et.commit();
		
		
		
		
		
	}

}
