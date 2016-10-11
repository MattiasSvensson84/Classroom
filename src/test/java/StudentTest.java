import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {
	
	Student st1 = new Student("Sara", "Larsson", 20, 'F');
	Student st2 = new Student("Malin", "Johansson", 40, 'F', 5.0, 2.0, 6.0);

	@Test
	public void testFirstGrade() {
		
		st1.setFirstGrade(6.0);
		boolean result = true;
		if (Math.round(st2.getFirstGrade()) == Math.round(6.0)){
			result = true;
		}
		else 
			result = false;
	
		assertTrue(st2.getFirstGrade() == 6.0);
		assertEquals(st2.getFirstGrade(), 6.0, 0.0001);
		assertEquals(Math.round(st2.getFirstGrade()), Math.round(6.0), 0.0001);
	}
	
	@Test
	public void testSecondGrade() {
		st2.setSecondGrade(5.0);
		//assertTrue(st2.getSecondGrade() == 5.0);
		assertEquals(st2.getSecondGrade(), 5.0, 0.0001);	
	}


}
