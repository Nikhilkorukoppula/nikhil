package com.hibernate;
import org.hibernate.*;
import java.util.*;
import org.hibernate.cfg.*;
public class EmployeeInsert {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		/*
		 * Employee e=new Employee(); 
		 * e.setEno(3);
		 *  e.setEname("mahesh");
		 * e.setSalary(16513.57);
		 *  s.save(e); 
		 *  t.commit(); 
		 *  s.close();
		 * System.out.println("successfully saved");
		 */
		//Method1
				/*Employee emp = new Employee();
				emp.setEno(111);
				s.delete(emp);*/
				//Method2
				/*Employee emp = (Employee) s.get(Employee.class,222);
				s.delete(emp);*/
				//Method3 - Deleting multiple persistent objects
				/*
				 * Query query = s.createQuery("from Employee where salary >= :salary");
				 * query.setParameter("salary",10000.0);
				 * 
				 * @SuppressWarnings("unchecked") 
				 * List<Employee> empList = query.list();
				 * for(Employee emp : empList) s.delete(emp);
				 */
		         
				  Query q=s.createQuery("from Employee");
				  @SuppressWarnings("unchecked")
				List<Employee> l=q.list();
				  for(Employee e:l) { 
					  System.out.println(e); 
					  }
				  s.save(l);
				 t.commit();
				 s.close();
				 
				/*
				 * Employee e=(Employee)s.get(Employee.class, 1); 
				 * e.setEname("nikhil");
				 *  Employee ee=(Employee)s.get(Employee.class, 2);
				 *   ee.setEname("nikki"); 
				 *   s.update(e);
				 * s.update(ee); 
				 * t.commit(); 
				 * s.close(); 
				 * System.out.println("updated");
				 */
	}

}
