- create folder - sweaty.dev
- npm install -g @angular/cli
- ng new 
- ng serve 
> Packages
 - CSS 
 - Analytics - Yes. 
- create folder for java service
- cd java service folder
- spring boot initializer 
- ```java -version```
> ``openjdk version "17.0.7" 2023-04-18 LTS``
> ``OpenJDK Runtime Environment Microsoft-7626293 (build 17.0.7+7-LTS)``
> ``OpenJDK 64-Bit Server VM Microsoft-7626293 (build 17.0.7+7-LTS, mixed mode, sharing)*``
- postgres install
 - pass
 - locale - BG 
- spring boot
> - create project in eclipse : 
```XML<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
			<exclusions>
				<exclusion>	
					<groupId>org.junit.vintage</groupId>
					<artifactId>junit-vintage-engine</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
	</dependencies>

- Create domain entity - Student.java
 - model package -> new -> class 'Employee.java' 
 ``package com.methcook.methacademy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// write @Entity then mouse-over and pick the "jakarta" persistence option for both 
@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	public Student() {
		
		
		//right-click > source > Generate a Constructor 
		super();
	}
	
	public Student(String firstName, String lastName, String email) { 
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	
	//right-click > Source > Generate Getters and Setters 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
``
- create spring data repository - EmployeeRepository.java
 - right click on [ ](../../../methacademy/src/main/java/com/methcook/methacademy/repository) > New > Interface  EmployeeRepository
 - extend it with jpa repository

- create rest controller - EmployeeController.java