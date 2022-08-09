package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SchedulerDetails;

public interface SchedulerRepository extends JpaRepository<SchedulerDetails, Integer> {
}
