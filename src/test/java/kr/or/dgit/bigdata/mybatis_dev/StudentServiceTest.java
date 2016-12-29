package kr.or.dgit.bigdata.mybatis_dev;

import java.util.Map;
import java.util.Map.Entry;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import kr.or.dgit.bigdata.mybatis_dev.dto.Student;
import kr.or.dgit.bigdata.mybatis_dev.service.StudentService;

public class StudentServiceTest {
	private static StudentService studentService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = StudentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	@Test
	public void testFindStudentById() {
		Student student = studentService.findStudentById(1);
		Assert.assertNotNull(student);
	}

	/*
	 * @Test public void testInsertStudent() { Calendar cal =
	 * Calendar.getInstance(); cal.clear(); cal.set(1980, 0, 1); Student insStd
	 * = new Student(); insStd.setStudId(4); insStd.setName("박경아");
	 * insStd.setEmail("pga@gmail.com"); insStd.setPhone(new
	 * PhoneNumber("010-2344-1244")); insStd.setDob(new Date());
	 * 
	 * int result = studentService.insertStudent(insStd); System.out.printf(
	 * "testInsertStudent %s : result %d%n", insStd, result);
	 * Assert.assertSame(1, result); }
	 */

	/*
	 * @Test public void testInsertStudentAutoInc() { Calendar cal =
	 * Calendar.getInstance(); cal.clear(); cal.set(1980, 0, 1); Student insStd
	 * = new Student(); insStd.setName("박경아2");
	 * insStd.setEmail("pka@gmail.com"); insStd.setPhone(new
	 * PhoneNumber("010-2442-1424")); insStd.setDob(new Date());
	 * 
	 * int result = studentService.insertStudent(insStd); System.out.printf(
	 * "testInsertStudent %s : result %d%n", insStd, result);
	 * Assert.assertSame(1, result); }
	 */

	/*
	 * @Test public void testupdateStudent() { Calendar cal =
	 * Calendar.getInstance(); cal.clear(); cal.set(2016,12,29); Student insStd
	 * = new Student(); insStd.setStudId(6); insStd.setName("김태희");
	 * insStd.setEmail("kth@gmail.com"); insStd.setPhone(new
	 * PhoneNumber("010-4584-4175")); insStd.setDob(new Date());
	 * 
	 * int result = studentService.updateStudent(insStd); System.out.printf(
	 * "testInsertStudent %s : result %d%n", insStd, result);
	 * Assert.assertSame(1, result);
	 * 
	 * insStd.setEmail("kth@gmail.com"); insStd.setPhone(new
	 * PhoneNumber("010-2151-1248")); result =
	 * studentService.updateStudent(insStd); Assert.assertSame(1, result); }
	 */

/*	@Test
	public void testdeleteStudent() {
		int deleteStudent = studentService.deleteStudent(5);
		Assert.assertSame(1, deleteStudent);
	}*/

/*	@Test
	public void testFindAllStudents() {
		
	}

	@Test
	public void testFindAllStudentByIdForMap() {
		Map<String, Object> stdmap = studentService.findStudentByIdForMap(1);

		Assert.assertNotNull(stdmap);

		for (Entry<String, Object> entry : stdmap.entrySet()) {
			System.out.printf("key : %s - value : %s%n", entry.getKey(),entry.getValue());
		}
	}*/
	
	@Test
	public void testSelectStudentWithAddress() {
		Student std = studentService.selectStudentWithAddress(1);
		Assert.assertNotNull(std);
	}
}
