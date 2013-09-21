// Salaried Employee concrete class extends abstract class Employee

public class SalariedEmployee extends Employee {
	
	private double weeklySalary;
	
	// four-argument constructor
	public SalariedEmployee(String first, String last, String ssn, double salary) {
		super(first, last, ssn); // calls Employee constructor
		setWeeklySalary(salary); // validate and store salary
		
	} // end constructor
	
	// set salary
	public void setWeeklySalary(double salary) {
		if(salary >= 0.0)
			weeklySalary = salary;
		else
			throw new IllegalArgumentException("Salary must be greater than 0.0");
			
		
	} // end setWeeklySalary
	
	
	// return salary
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	// calculate earnings. Override abstract method earnings in Employee
	@Override
	public double earnings() {
		return getWeeklySalary();
	
	} // end method earnings
	
	// return String representation of SalariedEmployee object
	@Override
	public String toString() {
		return String.format("Salaried Employee: %s\n%s: $%,.2f", super.toString(), 
				"weekly salary", getWeeklySalary());
	} // end method toString
	

} // end class SalariedEmployee
