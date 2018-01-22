package in.codertechnolgies.batchschedule.DaoImpl;

import java.util.List;



import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import hibernate.in.coderinfotech.batchschedule.StudentDetails;
import in.codertechnolgies.batchschedule.Dao.StudentInformationDao;
@Component
@Transactional
public class StudentInformationDaoImpl implements StudentInformationDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public StudentInformationDaoImpl() {
	}
	
	public List saveStateMstService() {
		List stateMstDOList  = sessionFactory.getCurrentSession().createCriteria(StudentDetails.class).list();
		return stateMstDOList;
	}
}
