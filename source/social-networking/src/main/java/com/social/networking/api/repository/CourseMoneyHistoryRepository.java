package com.social.networking.api.repository;

import com.social.networking.api.model.CourseMoneyHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CourseMoneyHistoryRepository extends JpaRepository<CourseMoneyHistory, Long>, JpaSpecificationExecutor<CourseMoneyHistory> {
}
