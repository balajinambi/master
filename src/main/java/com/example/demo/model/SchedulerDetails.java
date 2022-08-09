package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="scheduler_details")
public class SchedulerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name ="scheduler_name")
	private String schedulerName;
	@Column(name ="cron")
	private String cron;
	@Column(name ="enabled")
	private int enabled;
	@Column(name ="created")
	private String created;
	@Column(name ="last_updated")
	private String lastUpdated;
	@Column(name ="comment")
	private String comment;
	@Column(name ="previous_run_status")
	private String previousRunStatus;
	@Column(name ="previous_run_time")
	private String previousRunTime;
	@Column(name ="description")
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchedulerName() {
		return schedulerName;
	}

	public void setSchedulerName(String schedulerName) {
		this.schedulerName = schedulerName;
	}

	public String getCron() {
		return cron;
	}

	public void setCron(String cron) {
		this.cron = cron;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getPreviousRunStatus() {
		return previousRunStatus;
	}

	public void setPreviousRunStatus(String previousRunStatus) {
		this.previousRunStatus = previousRunStatus;
	}

	public String getPreviousRunTime() {
		return previousRunTime;
	}

	public void setPreviousRunTime(String previousRunTime) {
		this.previousRunTime = previousRunTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
