package in.codertechnolgies.batchschedule.DaoImpl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.codertechnolgies.batchschedule.Dao.StudentInformationDao;
@Repository
@Transactional
public class StudentInformationDaoImpl implements StudentInformationDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void saveStateMstService(StateMst stateMst) {
		sessionFactory.getCurrentSession().saveOrUpdate(stateMst);
	}
}
