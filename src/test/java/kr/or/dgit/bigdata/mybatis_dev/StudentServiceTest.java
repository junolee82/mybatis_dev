package kr.or.dgit.bigdata.mybatis_dev;

import java.util.Calendar;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.prism.impl.ps.CachingEllipseRep;

import junit.framework.Assert;
import kr.or.dgit.bigdata.mybatis_dev.dto.PhoneNumber;
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

	@Test
	public void testInsertStudent() {
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(1980, 0, 1);
		Student insStd = new Student();
		insStd.setStudId(4);
		insStd.setName("박경아");
		insStd.setEmail("pga@gmail.com");
		insStd.setPhone(new PhoneNumber("010-2344-1244"));
		insStd.setDob(new Date());
		
		int result = studentService.insertStudent(insStd);
		System.out.printf("testInsertStudent %s : result %d%n", insStd, result);
		Assert.assertSame(1, result);
	}
}
