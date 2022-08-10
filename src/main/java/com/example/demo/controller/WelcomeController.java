package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SchedulerDetails;
import com.example.demo.services.SchedulerTaskServices;

@RestController
public class WelcomeController {
	private static final String WELCOME ="welcome" ;
	@Autowired
	private SchedulerTaskServices service;

	@GetMapping("/welcome")
	private String getWelcomeMsg() {
		return WELCOME;
	}

	@RequestMapping("/")
	public String home() {
		return WELCOME + " Hello Docker World !";
	}

	@GetMapping("/getTaskDetails")
	private List<SchedulerDetails> getTaskDetails() {
		return List.of();//service.getTaskDeails();
	}
}
