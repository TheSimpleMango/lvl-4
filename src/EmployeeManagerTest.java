import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeManagerTest {
	Employee a = new Employee("Steve");
	Employee b = new Employee("Jim");
	Employee c = new Employee("Pam");
	Employee d = new Employee("Dwight");
	Employee e = new Employee("Andy");
	ArrayList<Employee> el;
	ArrayList<Employee> eltest1;
	ArrayList<Employee> eltest2;
	ArrayList<Employee> eltest3;
	ArrayList<Employee> eltest4;
	EmployeeManager em1;
	EmployeeManager em;

	@Test
	public void test() {
		el = new ArrayList<Employee>();
		el.add(a);
		el.add(b);
		el.add(c);
		eltest1 = new ArrayList<Employee>();
		eltest1.add(a);
		eltest1.add(b);
		eltest1.add(c);
		eltest2 = new ArrayList<Employee>();
		eltest2.add(a);
		eltest2.add(b);
		eltest2.add(c);
		eltest2.add(d);
		eltest3 = new ArrayList<Employee>();
		eltest3.add(a);
		eltest3.add(b);
		eltest3.add(c);
		eltest3.add(d);
		eltest3.add(e);
		eltest4 = new ArrayList<Employee>();
		eltest4.add(a);
		eltest4.add(b);
		eltest4.add(c);
		eltest4.add(e);
		em1 = new EmployeeManager();
		em = new EmployeeManager(el);
		assertEquals(eltest1, em.getEmployeeList());
		em.addEmployee(d);
		assertEquals(eltest2, em.getEmployeeList());
		em.addEmployee(e);
		assertEquals(eltest3, em.getEmployeeList());
		em.removeEmployee("Dwight");
		assertEquals(eltest4, em.getEmployeeList());
		em.removeEmployee(5);
		assertEquals(eltest1, em.getEmployeeList());
		assertEquals("Steve", em.searchByID(1));
		assertEquals(3, em.searchByName("Pam"));
	}
}
