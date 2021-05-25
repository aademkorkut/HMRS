package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.entities.concretes.JobPosition;

@Service
public interface JobPositionService {

	List<JobPosition> getAll();
}
