// Employee abstract class

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	// 3 argument constructor
	public Employee(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}// end constructor
	
	// set first name
	public void setFirstName(String first) {
		firstName = first;
	}
	
	// get first name
	public String getFirstName() {
		return firstName;
	}
	
	// set last name
	public void setLastName(String last) {
		lastName = last;
	}
	
	// get last name
	public String getLastName() {
		return lastName;
	}
	
	// set social security number
	public void setSocialSecurityNumber(String ssn) {
		socialSecurityNumber = ssn;
	}
	
	// get social security number
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	// return String representation of Employee object
	@Override
	public String toString() {
		return String.format("%s %s\nsocial security number: %s", 
				getFirstName(), getLastName(), getSocialSecurityNumber());
	}
	
	
	// Abstract method overridden by concrete classes
	// We cannot calculate the earnings for a general Employee—we first must know the specific type of
	// Employee to determine the appropriate earnings calculation. By declaring this method
	// abstract, we indicate that each concrete subclass must provide an appropriate earnings
	// implementation and that a program will be able to use superclass Employee variables to
	// invoke method earnings polymorphically for any type of Employee
	public abstract double earnings(); // no implementation here
	
	
	

} // end abstract class Employee
