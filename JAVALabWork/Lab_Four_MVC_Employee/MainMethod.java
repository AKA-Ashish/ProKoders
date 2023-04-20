package Lab_Four_MVC_Employee;

public class MainMethod {
 public static void main(String[] args) {

  Employee_Model emp_model = new Employee_Model();
  Employee_View emp_view = new Employee_View();
  Employee_Controller emp_controller = new Employee_Controller(emp_model, emp_view);

  emp_controller.set_Employee_Name("Ice Cube");
  emp_controller.set_Employee_Age(32);
  emp_controller.set_Employee_Job("Rapper");

  emp_controller.send_data_to_View();
 }
}
