package com.hibernate;
import javax.persistence.*;
@Entity
@Table
public class Employee {
	@Id
 private int eno;
 private String ename;
 private double salary;
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String toString()
{
	return eno+" "+ename+" "+salary;
}
 
}
