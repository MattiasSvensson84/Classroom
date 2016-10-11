import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {
	Person pp = new Person("Matte", "Sesso", 32, 'M');
	
	@Test
	public void testGetAge() {
		assertEquals(pp.getAge(), 32);	
	}
	
	@Test
	public void testGetSetAge(){
		pp.setAge(10);
		assertEquals(pp.getAge(), 10);
	}
	
	@Test
	public void testGetSetFirstName(){
		pp.setFirstName("Kalle");
		assertEquals(pp.getFirstName(), "Kalle");
	}
	
	@Test 
	public void testGetSetLastName(){
		pp.setLastName("Karlsson");
		assertEquals(pp.getLastName(), "Karlsson");
	}
	
	@Test
	public void testGetSetGender(){
		pp.setGender('F');
		assertEquals(pp.getGender(), 'F');
	}
}
