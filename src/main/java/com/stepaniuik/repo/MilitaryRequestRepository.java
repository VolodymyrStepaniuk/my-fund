package com.stepaniuik.repo;

import com.stepaniuik.models.MilitaryRequest;
import org.springframework.data.repository.CrudRepository;

public interface MilitaryRequestRepository extends CrudRepository<MilitaryRequest, Long>{
    MilitaryRequest findByMilitaryUnitNumber(String militaryUnitNumber);
}
