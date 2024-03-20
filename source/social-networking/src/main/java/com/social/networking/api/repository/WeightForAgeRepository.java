package com.social.networking.api.repository;

import com.social.networking.api.model.WeightForAge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WeightForAgeRepository extends JpaRepository<WeightForAge, Long>, JpaSpecificationExecutor<WeightForAge> {
}
