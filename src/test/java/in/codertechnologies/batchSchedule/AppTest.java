package in.codertechnologies.batchSchedule;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.codertechnolgies.batchschedule.Dao.StudentInformationDao;
import in.codertechnolgies.batchschedule.DaoImpl.StudentInformationDaoImpl;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentInformationDao daoImpl = applicationContext.getBean(StudentInformationDao.class);
		System.out.println(daoImpl.saveStateMstService());
		
	}
}
