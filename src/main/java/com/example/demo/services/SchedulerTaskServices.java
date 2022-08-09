package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SchedulerDetails;
import com.example.demo.repository.SchedulerRepository;

@Service
public class SchedulerTaskServices {

	//@Autowired
	//private SchedulerRepository repository;

	public List<SchedulerDetails> getTaskDeails() {
		//return repository.findAll();
		return List.of();
	}
}
