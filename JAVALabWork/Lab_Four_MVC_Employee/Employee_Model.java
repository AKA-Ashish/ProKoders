package Lab_Four_MVC_Employee;

class Employee_Model {

 // Employee Components
 private String Employee_Name = "NO-NAME";
 private int Employee_Age = 0;
 private String Employee_Job = "NO-JOB";

 // GETTER && SETTER METHODS

 // Employee NAMES
 public String get_Employee_Name() {
  return Employee_Name;
 }

 public void set_Employee_Name(String name) {
  this.Employee_Name = name;
 }

 // Employee AGE
 public int get_Employee_Age() {
  return Employee_Age;
 }

 public void set_Employee_Age(int age) {
  this.Employee_Age = age;
 }

 // Employee JOB
 public String get_Employee_Job() {
  return Employee_Job;
 }

 public void set_Employee_Job(String job) {
  this.Employee_Job = job;
 }
}
