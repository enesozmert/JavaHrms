package kodlama.io.hrms.business.conretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlama.io.hrms.business.abstracts.JobPositionService;
import kodlama.io.hrms.dataAccess.abstracts.JobPositionDao;
import kodlama.io.hrms.entities.concretes.JobPosition;
import org.springframework.stereotype.Service;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;
	
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		// TODO Auto-generated method stub
		return jobPositionDao.findAll();
	}
	
}
