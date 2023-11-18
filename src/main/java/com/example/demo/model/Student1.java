package com.example.demo.model;



import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="STUDENT1")
public class Student1 {
@Id
@SequenceGenerator(name="Student1_Sequence",sequenceName="Student1_Sequence",allocationSize=1)
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Student1_Sequence")
Long id;
@Nonnull
String name;
String college;
int percentage;

public Student1() {
	super();
}
public Student1(Long id, String name, String college, int percentage) {
	super();
	this.id = id;
	this.name = name;
	this.college = college;
	this.percentage = percentage;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
public int getPercentage() {
	return percentage;
}
public void setPercentage(int percentage) {
	this.percentage = percentage;
}


}
