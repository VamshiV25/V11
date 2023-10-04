package Inheritance;
public class TestEmp1 {
	  public static void main(String[] args) {
	        OfficeEmployee emp1 = new OfficeEmployee("John", 1, 20000, 3000, 4000, 2000);
	        emp1.calculateGrossSalary();
	        emp1.calculateNetSalary();
	        System.out.println("Office Employee Name: " + emp1.name);
	        System.out.println("Office Employee Gross Salary: " + emp1.grossSalary);
	        System.out.println("Office Employee Net Salary: " + emp1.netSalary);

	        FactoryEmployee emp2 = new FactoryEmployee("David", 2, 25000, 3000, 4000, 5000, 2000);
	        emp2.calculateGrossSalary();
	        emp2.calculateNetSalary();
	        System.out.println("Factory Employee Name: " + emp2.name);
	        System.out.println("Factory Employee Gross Salary: " + emp2.grossSalary);
	        System.out.println("Factory Employee Net Salary: " + emp2.netSalary);
	    }
}
	class Employee {
	    String name;
	    int id;
	    double basicSalary;
	    double grossSalary;
	    double netSalary;
	    double lessPF;

	    public Employee(String name, int id, double basicSalary) {
	        this.name = name;
	        this.id = id;
	        this.basicSalary = basicSalary;
	    }

	    public void calculateGrossSalary() {
	        grossSalary = basicSalary;
	    }

	    public void calculateNetSalary() {
	        netSalary = grossSalary - lessPF;
	    }
	}

	class OfficeEmployee extends Employee {
	    double HRA;
	    double DA;

	    public OfficeEmployee(String name, int id, double basicSalary, double HRA, double DA, double lessPF) {
	        super(name, id, basicSalary);
	        this.HRA = HRA;
	        this.DA = DA;
	        this.lessPF = lessPF;
	    }

	    public void calculateGrossSalary() {
	        grossSalary = basicSalary + HRA + DA;
	    }
	}

	class FactoryEmployee extends Employee {
	    double FA;
	    double MA;
	    double SA;

	    public FactoryEmployee(String name, int id, double basicSalary, double FA, double MA, double SA, double lessPF) {
	        super(name, id, basicSalary);
	        this.FA = FA;
	        this.MA = MA;
	        this.SA = SA;
	        this.lessPF = lessPF;
	    }

	    public void calculateGrossSalary() {
	        grossSalary = basicSalary + FA + MA + SA;
	}
}