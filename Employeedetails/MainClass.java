package FinalMockEmployeedetails;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class MainClass {
	public static void main(String[] args) throws IOException {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
	//------------------------ADDING OBJECT-----------------------
//		Employee s=new Employee();
//		s.setEName("Srujith");
//		s.setEphno(56787854387l);
//		s.setEDOB(LocalDate.of(1975, 01, 01));
//		FileInputStream fi=new FileInputStream("C:\\Users\\avina\\Downloads\\WhatsApp Image 2024-10-09 at 11.24.06 PM.jpeg");
//		byte[] array=new byte[fi.available()];
//		fi.read(array);
//		s.setEphoto(array);
//		
//		s.setEName("ith");
//		s.setEphno(56785854387l);
//		s.setEDOB(LocalDate.of(1576, 01, 01));
//		
//		s.setEName("Ajith");
//		s.setEphno(55855857677l);
//		s.setEDOB(LocalDate.of(1877, 01, 01));
//		
//		t.begin();
//		m.persist(s);
//		t.commit();
//		
//		
		//-----------------------fetching the object-----------------------------
//		Employee s1=m.find(Employee.class, 1);
//		System.out.println(s1.getId()+" "+s1.getEName()+" "+s1.getEphno()+" "+s1.getClass()+" "+s1.getEDOB()+" "+s1.getEphoto()+" "+s1.getObjectcreationTime()+" "+s1.getObjectcreationTime()+" ");
//		
		
//		//---------------------updating the object---------------------------
//		Employee s=m.find(Employee.class, 1);
//		s.setEName("ajit");
//		t.begin();
//		m.merge(s);
//		t.commit();
		
		//---------------------delete the object----------------
		Employee s1=m.find(Employee.class, 1);
		t.begin();
		m.remove(s1);
		t.commit();
		
	}
	}

` 