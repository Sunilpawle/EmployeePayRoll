package PackageEmp;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner  = new Scanner(System.in);
    Employee emp = new Employee();
    
    emp.AddEmployee(14,"Kajol", 20000, 2000);
    emp.AddEmployee(15,"Anjali", 25000, 1500);
    emp.AddEmployee(16, "Neha", 43000, 7000);
    
   
    emp.showEmployees();
    
    scanner.close();
}

}
