import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {
	
	Student st1 = new Student("Sara", "Larsson", 20, 'F');
	Student st2 = new Student("Malin", "Johansson", 40, 'F', 7.0, 2.0, 6.0);

	@Test
	public void testFirstGrade() {
		
		st2.setFirstGrade(6.0);
		/*
		boolean result;		
		if (Math.round(st2.getFirstGrade()) == Math.round(6.0)){
			result = true;
		}
		else {
			result = false;
		}*/
		assertEquals(st2.getFirstGrade(), 6.0, 0.0001);
		assertEquals(Math.round(st2.getFirstGrade()), Math.round(6.0), 0.0001);
	}
	
	@Test
	public void testSecondGrade() {
		st2.setSecondGrade(5.0);
		//assertTrue(st2.getSecondGrade() == 5.0);
		assertEquals(st2.getSecondGrade(), 5.0, 0.0001);	
	}
	
	@Test
	public void testThirdGrade(){
		st2.setThirdGrade(4.0);
		assertEquals(st2.getThirdGrade(), 4.0, 0.0001);
			
	}
	
	@Test 
	public void testCalculateAverageOneInParameter(){
		double tempAverage = 0.0;
		tempAverage= (st2.calculateAverage(7.0) );
		assertEquals(tempAverage, 5.0, 0.0001);
	}
	
	@Test 
	public void testCalculateAverageZeroInParameter(){
		double tempAverage = 0.0;
		tempAverage= (st2.calculateAverage() );
		assertEquals(tempAverage, 5.0, 0.0001);
	}
	
	@Test
	public void testCalculateAverageThreeInParameter(){
		
		double tempAverage = 0.0;
		tempAverage = (st2.calculateAverage(5.0, 5.0, 5.0));
		
		assertEquals(tempAverage, 5.0, 0.0001);
	}
	
	@Test
	public void testHasClearedTheCourseFalse(){
		
		assertFalse(st2.hasClearedTheCourse());	
	}
	
	@Test
	public void testHasClearedTheCourseTrue(){
		st2.setAverageGrade(6.0);
		assertTrue(st2.hasClearedTheCourse());	
	}

}
