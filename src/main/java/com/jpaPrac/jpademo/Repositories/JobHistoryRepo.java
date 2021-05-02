package com.jpaPrac.jpademo.Repositories;

import com.jpaPrac.jpademo.Entities.JobHistory;
import com.jpaPrac.jpademo.Entities.JobIdentifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobHistoryRepo extends CrudRepository<JobHistory, JobIdentifier> {
}
