package com.ibm.cloud.employeeevent.model;

public class Employee {

	private Long id;
	private Long organizationId;
	private Long departmentId;
	private String name;
	private int age;
	private String position;
	private String month;
	private String eventName;

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Employee() {

	}
	
	public Employee(Long organizationId, Long departmentId, String name, int age, String position, String month, String eventName) {
		this.organizationId = organizationId;
		this.departmentId = departmentId;
		this.name = name;
		this.age = age;
		this.position = position;
		this.month = month;
		this.eventName = eventName;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", organizationId=" + organizationId + ", departmentId=" + departmentId
				+ ", name=" + name + ", position=" + position + ", month=" + month + ", eventName=" + eventName + "]";
	}

}
