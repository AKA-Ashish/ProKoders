package Lab_Four_MVC_Employee;

public class Employee_Controller {

 Employee_Model model;
 Employee_View view;

 Employee_Controller(Employee_Model x_Employee_Model, Employee_View x_Employee_View) {
  this.model = x_Employee_Model;
  this.view = x_Employee_View;
 }

 // Employee NAMES
 public String get_Employee_Name() {
  return model.get_Employee_Name();
 }

 public void set_Employee_Name(String name) {
  model.set_Employee_Name(name);
 }

 // Employee AGE
 public int get_Employee_Age() {
  return model.get_Employee_Age();
 }

 public void set_Employee_Age(int age) {
  model.set_Employee_Age(age);
 }

 // Employee JOB
 public String get_Employee_Job() {
  return model.get_Employee_Job();
 }

 public void set_Employee_Job(String job) {
  model.set_Employee_Job(job);
 }

 public void send_data_to_View() {
  view.get_Employee_Details(get_Employee_Name(), get_Employee_Age(), get_Employee_Job());
 }
}
